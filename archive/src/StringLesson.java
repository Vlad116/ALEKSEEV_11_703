import java.util.Scanner;


public class StringLesson {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String line = scanner.nextLine();
        System.out.println(line);
        char[] CharArray = {'I', 'T', 'I', 'S'};
        String string = new String(CharArray);
        String I = "ITIS";
        String B = I;
        System.out.println(string + "\n");
        String unicode = "\u0101\u2134\u0095";
        System.out.println(unicode);
        System.out.println(string == I);
        System.out.println(I == B);
        System.out.println(string.equals(I));
        System.out.println(string.compareTo(I));
        String str = "Adis-abeba";
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.charAt(0) + "\n");
        System.out.println(str.contains("..."));
        String Name = "Vladislav";
        String SecondName = "Alekseev";
        String FullName = Name + " " + SecondName;
        System.out.println(Name);
        System.out.println(SecondName);
        System.out.println(FullName);
        String s = new String("ssssss");
        System.out.println(s);
        s.concat("-aaa");
        String a = s.concat("-aaa");
        System.out.println(s);
        System.out.println(a);
        String st = "pondexter";

        for (int i = 1; i <= st.length(); i++) {
            System.out.print(st.charAt(st.length() - i));
        }
    }
}
