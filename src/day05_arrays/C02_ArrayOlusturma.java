package day05_arrays;

public class C02_ArrayOlusturma {
    public static void main(String[] args) {


        String isim = "Ali";
        int sayi = 5;

        // String isimler = "Ali","Veli","Can" ;
        // Not a statement


        // String isimler = {"Ali","Veli","Can"} ;
        // Array initializer is not allowed here
        // isimler'in bir array oldugunu belirtmemiz gerekiyor


        String[] isimler = {"Ali","Veli","Can"} ;
        int sayilar[] = {3,4,5,7,0};

        // yukardaki iki sekilde array tanimlanabilir, ama intelliJ 1. yazim bicimini tercih ediyor
        // isimler variable'inin data turu ARRAY'dir, [] bunu bize soyluyor
        // basaina yazilan String veya int variable'in degil icerisine konulan elemanlarin data turudur

        // String[] numbers = {4,7,9};
        String[] numbers = {"4","7","9"};
        // int[] sayiListesi = {"sayi","sayi","sayi"};
        // int[] sayiListesi = {5,7,true};
        // Bir array'in icerisinde sadece basta deklare edilen data turunden elemanlar bulunabilir


        // Array iki sekilde olusturulabilir
        // 1- yukardaki ornekler gibi tum elemanlari bir liste olarak ekleyebilirsiniz
        //    eklenen eleman sayisi otomatik olarak array'in length'i olarak kabul edilir

        // 2- bazen tum elemanlar belirlenmemis olabilir
        //    bu durumda array'i olustururken
        //    hangi data turunden ve kac eleman elemanlar barindiracagi bastan belirtilmelidir

        String[] urunler = new String[2]; // [null, null]
        double[] notlar = new double[4]; // [0.0 ,0.0, 0.0, 0.0]
        boolean[] devamsizlik = new boolean[1]; // [false]

        // 2.olusturma yontemi secildiginde, java eleman olarak default(varsayilan) degerler atar
        //   default degerler
        //   String ve non-primitive'ler icin ==> null
        //   sayisal primitive'ler icin ==> 0
        //   boolean ==> false
        //   char ==> hiclik
    }
}
