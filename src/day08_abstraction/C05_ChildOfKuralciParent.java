package day08_abstraction;

import java.util.ArrayList;
import java.util.List;

public class C05_ChildOfKuralciParent extends C03_KuralciParent {
    @Override
    public void method1() {
        System.out.println("Child class method1");
    }

    @Override
    public void method2() {
        System.out.println("Child class method2");
    }

    @Override
    public void method5() {
        System.out.println("Child class method5");
    }


    /*
        Diger bir soyleyisle soyle diyebiliriz

        bir class abstract olmayan herhangi bir class'i parent edinirse
        parent class child class'i hic bir seye zorlayamaz

        AMMMMAAAA
        bir class Abstract bir class'i Parent edinirse
        o abstract class'da abstract olarak olusturulan method'lari
        kendi class'i icerisinde OLUSTURMAK ZORUNDADIR
     */

    public static void main(String[] args) {


        // C03_KuralciParent obj1 = new C03_KuralciParent();
        // 'C03_KuralciParent' is abstract; cannot be instantiated
        // C03 abstract bir class oldugundan direkt obje olusturulamaz
        // obj1.method1();
        // Eger java obj1'in olusturulmasina izin verseydi
        // 38.satirda body'si olmayan bir method'un calismasi gerekirdi
        // ve bu mumkun degil
        // bunun icin Java Abstract class'lardan direkt obje olusturulmasini yasaklamis.


        List<String> isimler = new ArrayList<>();

        // List<String> isimler2 = new List<>();
        // List abstract oldugu icin sag tarafta List<>() kullanilamaz
        // bunun yerine List'in child'i olan ve abstract method'lari
        // body'li olarak olusturan ArrayList<>() kullanilir


        C03_KuralciParent obj1 = new C05_ChildOfKuralciParent();

        obj1.method1(); // Child class method1
        obj1.method3(); // Kuralci Parent class method 3 calisti
        obj1.method5(); // Child Class method5


    }


}
