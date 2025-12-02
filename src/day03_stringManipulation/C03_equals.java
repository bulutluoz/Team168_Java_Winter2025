package day03_stringManipulation;

public class C03_equals {

    public static void main(String[] args) {

        // primitive data turlerinde karsilastirma operatoru == dir.
        // Ancak == string icin beklendigi gibi calismayabilir.....

        String str1 = "Bulut";
        String str2 = "Bulut";
        String str3 = "Bul" + "ut"; // Bulut
        String str4 = new String("Bulut");
        String str5 = "Bul";
        String str6 = "ut";
        String str7 = str5 + str6; // Bulut

        System.out.println(str1 == str2); // Bulut == Bulut  ==> true
        System.out.println(str1 == str3); // Bulut == Bulut  ==> true
        System.out.println(str1 == str4); // Bulut == Bulut  ==> false
        System.out.println(str1 == str7); // Bulut == Bulut  ==> false
        System.out.println(str1 == "Bulut"); // Bulut == Bulut  ==> true

        // SIMDILIK metinleri karsilastirmak icin == yerine equals()kullanmayi tercih edecegiz
        // equals() verilen iki metnin tamamen ayni olup olmadigini kontrol eder
        // harf farkliligi(buyuk kucuk harf farkliligi da dahil) veya
        // karakter sayisi farkli ise FALSE,
        // metinler TAMAMEN ayniysa TRUE verir

        System.out.println("=========");

        System.out.println(str1.equals(str2)); // "Bulut" equals "Bulut"  ==> true
        System.out.println(str1.equals(str3)); // "Bulut" equals "Bulut"  ==> true
        System.out.println(str1.equals(str4)); // "Bulut" equals "Bulut"  ==> true
        System.out.println(str1.equals(str7)); // "Bulut" equals "Bulut"  ==> true
        System.out.println(str1.equals("Bulut")); // "Bulut" equals "Bulut"  ==> true

        System.out.println("=========");
        System.out.println(str1.equals("BULUT")); // "Bulut" equals "BULUT"  ==> false
        System.out.println(str1.equals("Bulut ")); // "Bulut" equals "Bulut "  ==> false
        System.out.println(str1.equals("Bulutlar")); // "Bulut" equals "Bulutlar"  ==> false
        System.out.println(str1.equals("bulut")); // "Bulut" equals "bulut"  ==> false


    }
}
