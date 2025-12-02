package day03_stringManipulation;

import java.util.Scanner;

public class C02_charAt_length {

    public static void main(String[] args) {


        String metin = "Java gun gectikce guzellesiyor.";

        System.out.println(metin.charAt(0)); // J  ilk harfi verir

        System.out.println(metin.charAt(3));

        System.out.println(metin.charAt(7));

        System.out.println(metin.charAt(11));

        // charAt() method'u index kullanir
        // java'nin genelinde oldugu gibi index 0'dan baslar
        // NOT : bir karakterin metinde kacinci karakter oldugunu soylerken 1'den baslariz 2,3,4,5 diye devam ederiz
        //       AMMMAA java'dan bir karakteri istedigimizde index kullanacagimiz icin 0'dan baslariz ve 1,2,3 diye devam ederiz
        //       hata yapmamak icin sira mi yoksa index mi istendigine dikkat etmeliyiz


        // metnin bastan 10.karakterini yazdirin
        // index 9 olur
        System.out.println(metin.charAt(9)); // g


        // metin kac karakterden olusuyor
        System.out.println(metin.length()); // 31
        // length() metindeki karakter sayisini verir
        // dolayisiyla length() index KULLANMAZ


        // metnin 31 karakter oldugu bilindigine gore,
        // metnin son karakterini yazdirin

        System.out.println(metin.charAt(31-1)); // .
        // length karakter sayisi oldugundan index icin -1 yaptik

        // Java gun gectikce guzellesiyor.

        // metnin 31 karakter oldugu bilindigine gore,
        // metnin sondan 3 karakterini yazdirin

        System.out.println(metin.charAt(31-3)); // o


        // metnin 31 karakter oldugu bilindigine gore,
        // metnin sondan 7 karakterini yazdirin
        System.out.println(metin.charAt(31-7)); // e

        /*
            bastan 6.karakter dediginde index'e cevirmek icin 6-1 => charAt(5)
            sondan 6.karakter dediginde charAt(karakterSayisi - 6)
         */


        // Kullanicidan bir cumle isteyin
        // kullanicin girdigi metnin bastan ve sondan 1., 3. ve 5. karakterlerini yazdirin

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Lutfen bir cumle giriniz...");
//        String girilenMetin = scanner.nextLine();
//
//        System.out.println("Bastan 1. karakter : " + girilenMetin.charAt(0));
//        System.out.println("Bastan 3. karakter : " + girilenMetin.charAt(2));
//        System.out.println("Bastan 5. karakter : " + girilenMetin.charAt(4));
//
//        System.out.println("Sondan 1. karakter : " + girilenMetin.charAt( girilenMetin.length() - 1  ));
//        System.out.println("Sondan 3. karakter : " + girilenMetin.charAt( girilenMetin.length() - 3  ));
//        System.out.println("Sondan 5. karakter : " + girilenMetin.charAt( girilenMetin.length() - 5  ));

        // eger chartAt()'de length veya daha buyuk deger girilirse
        String isim = "Leyla";

        System.out.println(isim.length()); // 5

        // System.out.println(isim.charAt(5));
        // System.out.println(isim.charAt( isim.length()  ));

        // StringIndexOutOfBoundsException: String index out of range: 5
        // String icin verilen index, metnin sinirlarinin disinda

         // System.out.println(isim.charAt(7));
         // System.out.println(isim.charAt( isim.length() +2 ));


        // NOT : charAt() de kullanilacak en buyuk index son harfin de index'i olan
        //       length()-1 dir.
    }
}
