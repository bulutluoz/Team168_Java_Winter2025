package day08_abstraction;

public class C04_ChildClassOfKuralciParent extends C03_KuralciParent{
    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    public void method5(){

    }


    /*
        Bir class abstract bir class'i parent edinirse
        parent abstract class'da abstract olarak olusturulan
        TUM METHOD'lara sahip olmak zorundadir

        bu ornek icin konusursak
        parent class da method1 ve method2 abstract method olduklarindan
        C03'u parent edindigimizde method1 ve method2'yi bu class'da olusturmak zorundayiz

        Class 'C04_ChildClassOfKuralciParent' must either be declared abstract or implement abstract method 'method1()' in 'C03_KuralciParent'
        Class C04... ya abstract class olmalidir ya da
        C03 class'indaki method1 ve method2'yi uyarlamalidir

        abstract parent class method1 ve method2'nin MUTLAKA OLMASINI saglar
        ama method body'sinde ne olacagina karismaz
        child class method'u kendisine uygun olarak doldurabilir
     */



}
