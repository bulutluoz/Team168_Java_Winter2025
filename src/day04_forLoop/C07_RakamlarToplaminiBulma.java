package day04_forLoop;

import java.util.Scanner;

public class C07_RakamlarToplaminiBulma {

    public static void main(String[] args) {

        // Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz...");
        int girilenSayi = scanner.nextInt();


        int birlerBasamgindakiRakam = 0;
        int rakamlarToplami = 0;
        int sayi = girilenSayi;

        // Asagidaki 3 adimi, basamak sayisi kadar tekrar etmeliyiz
        // once basamak sayisini bulalim

        // 345, 8978, 56781, 9, 29
        int basamakSayisi = (sayi + "").length();


        for (int i = 1; i <=basamakSayisi ; i++) {
            birlerBasamgindakiRakam = sayi % 10;

            rakamlarToplami = rakamlarToplami + birlerBasamgindakiRakam;

            sayi = sayi / 10;
        }

        System.out.println("Girilen " + girilenSayi + " sayisinin rakamlar toplami : " + rakamlarToplami);



    }
}
