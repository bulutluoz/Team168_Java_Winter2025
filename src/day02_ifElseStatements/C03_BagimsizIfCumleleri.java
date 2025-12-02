package day02_ifElseStatements;

public class C03_BagimsizIfCumleleri {
    public static void main(String[] args) {


        int a = 21;
        int b = 30;

        // eger a b'den buyukse "a daha buyuk" yazdirin

        if (a>b){
            System.out.println("a daha buyuk");
        }

        // sart saglaniyorsa (mantiksal karsilastirmanin sonucu true ise) if body'si devreye girer
        // sart saglanmiyorsa (mantiksal karsilastirmanin sonucu false ise) if body'si calismaz
        // kod calismasi if blogunun sonuna gonderilir


        // eger a cift sayi ise "a cift sayi" yazdirin

        if ( a%2 == 0) {
            System.out.println("a cift sayi");
        }


        // b 3'un kati ise, "3'un kati olan sayilar guzeldir" yazdirin

        if (b%3 == 0){
            System.out.println("3'un kati olan sayilar guzeldir");
        }




    }
}
