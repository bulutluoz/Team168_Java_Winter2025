package day06_staticKeywords;

public class C02_Runner {

    public static void main(String[] args) {

        // program geregi bir toyota corolla uretmemiz gerekiyor
        C01_Toyota toyota1 = new C01_Toyota();
        // 8.satir calisinca olusan toyota1 objesi
        // Toyota class'indaki tum variable ve method'lara otomatik olarak sahip olur

        System.out.println(toyota1.motor); // motor secilmedi
        System.out.println(toyota1.renk); // renk secilmedi
        System.out.println(toyota1.uretimYili); // 1900
        System.out.println(toyota1.yakit);  // yakit secilmedi

        System.out.println(toyota1.marka); // Toyota
        System.out.println(toyota1.model); // Corolla
        System.out.println(toyota1.uretimYeri); // Sakarya/Turkiye

        toyota1.motor = "2000 dizel";
        toyota1.renk = "Kirmizi";
        toyota1.uretimYili = 2020;
        toyota1.yakit = "Benzin";

        C01_Toyota toyota2 = new C01_Toyota();

        System.out.println(toyota2.yakit); // Yakit secilmedi
        System.out.println(toyota2.model); // Corolla

        System.out.println("=============");

        toyota2.renk = "Turuncu";
        toyota2.uretimYili = 2021;
        toyota2.yakit = "Dizel";

        System.out.println(toyota1.motor); // 2000 Dizel
        System.out.println(toyota1.renk); // Kirmizi
        System.out.println(toyota1.uretimYili); // 2020
        System.out.println(toyota1.yakit);  // Benzin

        System.out.println(toyota1.marka); // Toyota
        System.out.println(toyota1.model); // Corolla
        System.out.println(toyota1.uretimYeri); // Sakarya/Turkiye

        System.out.println(toyota2.motor); // Motor secilmedi
        System.out.println(toyota2.renk); // Turuncu
        System.out.println(toyota2.uretimYili); // 2021
        System.out.println(toyota2.yakit);  // Dizel

        System.out.println(toyota2.marka); // Toyota
        System.out.println(toyota2.model); // Corolla
        System.out.println(toyota2.uretimYeri); // Sakarya/Turkiye


        /*
         Yukarda goruldugu gibi,
         instance variable'lara obje uzerinden atama yapilabilir
         ve obje uzerinden atama yapildiginda SADECE O OBJENIN degerleri etkilenir
         C01_Toyota class'indaki instance variable'lar veya baska objelerin instance degerleri DEGISMEZ
         */

        /*
        Static variable'lara deger atamasi yapmak
        instance variable'lardan FARKLI OLUR
         */


        toyota1.model = "Yaris";

        System.out.println(C01_Toyota.model);// Yaris
        System.out.println(toyota1.model); // Yaris
        System.out.println(toyota2.model); // Yaris


        // 3.bir obje olusturalim
        C01_Toyota toyota3 = new C01_Toyota();

        toyota3.yakit = "Elektrik";
        toyota3.renk = "beyaz";
        toyota3.uretimYeri = "japonya";


        System.out.println(toyota1.yakit);// Benzin
        System.out.println(toyota2.yakit);// Dizel
        System.out.println(toyota3.yakit); // Elektrik

        System.out.println(toyota1.renk); // Kirmizi
        System.out.println(toyota2.renk); // Turuncu
        System.out.println(toyota3.renk); // Beyaz

        System.out.println(toyota1.uretimYeri); // Japonya
        System.out.println(toyota2.uretimYeri); // Japonya
        System.out.println(toyota3.uretimYeri); // Japonya


        System.out.println(toyota1.model); // Yaris
        System.out.println(toyota2.model); // Yaris
        System.out.println(toyota3.model); // Yaris




















    }
}
