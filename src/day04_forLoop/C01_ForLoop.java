package day04_forLoop;

import java.util.Scanner;

public class C01_ForLoop {

    public static void main(String[] args) {

        // 3 kere alt alta "Hello World" Yazdirin

        // System.out.println("Hello World\nHello World\nHello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("=============");
        // Kullanicidan bir tamsayi alin
        // ve girilen sayi kadar alt alta "Hello World" Yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen tekrar sayisini giriniz...");
        int tekrarSayisi = scanner.nextInt();

        for (int i = 1; i <=tekrarSayisi ; i++) { // baslangic degeri ; bitirme sarti ; i'nin degisim sekli

            System.out.println("Hello World");

        }










    }
}
