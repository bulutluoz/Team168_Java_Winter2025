package day08_abstraction;

public abstract class C03_KuralciParent {

    /*
        Kuralci Parent hangi class'in kendisini parent edinecegini belirleyemez
        Java genel kural olarak child class, kendi parent'ini belirler

        Kuralci Parent class'i
        kendisini parent edinen child class'larin
        MUTLAKA BULUNDURMASI GEREKEN method'lari BELIRLEYEBILIR

        ornegin, bu class icin
        Child class'larin method1 ve method2'yi bulundurmasi ZORUNLU olsun
        method3 ve method4 ise zorunlu olmasin

        Bir class olusturulurken
        Kuralci bir parent olmasi planlaniyorsa
        o class ve zorunlu method'larin java'nin belirledigi sekilde olusturulmasi gerekir

        1- Oncelikle bir class'in kuralci class olabilmesi icin
           Class'in ABSTRACT olarak tanimlanmasi gerekir
           bunun icin class deklarasyonuna "abstract" kelimesi eklenir

        2- Kuralci (abstract) bir class'daki tum method'lar zorunlu olmayabilir
           zorunlu olmasi istenen method'lar da abstract yapilmalidir.

           abstract method'lar standartlardaki bir cumle gibidirler
           kendileri (abstract method'lar) klasik bir method gibi degil
           kural koyan bir cumle gibi olurlar,
           cumlenin karsiligi child class'larda olur.

     */

    // tum child class'larda method1 olmalidir
    public abstract void method1();

    // tum child class'larda method2 olmalidir
    public abstract void method2();

    public abstract void method5();

    public void method3(){
        System.out.println("Kuralci Parent class method 3 calisti");
    }

    public void method4(){
        System.out.println("Kuralci Parent class method 4 calisti");
    }


}
