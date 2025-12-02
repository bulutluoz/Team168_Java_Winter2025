package day04_forLoop;

import java.util.Scanner;

public class C08_KendiSubstringMethodumuz {

    public static void main(String[] args) {


        /*
            Kullanicidan alinan bir metinden
            kullanicinin girdigi baslangic ve bitis indexleri arasindaki kismi yazdirin

            Kurallar :
            1- eger baslangic veya bitis index'i negatif veya metnin sinirlari disinda ise hata verin
            2- baslangic index'i bitis index'inden buyukse hata mesaji verin
            3- baslangic indexindeki karakter dahil, bitis indexindeki karakter haric olmalidir

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");
        String girilenMetin = scanner.nextLine();

        System.out.println("Baslangic index'ini girin...");
        int basIndex = scanner.nextInt();

        System.out.println("Bitis index'ini girin...");
        int bitIndex = scanner.nextInt();

        if (basIndex<0 || bitIndex<0 || basIndex>=girilenMetin.length() || bitIndex>=girilenMetin.length()){
            //eger baslangic veya bitis index'i negatif veya metnin sinirlari disinda ise hata verin
            System.out.println("Girilen index'ler kullanilabilir sinirlarin disinda...");
        } else if (basIndex > bitIndex) {
            //baslangic index'i bitis index'inden buyukse hata mesaji verin
            System.out.println("Baslangic index'i bitis index'inden buyuk olamaz...");

        }else{
            for (int i = basIndex; i <bitIndex ; i++) {
                System.out.print(girilenMetin.charAt(i));
            }
        }
        System.out.println("");

        // Bu kodu yazmak mi daha kolay ve anlasilir
        // yoksa Java'nin hazirladigi substring ile

        System.out.println(girilenMetin.substring(basIndex,bitIndex));

    }
}
