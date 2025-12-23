package day07_accessModifier_encapsulation.dataPackage;

public class C01_DataClass {

    static private int sayiPrivateS;
    static String strDefaultAccModS; // default access modifier
    static protected char chrProtectedS;
    static public double dblPublicS;

    private int sayiPrivateI;
    String strDefaultAccModI; // default access modifier
    protected char chrProtectedI;
    public double dblPublicI;

    /*
        static keyword access modifier degildir
        ancak ERISIM YONTEMINI belirlemede etkilidir
        static keyword varsa :  class icerisinden direkt ulasilabilir
                                class disindan ise class ismi ile direkt ulasilabilir classIsmi.staticVariableIsmi
                                obje olusturmaya gerek yok
        static keyword yoksa :  class icindeki static method'lardan
                                ve baska class'lardan erisebilmek icin Object olusturulmasi gerekir

         class icindeki farkli method'lardan erisim yontemini static keyword belirler
         AMMMMAAAA bir class'dan erisilip erisilemedigini Access Modifier belirler
     */


    public static void main(String[] args) {
        sayiPrivateS = 5;
        System.out.println(sayiPrivateS);
        strDefaultAccModS = "ali";
        chrProtectedS = 'k';
        dblPublicS = 23.5;

        // sayiPrivateI = 6;
        // Non-static field 'sayiPrivateI' cannot be referenced from a static context
        // static olan bir method'da static olmayan variable'a direkt ulasilamaz
        C01_DataClass obj1 = new C01_DataClass();
        obj1.sayiPrivateI = 34;
        obj1.strDefaultAccModI = "Java";
        obj1.chrProtectedI = 'y';
        obj1.dblPublicI = 12;

    }

    public static void method1(){
        sayiPrivateS = 11;
        System.out.println(sayiPrivateS);
        strDefaultAccModS = "veli";
        chrProtectedS = 'm';
        dblPublicS = 23.4;

        //sayiPrivateI = 6;
        // obj1.sayiPrivateI = 34;
        // obj1'in scope'u main method
    }

    public void method2(){
        sayiPrivateS = 12;
        System.out.println(sayiPrivateS);
        strDefaultAccModS = "ayse";
        chrProtectedS = 'n';
        dblPublicS = 23.3;

        sayiPrivateI = 6;

    }
}
