package day03_stringManipulation;

import java.util.Locale;

public class C01_toUppercase_toLowercase {

    public static void main(String[] args) {

        String metin = "Bugun hava cok guzeldi";

        System.out.println(metin.toUpperCase()); // BUGUN HAVA COK GUZELDI


        System.out.println(metin); // Bugun hava cok guzeldi

        // String'de atama yapilmadikca,
        // hazir method ile yapilan degisiklikler kalici olmaz


        metin.toLowerCase(); // bugun hava cok guzeldi
        // 18.satirda method isini yapip metni kucuk harfe cevirir
        // AMMMAAAA biz yazdirmadimiz icin konsolda gorunmez
        // VEEE atama olmadigi icin yapilan degisiklik KALICI olmaz

        System.out.println(metin);

        String str = "Bugün hava çok güzeldi.";

        System.out.println(str.toUpperCase()); // BUGÜN HAVA ÇOK GÜZELDI.

        // ingilizce de i => I
        // Turkce de i => İ
        // bir local dilde herhangi bir harfin kucuk - buyuk yazimi ile
        // ayni harfin ingilizcedeki kucuk - buyuk yazimi farkli ise
        // java bilgisayarin dil tercihine bakar ve ona gore kucuk-buyuk harf donusumunu yapar

        System.out.println( str.toUpperCase(Locale.forLanguageTag("TR"))); // BUGÜN HAVA ÇOK GÜZELDİ.


        str = "JAVA CANDIR";

        System.out.println(str.toLowerCase()); // java candir
        System.out.println(str.toLowerCase(Locale.forLanguageTag("TR"))); // java candır





    }
}
