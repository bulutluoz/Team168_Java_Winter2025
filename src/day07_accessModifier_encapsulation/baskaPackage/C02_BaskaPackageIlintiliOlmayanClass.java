package day07_accessModifier_encapsulation.baskaPackage;

import day07_accessModifier_encapsulation.dataPackage.C01_DataClass;

public class C02_BaskaPackageIlintiliOlmayanClass {

    public static void main(String[] args) {
        //sayiPrivateS = 5;
        //System.out.println(sayiPrivateS);
        // private access modifier'a sahip class uyeleri
        // SADECE datalarin oldugu class'dan kullanilabilir
        // icinde bulundugumuz class datalarin oldugu class olmadigindan
        // private class uyelerine ulasilamaz

        // strDefaultAccModS = "ali";
        // default access modifier'a sahip class uyeleri
        // SADECE datalarin oldugu package'dan kullanilabilir
        // icinde bulundugumuz class datalarin oldugu package icinde olmadigindan
        // default access modifier'ina sahip class uyelerine ulasilamaz

        // C01_DataClass.chrProtectedS = 'k';
        // protected access modifier'a sahip class uyeleri
        // SADECE datalarin oldugu package'dan veya baska package'daki child class'lardan kullanilabilir
        // icinde bulundugumuz class datalarin oldugu package icinde olmadigindan
        // ve class DataCalss'inin child'i olmadigindan
        // protected access modifier'ina sahip class uyelerine ulasilamaz


        C01_DataClass.dblPublicS = 23.5;
        // Public class uyelerine proje icindeki HER CLASS'dan ulasilabilir




        C01_DataClass obj1 = new C01_DataClass();
        // obj1.sayiPrivateI =9;
        // obj1.strDefaultAccModI = "Java";
        // obj1.chrProtectedI = 'y';
        obj1.dblPublicI = 12;
    }
}
