package day05_arrays;

public class C01_ScopeTekrar {
    /*
        1- local bir scope(Bir susulu parantez'in icinde)'da olusturulan variable'lar
           sadece kendi scope'larinda kullanilabilirler
        2- loop gibi method icerisinde kullanilan ama kendi body'si olan (suslu parantezler)  kod bloklari da
           local bir scope'dur.
           Yani bu kod bloklari icerisinde olusturulan variable'lar da sadece
           olusturulduklari kod blogundan kullanilabilirler
        3- Eger bir variable'i class'daki tum method'lardan kullanmak isterseniz
           variable'i class level'da olusturmalisiniz
           (Class'in icinde ama diger kod bloklarinin disinda)
        4- Class level'da olusturulan variable'lar static veya instance(static olmayan) seklinde ikiye ayrilir
           iki turdeki variable'lar da tum class'dan kullanilabilir
           ama KULLANIM BICIMI degisiklik gosterir
        5- static variable'lar class icerisinde her yerde direkt olarak kullanilabilir
           instance variable'lar icin secim hakki method'a gecer
             - method static ise instance variable'in direkt kullanimina izin vermez
               obje olusturularak kullanilabilir
             - method da instance variable gibi static olmayan bir method ise
               instance variable'lar direkt kullanilabilir
         6- method icerisinde static variable olusturulamaz
            static keyword sadece class level'da kullanilabilir
            (variable, method, constructor, kod bloklari....)


     */
    String isim1 = "Ali";
    static int number = 45;

    public static void main(String[] args) {

        // static double sayi4 = 8;
        // Modifier 'static' not allowed here


//        System.out.println(isim1);
//        isim1 = "Kemal";

        C01_ScopeTekrar obj1 = new C01_ScopeTekrar();
        System.out.println(obj1.isim1);
        obj1.isim1 = "Yasar";

        System.out.println(number);
        number = 34;

        String str = "a";
        System.out.println(str);
        str = "yeni deger";

        for (int i = 0; i <10 ; i++) {
            System.out.println(i);
            char chr = 'a';
            i = i + 2;
        }

//        System.out.println(i);
//        System.out.println(chr);

        if (str.contains(" ")){
            double sayi = 3;
        }

//        System.out.println(sayi);

    }

    public static void method1(){
        System.out.println(number);
        number = 41;
//        System.out.println(str);
//        str = "method1 de yeni deger";
    }


    public void method2(){

        System.out.println(isim1);
        isim1 = "Emine";

        System.out.println(number);
        number = 43;
//        System.out.println(str);
//        str = "method2 de yeni deger";
    }

    String isim2 = "Veli";

}
