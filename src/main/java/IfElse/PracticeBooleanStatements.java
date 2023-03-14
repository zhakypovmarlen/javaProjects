package IfElse;

public class PracticeBooleanStatements {
    public static void main(String[] args) {

        boolean a = 5 > 5;
        System.out.println(a);
        boolean b = 10 != 5;
        System.out.println(b);
        boolean c = 150 == 100;
        System.out.println(c);

        String str1 = "banana";
        System.out.println(str1.startsWith("A"));

        String str2 = "apple";
        boolean str21 = str2.endsWith("a");
        System.out.println(str21);

        String str3 = "laptop";
        boolean str31 = str3.contains("lap");
        System.out.println(str31);

        String str4 = "";
        boolean str41 = str4.isEmpty();
        System.out.println(str41);

        String str5 = "mobile";
        boolean str51 = str5 == str5.toUpperCase();
        System.out.println(str51);

        String str6 = "HOME";
        boolean str61 = str6.equals(str5);
        System.out.println(str61);

        String str7 = "Work";
        boolean str71 = str7.length() == 4;
        System.out.println(str71);









    }
}
