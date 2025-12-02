package day04_forLoop;

import java.util.Scanner;

public class C05_MetniTerstenYazdirma {
    public static void main(String[] args) {

        // Kullanicidan bir String isteyin ve String’i tersten yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Istediginiz bir metni girin");
        String metin = scanner.nextLine();

        // Ali topu at.

        // .ta upot ilA

        for (int i = metin.length()-1 ; i >=0 ; i--) {

            System.out.print(metin.charAt(i));
        }


    }
}
