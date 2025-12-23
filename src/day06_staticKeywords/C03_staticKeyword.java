package day06_staticKeywords;

public class C03_staticKeyword {

    public static void main(String[] args) {


        /*
            Static ve instance variable'larin ozelliklerini karsilastiralim
            1- static variable'lar Class'a baglidir
               instance variable'lar ise Obje'ye baglidir

               hem static hem de instance variable'lara ortak olarak
               CLASS LEVEL variable'lar denir

               bazen static variable'lar "class variable" olarak adlandirilir
                     instance variable'lar ise "object variable" olarak adlandirilir
            2- static variable'lar class'a bagli olduklari icin,
               baska class'larda kullanilacagi zaman classIsmi.variableIsmi seklinde kullanilirlar
               Instance variable'lar ise obje'ye bagli olduklarindan
               objeIsmi.variableIsmi olarak kullanilirlar
         */

        System.out.println(C01_Toyota.marka); // Toyota
        System.out.println(C01_Toyota.model); // Corolla

        // System.out.println(C01_Toyota.renk);
        // Non-static field 'renk' cannot be referenced from a static context
        // static olmayan renk variable'i static olan main method'dan direkt kullanilamaz
        C01_Toyota obj = new C01_Toyota();
        System.out.println(obj.yakit);

        // static variable'lara dogru erisim yontemi classIsmi.variableIsmi seklindedir
        // ancak objeIsmi.variableIsmi seklinde de yazilabilir
        // bu kullanimda variableismi otomatik gelmez
        // intelliJ de sariya boyayarak yanlis kullanim oldugunu soyler

        System.out.println(obj.marka); // Toyota
        // Static member 'day06_staticKeywords.C01_Toyota.marka' accessed via instance reference
        // static variable olan marka'yi NICIN instance variable gibi obje ile kullaniyorsun ?
        // dogru kullanim
        System.out.println(C01_Toyota.marka); // Toyota


        /*
            3- static variable'lar SADECE 1 tane olusturulur
               ve tum objeler ortak olarak bu variable'i kullanir
               ornegin 1000 tane de toyota uretilse marka variable'i 1 tane olur

               instance variable'lar her obje icin Java tarafindan kopyalanip cogaltilir
               ornegin 1000 tane de toyota uretilse,
               Java renk,motor,yakit ve uretimYili variable'larinin kopyalarini
               1000 tane cogaltip, her bir objeye yapistirir
         */


    }
}
