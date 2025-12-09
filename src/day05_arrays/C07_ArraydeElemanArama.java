package day05_arrays;

public class C07_ArraydeElemanArama {

    public static void main(String[] args) {
        // Verilen bir array’de istenen bir elemanin var olup olmadigini
        // ve varsa kac kere kullanildigini yazdirin

        int[] arr = {2,3,4,5,6,2,3,4,5,9,7,8,3,4,2,4,3,5,6,3,4,2,3,4};

        arraydeIstenenElemanSayisiniBulma(arr,5); // Arrayde aradiginiz eleman 3 kere kullanilmis.

        arraydeIstenenElemanSayisiniBulma(arr,4); // Arrayde aradiginiz eleman 6 kere kullanilmis.

        arraydeIstenenElemanSayisiniBulma(arr,0); // Array'de aradiginiz eleman kullanilmamis


    }


    // Verilen bir array’de istenen bir elemanin var olup olmadigini
    // ve varsa kac kere kullanildigini yazdiran bir method olusturun.

    public static void arraydeIstenenElemanSayisiniBulma(int[] arr, int arananEleman){

        int sayac =0 ;

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i] == arananEleman) sayac++ ;

        }

        if (sayac>0) {
            System.out.println("Arrayde aradiginiz eleman " + sayac + " kere kullanilmis.");
        } else {
            System.out.println("Array'de aradiginiz eleman kullanilmamis");
        }

    }


}
