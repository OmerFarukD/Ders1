public class Main {

    // Java platformdan bağımsız bir dildir.
    // Jvm -> Java Virtual Machine : Uygun işletim sistemine göre kodları makine diline çevirirç.
    // JRE->  Java RunTime Environment : uygulama geliştirme tarafı değil Uygulamayı açmak için gerekn ortam
    //JDK ->  Java Development Kit : java 19

    // Yorumlama -> Kaynak kod başka kodlara direekt olarak çağrılır
    // Derleme -> Kaynak kod başka kod formuna dönüşür dosya çıktısı üretir, en sonda ise Makine koduna çevrilir

    // Java ilk başta kaynak kodu hemen makine diline çevirmez .class uzantılı bytecode dosyalara çevirir.
    // Jvm dosyaları çalışma zamanında ise yorumlar


    // Java JIT(Just In Time) Compiler

    public static void main(String[] args) {
        // Variables
        // Primitive(İlkel değişkenler)-> int , double ,float, boolean gibi gibi
        // Non Primitive  -> String , array daha fazlası

        // Primitive -> Integer
        int sayi=10;
        int sayi1=11;
        System.out.println(sayi+sayi1);


        // Double kritik hessap için kullanılır
        double number1=10.123123123123458654;
        double number2=10.345456456645546;
        System.out.println(number1+number2);


        // Float  performans odaklı çalışır
        float number3=10.3f;


        // long veri tipi
        long sayi123= 100000000000000L;

        // Java 7 den sonra gelen özellik
        long sayi1234=100_000_000L;
        System.out.println(sayi1234);


        //boolean
        boolean dogruluk=true;
        boolean dogruluk2=false;
        boolean dogruluk3=3<5;
        System.out.println(dogruluk3);

        // Stack -Heap
        // Primitive tipler stackta depolanır
        // primitive tipler stackta depolandığı için daha performanslıdır.
        // fonksiyonları yoktur.

        sayi=165;
        sayi1=170;


        // Non Primitiv tipler
        // Referans tipler
        // String

        String ad="Sayit";

        String hakikatler="İstanbul Çok kötü bir şehirdir.";
        String karakter= new String("İstanbul berbat bir şehir.");

        System.out.println(karakter);

       char harf= hakikatler.charAt(3);
       // 0 1 2 3 4 ...
        System.out.println(harf);
        String buyukHarfler=hakikatler.toUpperCase();
        System.out.println(buyukHarfler);


        // Arrays
        String[] sehirler= new String[3];
        sehirler[0]="Malatya";
        sehirler[1]="Elazığ";
        sehirler[2]="Ankara";

        System.out.println("Şehirlerin uzunluğu: "+sehirler.length);
        System.out.println("1. Şehir : "+sehirler[0]);

    }
}