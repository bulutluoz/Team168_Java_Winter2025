package day04_forLoop;

import java.util.Scanner;

public class C05_TersMetniKaydetme {
    public static void main(String[] args) {

        // Kullanicidan bir String isteyin ve String’i tersine cevirip kaydedin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Istediginiz bir metni girin");
        String metin = scanner.nextLine();

        // Ali topu at.

        String tersMetin = "";

        for (int i = metin.length()-1 ; i >=0 ; i--) {

            tersMetin += metin.charAt(i);

        }

        // ters metni gormek isterseniz
        System.out.println("metnin tersten yazilisi : " + tersMetin);


        // girilen metnin bir palindrome olup olmadigini yazdirin
        // palindrome duz yazilisi ve ters yazilisi ayni olan metinler
        // madam , adanada, 1236321

        if (metin.equalsIgnoreCase(tersMetin)){
            System.out.println("Girilen metin bir palindrome");
        } else {
            System.out.println("Girilen metin bir palindrome degil");

        }

    }
}
