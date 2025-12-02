package day04_forLoop;

public class C02_TemelForLoopOrnekleri {

    public static void main(String[] args) {


        // 1'den 20'e kadar (1 ve 20 dahil) olan sayilarin toplamini yazdirin

        int toplam = 0;

        for (int i = 1; i <=20 ; i++) {

            toplam += i ;  //  toplam = toplam + i ;

        }

        System.out.println("Sayilarin toplami : " + toplam);

        System.out.println("=====================================");
        // 1278'den 2013'e kadar (sinirlar dahil) olan sayilarin toplamini yazdirin

        toplam = 0;

        for (int i = 1278; i <=2013 ; i++) {

            toplam += i ;  //  toplam = toplam + i ;
        }

        System.out.println("Sayilarin toplami 2 : " + toplam);





        // 3 basamakli cift sayilarin toplamini yazdirin
        // 100, 102, 104 ...... 998

        toplam = 0;

        for (int i = 100; i <=998 ; i+=2 ) {

            toplam += i ;  //  toplam = toplam + i ;
        }

        System.out.println("Sayilarin toplami 3 : " + toplam);


        // 467 ile 763 arasinda (sinirlar dahil) 17 ile bolunebilen sayilarin toplami

        toplam = 0;

        for (int i = 467; i <= 763 ; i++ ) {

            if (i % 17 == 0){
                toplam += i ;
            }

        }

        System.out.println("Sayilarin toplami 4 : " + toplam);


        // 247'den baslayarak 400'den kucuk 20 ile bolunebilen sayilari uan yana yazdirin

        for (int i = 247; i < 400 ; i++) {

            if ( i % 20 == 0){
                System.out.print( i + " ");
            }

        }
        System.out.println(""); // alt satira gecmek icin


    }
}
