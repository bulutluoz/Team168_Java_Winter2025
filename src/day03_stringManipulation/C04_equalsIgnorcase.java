package day03_stringManipulation;

public class C04_equalsIgnorcase {

    public static void main(String[] args) {


        // equals() ile benzer isleve sahiptir
        // ancak equals()'dan farkli olarak
        // metinler ayni ise BUYUK KUCUK HARF farkliliklarini ignore eder(gormezden gelir)

        String str1 = "Bulut";
        String str2 = "BULUT";
        String str3 = "bulut";
        String str4 = "BuLuT";
        String str5 = "BULut";

        System.out.println(str1.equals(str2)); // "Bulut" equals "BULUT" ==> false
        System.out.println(str1.equals(str3)); // "Bulut" equals "bulut" ==> false
        System.out.println(str1.equals(str4)); // "Bulut" equals "BuLuT" ==> false
        System.out.println(str1.equals(str5)); // "Bulut" equals "BULut" ==> false

        System.out.println("=========");

        System.out.println(str1.equalsIgnoreCase(str2)); // "Bulut" equalsIgnoreCase "BULUT" ==> true
        System.out.println(str1.equalsIgnoreCase(str3)); // "Bulut" equalsIgnoreCase "bulut" ==> true
        System.out.println(str1.equalsIgnoreCase(str4)); // "Bulut" equalsIgnoreCase "BuLuT" ==> true
        System.out.println(str1.equalsIgnoreCase(str5)); // "Bulut" equalsIgnoreCase "BULut" ==> true


        System.out.println("=========");

        System.out.println(str1.equalsIgnoreCase("Bulat")); // "Bulut" equalsIgnoreCase "Bulat" ==> false
        System.out.println(str1.equalsIgnoreCase("Bulut ")); // "Bulut" equalsIgnoreCase "Bulut " ==> false
        System.out.println(str1.equalsIgnoreCase("Buluta")); // "Bulut" equalsIgnoreCase "Buluta" ==> false
        System.out.println(str1.equalsIgnoreCase("Bul ut")); // "Bulut" equalsIgnoreCase "Bul ut" ==> false

    }
}
