package day02_ifElseStatements;

public class C01_Pre_Post_increment {

    public static void main(String[] args) {

        int sayi1 = 20;
        int sayi2 = 40;


        sayi1++; // sayi1 1 artti

        System.out.println(sayi1); // sayi1'in 1 arttigini gormek icin yazdirdik

        ++sayi1; // sayi1 1 artti

        System.out.println(sayi1); // sayi1'in 1 arttigini gormek icin yazdirdik


        // sayi2'i 1 artirin
        sayi2++;

        // sonra sayi2'yi yazdirin
        System.out.println(sayi2); // 41


        // yukardaki 2 islemi tek satirda yapin
        System.out.println("islemi tek satirda yapalim : " +   ++sayi2); // 42


        // sayi2 i once yazdirin
        System.out.println("sayi2 i once yazdirin : " + sayi2); // 42

        // sonra 1 artirin
        sayi2++;

        // bu satirdsa sayi2 43 olur


    }
}
