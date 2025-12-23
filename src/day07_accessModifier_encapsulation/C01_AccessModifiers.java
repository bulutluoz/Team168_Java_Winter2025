package day07_accessModifier_encapsulation;

public class C01_AccessModifiers {
    /*
        Kural 1 - Class seviyesinde olusturulan HER CLASS UYESI
                  method, constructor, class level variable vs...
                  MUTALAKA access modifier'a sahip OLMALIDIR.

       Kural 2- Eger class'i olusturan kisi, bir access modifier yazmazsa
                JAVA default access modifier olarak tanimlar
                NOT : default access modifier yazilmaz,
                      eger gorunur bir access modifier YOKSA
                      Java default access modifier tanimlar

     */

    String str1;
    public String str2;
    public static String str3;
    static String str4;
    // default String str5;
    // Modifier 'default' not allowed here

    public static void main(String[] args) {

    }

    public static void method1(){

    }

    static void method2(){

    }

    void method3(){

    }
}
