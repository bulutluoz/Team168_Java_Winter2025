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

        isimlerListesiArrayList.remove(2);
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

        // queue'da silme islemi zorunlu olarak bastan yapiliyor
        // index yazip aradan eleman silinmesine izin vermiyor
        sayilarQueueLinkedList.remove();
        System.out.println(sayilarQueueLinkedList); // [4, 9, 1, 8]
        sayilarQueueLinkedList.remove();
        System.out.println(sayilarQueueLinkedList); // [9, 1, 8]


        /*
        Deque double ended queue (iki uclu kuyruk) demektir
        yani iki uctan da (bastan ve sondan) islem yapilmasina izin vermeli
        bunun icin
        ekleme, silme gibi pekcok islemde first ve last methodlari secenek olarak vardir
        ama araya eleman eklenmesine izin vermez
         */

        karakterlerDequeLinkedList.add('t');
        karakterlerDequeLinkedList.add('-');
        karakterlerDequeLinkedList.add('6');
        System.out.println(karakterlerDequeLinkedList); // [t, -, 6]

        karakterlerDequeLinkedList.addFirst('a');
        karakterlerDequeLinkedList.addLast('t');
        System.out.println(karakterlerDequeLinkedList); // [a, t, -, 6, t]

        karakterlerDequeLinkedList.addFirst('t');
        karakterlerDequeLinkedList.addLast('6');
        System.out.println(karakterlerDequeLinkedList); // [t, a, t, -, 6, t, 6]

        // karakterlerDequeLinkedList.remove();
        // System.out.println(karakterlerDequeLinkedList); // [t, a, t, -, 6, t, 6]
        // sadece remove() derseniz queue'daki gibi bastan siler
        // ama deque oldugu icin bastan veya sondan sil diye ozellikler belirttebilirsiniz
        //karakterlerDequeLinkedList.removeFirst();
        //karakterlerDequeLinkedList.removeLast();
        //System.out.println(karakterlerDequeLinkedList); // [a, t, -, 6, t]

        // [t, a, t, -, 6, t, 6]
        karakterlerDequeLinkedList.removeFirstOccurrence('6');
        System.out.println(karakterlerDequeLinkedList); // [t, a, t, -, t, 6]

        karakterlerDequeLinkedList.removeLastOccurrence('t');
        System.out.println(karakterlerDequeLinkedList); // [t, a, t, -, 6]

    }
}
