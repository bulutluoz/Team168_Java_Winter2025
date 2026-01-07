package day09_collections;

import java.util.*;

public class C01_Collections {
    public static void main(String[] args) {

        /*
         Java'da Collections Interface'i altinda
         3 temel yapi INTERFACE olarak olusturulmustur
         - List
         - Queue/Deque
         - Set
         bu yapilar interface olarak olusturulduklarindan
         direkt obje olusturulamaz
         */

        // List<String> isimlerListesi = new List<>();
        // 'List' is abstract; cannot be instantiated
        // List abstract bir yapidir, direkt obje olusturulamaz

        List<String> isimlerListesiArrayList = new ArrayList<>();
        List<String> isimlerListesiLinkedList = new LinkedList<>();
        // ister ArrayList<>() kullanin, ister LinkedList<>() kullanin
        // data turu olarak secilen  List<String> ayni oldugundan
        // isimlerListesiArrayList ve isimlerListesiLinkedList AYNI OZELLIKLERE (methodlara sahip olurlar)



        // Queue<Integer> sayilarQueue = new Queue<>();
        // 'Queue' is abstract; cannot be instantiated
        Queue<Integer> sayilarQueueLinkedList = new LinkedList<>();

        // Deque<Character> karakterlerDeque = new Deque<>();
        // 'Deque' is abstract; cannot be instantiated
        Deque<Character> karakterlerDequeLinkedList = new LinkedList<>();


    }
}
