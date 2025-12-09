package day05_arrays;

public class C06_TumElemanlarinToplami {

    public static void main(String[] args) {

        // Verilen bir array’deki pozitif tamsayilari toplayip sonucu yazdirin
        int[] sayilar = {-5,9,8,3,0,6,-2,3,-8,15};

        System.out.println(arraydekiPozitimSayilarinToplaminiBul(sayilar)); // 44

        int[] a = {4,4,5,-6,0,-7};
        System.out.println(arraydekiPozitimSayilarinToplaminiBul(a)); // 13


    }


    // Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir method yaziniz.

    public static int arraydekiPozitimSayilarinToplaminiBul(int[] sayilar){
        int toplam = 0;

        for (int i = 0; i < sayilar.length ; i++) {

            if (sayilar[i] > 0){
                toplam += sayilar[i];
            }

        }

        return toplam;

    }




}
