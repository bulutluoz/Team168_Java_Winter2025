package day04_forLoop;

public class C03_TemelForLoopOrnekleri {

    public static void main(String[] args) {

        // 675'den baslayarak geriye 389'a kadar (sinirlar dahil)
        // 17 ile bolunebilen sayilari yazdirin

        for (int i = 675; i >=389 ; i--) { // 675,674,673.......390,389

            if (i % 17 == 0){
                System.out.print(i + " ");
            }
        }

        System.out.println("");


        // -10 ile +10 arasindaki tum tamsayilarin carpini yazdirin

        int carpim = 1;

        for (int i = -10; i <=10 ; i++) {

            carpim *= i;
        }

        System.out.println("sayilarin carpimi : " + carpim);


        // 3 basamakli 73 ile bolunebilen sayilari,
        // buyukten kucuge dogru yazdirin

        for (int i = 999; i > 100 ; i--) {  // 999, 998, 997 ..... 101,100

            if (i % 73 == 0){
                System.out.print(i + " ");
            }

        }
    }
}
