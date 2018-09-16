package ClassWork.Compiler;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Compiler {


    public static void analyse(String input) {
        if (input.length() < 5) {
            throw new SyntaxException("Invalid syntax");
        }
        char[] charArray = input.toCharArray();
        int currentChar = 0, state = 0;
        while (currentChar < charArray.length && charArray.length > 5) {
            switch (state) {
                case 0:
                    if (Character.isLetter(charArray[currentChar])) {
                        currentChar++;
                        state = 1;
                    } else throw new SyntaxException("Invalid syntax");
                    break;
                case 1:
                    if (Character.isDigit(charArray[currentChar])) {
                        currentChar++;
                        break;
                    } else if (charArray[currentChar] == ':') {
                        currentChar++;
                        state = 2;
                    } else if (charArray[currentChar] == '+' || charArray[currentChar] == '-' || charArray[currentChar] == '*' || charArray[currentChar] == '/') {
                        currentChar++;
                        state = 3;
                    } else if (charArray[currentChar] == ';') {
                        currentChar++;
                        state = 0;
                    } else throw new SyntaxException("Invalid syntax");
                    break;
                case 2:
                    if (charArray[currentChar] == '=') {
                        state = 3;
                        currentChar++;
                    } else throw new SyntaxException("Invalid syntax");
                    break;
                case 3:
                    if (Character.isDigit(charArray[currentChar])) {
                        currentChar++;
                        state = 1;
                        break;
                    } else if (charArray[currentChar] == ';') {
                        currentChar++;
                        state = 0;
                    } else if (Character.isLetter(charArray[currentChar])) {
                        currentChar++;
                        state = 1;
                    } else throw new SyntaxException("Invalid syntax");
                    break;
            }
        }

    }

    public static List<Variable> process(String input) throws InitializeException {
        analyse(input);
        ArrayList<Variable> arrayList = new ArrayList<>();
        Map<String, Integer> hashMap = new HashMap<>();
        String[] string = input.split(";");
        for (int i = 0; i < string.length; i++) {
            String[] str = string[i].split(":=");
            String name = str[0];
            String stringValue = str[1];
            int value = 0;
            if (Character.isDigit(stringValue.charAt(0))) {
                value = Integer.parseInt(stringValue);
            } else if (stringValue.indexOf("+") > 0) {
                String[] variable = stringValue.split("\\+");
                if (!hashMap.containsKey(variable[0]) || !hashMap.containsKey(variable[1]))
                    throw new InitializeException("Variable initialization error");
                value = hashMap.get(variable[0]) + hashMap.get(variable[1]);
            } else if (stringValue.indexOf("-") > 0) {
                String[] variable = stringValue.split("-");
                if (!hashMap.containsKey(variable[0]) || !hashMap.containsKey(variable[1]))
                    throw new InitializeException("Variable initialization error");
                value = hashMap.get(variable[0]) - hashMap.get(variable[1]);
            } else if (stringValue.indexOf("*") > 0) {
                String[] variable = stringValue.split("\\*");
                if (!hashMap.containsKey(variable[0]) || !hashMap.containsKey(variable[1]))
                    throw new InitializeException("Variable initialization error");
                value = hashMap.get(variable[0]) * hashMap.get(variable[1]);
            } else if (stringValue.indexOf("/") > 0) {
                String[] variable = stringValue.split("/");
                if (!hashMap.containsKey(variable[0]) || !hashMap.containsKey(variable[1]))
                    throw new InitializeException("Variable initialization error");
                value = hashMap.get(variable[0]) / hashMap.get(variable[1]);
            } else if (Character.isLetter(stringValue.charAt(0))) {
                if (!hashMap.containsKey(stringValue))
                    throw new InitializeException("Variable initialization error");
                value = hashMap.get(stringValue);
            }
            hashMap.put(name, value);
            Variable variable = new Variable(name, value);
            arrayList.add(variable);
        }
        return arrayList;
    }
}