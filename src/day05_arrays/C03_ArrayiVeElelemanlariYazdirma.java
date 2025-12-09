package day05_arrays;

import java.util.Arrays;

public class C03_ArrayiVeElelemanlariYazdirma {

    public static void main(String[] args) {

        String[] isimler = {"Ali","Veli","Can"} ;
        int sayilar[] = {3,4,5,7,0};

        String[] urunler = new String[2]; // [null, null]
        double[] notlar = new double[4]; // [0.0 ,0.0, 0.0, 0.0]
        boolean[] devamsizlik = new boolean[1]; // [false]

        System.out.println(isimler);  // [Ljava.lang.String;@2752f6e2
        System.out.println(sayilar); // [I@e580929

        System.out.println(   Arrays.toString(isimler)   ); // [Ali, Veli, Can]
        System.out.println(   Arrays.toString(sayilar)   ); // [3, 4, 5, 7, 0]
        // toString methoduyla yazdirilan array'lerdeki elemanlarin aralarinda
        // standart olarak bir virgul ve bir bosluk(space) bulunur.


        System.out.println(  Arrays.toString(urunler)  ); // [null, null]
        System.out.println(Arrays.toString(notlar)); // [0.0, 0.0, 0.0, 0.0]


        // sadece 1 elemani yazdirmak isterseniz index'ini yazmaniz gerekir
        // NOT : eleman yazdirirken [], "" gibi karakterler olmaz, sadece elemani yazdirir

        // isimler listesindeki ilk ismi yazdirin
        System.out.println(  isimler[0] );

        // notlar array'indeki 3. notu yazdirin
        System.out.println(notlar[2]); // 0.0

        // eger array'de olmayan bir index kullanilirsa
        System.out.println(  notlar[11]);
        // ArrayIndexOutOfBoundsException
    }
}
