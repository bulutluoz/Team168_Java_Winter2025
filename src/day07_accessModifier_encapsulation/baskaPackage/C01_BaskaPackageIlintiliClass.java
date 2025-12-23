package day07_accessModifier_encapsulation.baskaPackage;

import day07_accessModifier_encapsulation.dataPackage.C01_DataClass;

public class C01_BaskaPackageIlintiliClass extends C01_DataClass {

    /*
        Java'da iki class arasinda ilinti olusturmak icin (child-parent class) extends keyword kullanilir
     */

    public static void main(String[] args) {
        // sayiPrivateS = 5;
        // System.out.println(sayiPrivateS);
        // private access modifier'a sahip class uyeleri
        // SADECE datalarin oldugu class'dan kullanilabilir
        // icinde bulundugumuz class datalarin oldugu class olmadigindan
        // private class uyelerine ulasilamaz

        // strDefaultAccModS = "ali";
        // default access modifier'a sahip class uyeleri
        // SADECE datalarin oldugu package'dan kullanilabilir
        // icinde bulundugumuz class datalarin oldugu package icinde olmadigindan
        // default access modifier'ina sahip class uyelerine ulasilamaz



        chrProtectedS = 'k';
        dblPublicS = 23.5;

        // sayiPrivateI = 6;
        // Non-static field 'sayiPrivateI' cannot be referenced from a static context
        // static olan bir method'da static olmayan variable'a direkt ulasilamaz
        C01_BaskaPackageIlintiliClass obj1 = new C01_BaskaPackageIlintiliClass();
        // obj1.sayiPrivateI = 34;
        // obj1.strDefaultAccModI = "Java";
        obj1.chrProtectedI = 'y';
        obj1.dblPublicI = 12;
    }
}
