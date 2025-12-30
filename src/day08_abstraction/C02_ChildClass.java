package day08_abstraction;

public class C02_ChildClass extends C01_ParentClass{
    /*
        Java'da insanlardan farkli olarak
        Parent child edinmez, tam tersine child istedigi class'i Parent edinebilir.

        Java'da parent child iliskisi 2 genel durumda kullanilir
        1- yeni bir class olusturulurken,
           bu yeni class'in daha once var olan bir class'daki method ve variable'lari kolayca kullanmasini saglamak icin

        2- Bir proje olusturulurken,
           tum projedeki class'lari belirli basliklar altinda toplamak icin
           cati class'lar olusturmak icin

        bir class'i baska class'in child'i yapmak icin
        class isminden sonra "extends parantClassIsmi" yazmamiz yeterlidir
        boylece child class parent class'daki herseyi rahatlikla kullanabilir
        (access modifier kisitlamalari cercevesinde)


     */


    int sayi = 70;
    int agirlik = 80;
    public static void main(String[] args) {

    }
    /*
        Bir class baska bir class'i parent edinirse
        - parent class'da var olan tum method ve class level variable'lari direkt kullanabilir
        - child class parent class'da var olan method veya class level variable'lari
          kendisine uyarlayip kullanabilir
        - child class, parent class'da olmayan yeni method'lar veya class level variable'lar olusturabilir
     */
    public void deneme(){
        // static keyword'e takilmamak icin bu method'da ornekleri yazdik
        System.out.println(str); // Merhaba
        method1(); // Parent class method 1 calisti

        //System.out.println(ilkHarf); // ne bu class'da ne de parent class'da bu variable yok

        System.out.println(sayi);// 70
        method2(); // Child class method2 calisti

    }

    public void method2(){
        System.out.println("Child class method2 calisti");
    }

    public void method3(){
        System.out.println("Child class method3 calisti");
    }
}
