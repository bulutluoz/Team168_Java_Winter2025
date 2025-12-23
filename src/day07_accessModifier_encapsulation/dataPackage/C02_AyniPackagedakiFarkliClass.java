package day07_accessModifier_encapsulation.dataPackage;

public class C02_AyniPackagedakiFarkliClass {

    public static void main(String[] args) {

        //C01_DataClass.sayiPrivateS = 5;
        // System.out.println(C01_DataClass.sayiPrivateS);
        // private access modifier'a sahip class uyeleri
        // SADECE datalarin oldugu class'dan kullanilabilir
        // icinde bulundugumuz class datalarin oldugu class olmadigindan
        // private class uyelerine ulasilamaz

        C01_DataClass.strDefaultAccModS = "ali";
        C01_DataClass.chrProtectedS = 'k';
        C01_DataClass.dblPublicS = 23.5;

        // sayiPrivateI = 6;
        // Non-static field 'sayiPrivateI' cannot be referenced from a static context
        // static olan bir method'da static olmayan variable'a direkt ulasilamaz
        C01_DataClass obj1 = new C01_DataClass();
        //obj1.sayiPrivateI = 34;
        obj1.strDefaultAccModI = "Java";
        obj1.chrProtectedI = 'y';
        obj1.dblPublicI = 12;

        }

}
