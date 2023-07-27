package day02datatypesmethodcreation;

public class Variables02 {

    /*
    Java da temelde 2 tip data vardır
        1)Primitive data type:
           char,boolean,byte,short,int,long,float,double
        2)non-Primitive data type:
     */
    /*
    Note 1 : primitive data type larını java oluşturmuştur, biz oluşturamayız
    Note 2 : primitive data typlerinin isimlerininde sadece küçük harf kullanılır
    Note 3 : primitive data lar data type larına gore memory de farklı farklı yer kaplar
    Note 4 : primitive data lar içlerinde SADECE sizin atadığınız değerler barındırır. bu sorular iş alımda çıkar. interwiew

     */
      /*
      Non-primitive data types
      Ornek => String ......
      * Uretilen her bir class aynı zamanda bir non-primitive data type dir.(herkes üretebilir)
          Bu yuzden non-primitive data type ler sınırsız sayıdadır denebilir
      * Non-primitive data type lerin isimleri büyük harfle başlar
      *Non-primitive ler için java memory de büyüklüğüne göre  değişen boyutlarda yer ayırır.
       */
    public static void main(String[] args) {
        //Ornek : Ulke ismi için bir variable oluşturun ve ekrana yazdırın
        String ulkeIsmı = "Turkiye";
        System.out.println(ulkeIsmı);

        /*
        Interview sorusu: "primitive" ve "non-primitive" data type ları arasındaki fark nedir?
        1) "primitive" ler sadece bizim atadığımız değeri içerir
           "non-primitive" ler bizim atadığımız değeri ve method ları içerir
        2) "primitive" ler kucuk harfle başlar , "non-primitive"ler buyuk harfle başlar
        3)"primitiv" leri java üretmiştir ve 8 tanedir,
           "non-primitiv" leri java ve devoloperlar üretebilir , sınırsız sayıdadır
        4)"primitive" ler memory de dta typle larına gore sabit boyutta bellek kullanılabilir
          "non-primitive"ler için java memory de büyüklüğüne göre değişen boyutlarda bellek kullanabilirler

         */


    }

}
