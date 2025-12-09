package day05_arrays;

import java.util.Arrays;

public class C04_ArrayeYeniDegerAtamasi {

    public static void main(String[] args) {


        String[] isimler = {"Ali","Veli","Can"} ;
        int sayilar[] = {3,4,5,7,0};

        String[] urunler = new String[2]; // [null, null]
        double[] notlar = new double[4]; // [0.0 ,0.0, 0.0, 0.0]
        boolean[] devamsizlik = new boolean[1]; // [false]


        // sayilar array'indeki 3.elemanin degerini 10 yapin
        sayilar[2] = 10;

        System.out.println(Arrays.toString(sayilar)); // [3, 4, 10, 7, 0]

        // sayilar array'indeki 2.elemanin degerini 4 katina cikarin
        sayilar[1] = sayilar[1] * 4 ;
        System.out.println(Arrays.toString(sayilar)); // [3, 16, 10, 7, 0]


        // isimler array'indeki 2.ismi buyuk harfe cevirin
        isimler[1] = isimler[1].toUpperCase();

        System.out.println( Arrays.toString(isimler) ); // [Ali, VELI, Can]



        // notlar array'indeki son notu 78.5 yapin

        notlar[notlar.length-1] = 78.5;
        System.out.println(Arrays.toString(notlar)); // [0.0, 0.0, 0.0, 78.5]


        // notlar array'inde sondan 3.notu 66 yapin
        notlar[notlar.length-3] = 66;

        System.out.println(Arrays.toString(notlar)); // [0.0, 66.0, 0.0, 78.5]


        // notlar array'ine 5.eleman olarak 88 atayin
        // notlar[4] = 88; // ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
        // notlar[41] = 88; // ArrayIndexOutOfBoundsException: Index 41 out of bounds for length 4
        System.out.println(Arrays.toString(notlar)); // [0.0, 66.0, 0.0, 78.5]

        // Bir array olusturulduktan sonra
        // uzunlugunu direkt eleman atayarak veya eleman silerek degistirmek MUMKUN DEGILDIR


    }
}
