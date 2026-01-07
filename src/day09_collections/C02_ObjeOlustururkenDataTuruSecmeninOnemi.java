package day09_collections;

import java.util.*;

public class C02_ObjeOlustururkenDataTuruSecmeninOnemi {

    public static void main(String[] args) {

        List<String> isimlerListesiArrayList = new ArrayList<>();
        isimlerListesiArrayList.add("a");
        isimlerListesiArrayList.add("k");
        System.out.println(isimlerListesiArrayList); // [a, k]
        isimlerListesiArrayList.add(0,"z");
        System.out.println(isimlerListesiArrayList); // [z,a, k]
        isimlerListesiArrayList.add(1,"r");
        System.out.println(isimlerListesiArrayList); // [z, r, a, k]

        List<String> isimlerListesiLinkedList = new LinkedList<>();
        Queue<Integer> sayilarQueueLinkedList = new LinkedList<>();
        Deque<Character> karakterlerDequeLinkedList = new LinkedList<>();


        /*
        ilk iki elemanin constructorlari FARKLI olmasina ragmen
        Data turleri ortak oldugundan
        Ayni method'lara sahip olduklarini gorduk
         */


        /*
            2.3.ve 4. objelerin constructor'lari AYNI ama
            data turleri farkli oldugunda
            O data turune ait spesifik method'lara sahipler.
            ornegin Queue (kuyruk) oldugundan , eklemenin sona yapilmasi, basa yapilamasi
            silinen elemanlarin ise bastan silinmesinin ZORUNLU olmasi lazim
         */
        sayilarQueueLinkedList.add(5);
        sayilarQueueLinkedList.add(4);
        sayilarQueueLinkedList.add(9);
        sayilarQueueLinkedList.add(1);
        System.out.println(sayilarQueueLinkedList); // [5, 4, 9, 1]
        sayilarQueueLinkedList.add(8);
        System.out.println(sayilarQueueLinkedList); // [5, 4, 9, 1, 8]


    }
}
