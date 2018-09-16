package ClassWork.Compiler;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InitializeException {
        String input = "x125:=123;x2:=5;x3:=x2+x125+12;a1:=x3;";
        Compiler compiler = new Compiler();
        compiler.analyse(input);
        ArrayList<Variable> arrayList = (ArrayList<Variable>) compiler.process(input);
        for (Variable v : arrayList) {
            System.out.print(v.toString());
        }
    }


    public static void printValues(ArrayList<Variable> array) {
        int size = array.size();
        for (int i = 0; i < size; i++) {
            System.out.println(array.get(i).getValue());
        }
    }
}
