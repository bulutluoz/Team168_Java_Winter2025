package day04_forLoop;

public class C04_DikkatEdilmesiGerekenler {

    public static void main(String[] args) {

        // 1.

        // 10 ile 27 arasindaki negatif sayilari yazdirin

        for (int i = 10; i <27 ; i++) {

            // java aslinda tum sayilar icin loop'u dondurur
            // her bir sayinin <0 sartini kontrol eder
            // ama sarti saglayan sayi olmadigindan konsolda bir sey yazdirmaz

            if (i < 0){

                System.out.println(i);
            }

        }

        // Java ilk deger olarak 10 degerini atama yapar
        // ve bitirme sarti olan 10 < 5 karsilastirmasini yapar,
        // sonuc false oldugu icin loop BITER
        // yani loop'un baslamasiyla bitmesi bir olur


        for (int i = 10; i < 5 ; i--) {

            System.out.println(i);
        }

        // KURAL 1 : ILK deger icin bitis sarti FALSE olursa
        //           LOOP BODY hic calismaz


        for (int i = 10; i >5 ; i++) {

            System.out.print( i + " ");

        }

        // KURAL 2 : Baslangic degeri ve degisim bicimine dikkat edilirse
        //           bitis sarti olan i>5 HER ZAMAN true olur
        //           Buna SONSUZ LOOP diyoruz







    }
}
