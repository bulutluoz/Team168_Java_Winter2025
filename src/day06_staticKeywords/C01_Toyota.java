package day06_staticKeywords;

public class C01_Toyota {
    // Sakarya uretim yapan Toyota Corolla arabalar icin bir program yaptigimizi dusunelim
    // Corolla arabalar sadece Sakarya'da uretiliyor
    // Sakarya da sadece Corolla modeli uretiliyor


        static String marka = "Toyota";
        static String model = "Corolla";
        static String uretimYeri = "Sakarya/Turkiye";
    String renk = "Renk secilmedi";
    String motor = "Motor secilmedi";
    String yakit = "Yakit secilmedi";
    int uretimYili = 1900;

    /*
        Bir class'da class level'da olusturulan variable'lar
        o class'dan olusturulacak objelerin ILK DEGERLERINI belirler
        Static veya instance variable'lara DEGER ATAMAK zorunlu degildir,
        ANCAKKK class'i olusturan kisi deger atamazsa,Java'nin default degerler atayacagi unutulmamalidir
        (non-primitivler==> null, sayisal primitive'ler icin==> 0, boolean==> false, char==> hiclik)

        Class level'da olusturulan bir variable'in static veya instance(static olmayan) olmasina
        o variable'in tum objeler icin ortak olup olmamasiona gore karar veriyoruz
        Ornegin bu class'da marka,model ve uretimYeri tum araclar icin ortak oldugundan STATIC secildi,
        renk,motor,yakit ve uretimYili ise her arac icin FARKLI olacagindan INSTANCE secildi

        Toyota class'indan bir obje olusturuldugunda,
        obje bu class'daki variable ve method'larin HEPSINE OTOMATIK OLARAK sahip olacaktir

     */
}
