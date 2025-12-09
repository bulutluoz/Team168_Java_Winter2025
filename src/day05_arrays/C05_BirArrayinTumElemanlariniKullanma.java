package day05_arrays;

import java.util.Arrays;

public class C05_BirArrayinTumElemanlariniKullanma {

    public static void main(String[] args) {
        int sayilar[] = {3,4,5,7,0};

        // sayilar array'in ilk elemanini 2 artirin
        sayilar[0] = sayilar[0] + 2;

        System.out.println(Arrays.toString(sayilar)); // [5, 4, 5, 7, 0]

        // sayilar array'in sondan 2. elemanini 5 artirin

        // sayilar[3] = sayilar[3] + 5;
        sayilar[sayilar.length-2] = sayilar[sayilar.length-2] + 5;

        System.out.println(Arrays.toString(sayilar)); // [5, 4, 5, 12, 0]


        // sayilar array'indeki TUM ELEMANLARI 3'er artirin

//        sayilar[0] = sayilar[0] + 3;
//        sayilar[1] = sayilar[1] + 3;
//        sayilar[2] = sayilar[2] + 3;
//        sayilar[3] = sayilar[3] + 3;
//        sayilar[4] = sayilar[4] + 3;


        for (int i = 0; i < sayilar.length ; i++) {
            sayilar[i] = sayilar[i] + 3;
        }

        System.out.println(Arrays.toString(sayilar)); // [8, 7, 8, 15, 3]

        // NOT : EGER bir array'in TUM ELEMENTLERINE ulasmak isterseniz
        //       loop kullanabilirsiniz (array'de index onemli oldugundan for loop kullandik)
    }
}
