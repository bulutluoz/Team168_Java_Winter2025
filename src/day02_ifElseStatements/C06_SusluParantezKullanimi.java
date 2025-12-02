package day02_ifElseStatements;

import java.util.Scanner;

public class C06_SusluParantezKullanimi {

    public static void main(String[] args) {
        /*
            if statement icin { } kullanimi ZORUNLU degildir

            AMMMAAAA suslu parantez kullanilmazsa
            yan etkileri olur

            yan etkileri gormek icin if body'lerine 2.bir sout ekleyelim

            {} kullanimi garantili yontemdir,
            {} kullanilirsa supriz olmaz

            EGER {} kullanilmazsa
            if blogu if ()'den sonra gelen ilk ;'de biter
            ilk ;'den sonraki kodlar
            if statement ile ilintili degildir
            yani her durumda calisir
         */

        // Soru 3- Kullanicidan bir sayi alin,
        //         sayi 3 ile bolunuyorsa ”Uc ile bolunebilen sayi”,
        //         5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz...");
        int sayi = scanner.nextInt();


        if (sayi % 3 == 0)
            System.out.println("Uc ile bolunebilen sayi");
            System.out.println("Uc ile bolunebilen sayi guzeldir");


        if (sayi % 5 == 0)
            System.out.println("Bes ile bolunebilen sayi");
            System.out.println("Bes ile bolunebilen sayi guzeldir");



    }
}
