package day02_ifElseStatements;

import java.util.Scanner;

public class C04_EskenarUcgen {

    public static void main(String[] args) {
        // kullanicidan bir ucgenin 3 kenar uzunlugunu isteyin
        // kenar uzunluklari esit ise "eskenar ucgen" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ucgenin 3 kenar uzunlugunu giriniz...");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        if (kenar1 == kenar2 && kenar2 == kenar3){
            System.out.println("eskenar ucgen");
        }
    }
}
