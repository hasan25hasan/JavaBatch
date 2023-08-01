package day08stringmanipulationmemoryusageifstatement;

import java.sql.SQLOutput;

public class StringManipulation02 {
    public static void main(String[] args) {
        //Ornek 1 : Bir string in belirli bir karakterinden baslayarak belirli bir karaktere kadar dynamic olarak alınız
        //       abc@gmail.com ===>

        String a ="abc@gmail.com";

        int startingIndex=a.indexOf('@')+1;
        int endingIndex=a.indexOf('.');
        String companyName =a.substring(startingIndex,endingIndex);
        System.out.println("companyName="+companyName);

        //Ornek 2: Verilen iki sitring in birbirinin aynisi olup olmadıgını kontrol eden kodu yazınız
        String h ="ali Can";
        String i ="Ali Can";
        boolean result=h.equals(i);
        System.out.println(result);//false

        //Java da Memory kullanımı
        /*
        Java da iki türlü mamory vardır
        1)Stack Memory ==> small
        a)Kucuk memory dir
        b)Primitive lerive Non-Primitivelerin adreslerini(reference) tutar

        2)Heap Memory ==>Huge
        a)Buyuk memory dir
        b)Non-Primitive datalari icerir
        ==>Java heap memory deyerleştirilen tum Non-Primitive datalar icin bir adres oluşturur
        ve bu adresi stack memory de saklar
         */

        /*
        Note: String lerin eşitliklerini kontrol ederken "==" yerine "equals() methodu kullanırız
        Neden kullanırız?
        Cunku;"==" sembolu iki string i karsilastirirken hem adreslerine hemde degelerine bakar,
        İkiside ayni ise stringler esittir der,ama bir code yazarken genellikle Stringlerin adressleri ile degil
        degerleri ile ilgileniriz.Bu yuzden String karsilastirmalarinde "==" kullanmayiz

        "eguals()" methodu ise iki string i karsilastirirken sadece degerlerine bakar.Degerleri ayni ise bu iki string
        esittir der, degerler  farkli ise bu iki string farklidir der ki bu bizm kod yazarken ihtiyac duyduğumuz seydir
         */

        String s ="Tom";
        String t ="Tery";
        String r =new String("Tom");

        System.out.println(s==t);//false  cunku adresler ve degerler farklidir
        System.out.println(s.equals(t));//false cunku degerler farkli
        System.out.println(s==r);//false cunku adresler farklı
        System.out.println(s.equals(r));//true cunku eguals() sadece degerlere bakar."s" ve "r" nin degerleri ayni oldugunda true verir


        //Ornek 3:  Verilen iki sitring in birbirinin aynisi olup olmadıgını buyuk harf kucuk harf dikkate almadan
        // kontrol eden kodu yazınız
        //equalsIgnorCase() iki string in birbirinin aynisi olup olmadigini buyuk harf kucuk harf dikkate almadan kontrol eder
        String j="ali Can";
        String k="Ali Can";
        boolean result3=j.equalsIgnoreCase(k);
        System.out.println(result3);//true
        /*Homework
        1) Bir string variable olusturunuz ve bu string deki rakam olmayan tum karakterlerin sayısını console a yazdırınız
        2)Bir string variable oluşturunuz ve ilk ve son karakter disindkitum karakterleri console a buyuk harflerle yazdırınız
        3) Bir string variable oluşturunuz ve bu sstring deki ilk ve son karakterlerin ASCII degerleri toplamini console a yazdırınız
        4)Tek kelimeli bir sehir ismi icin string variable olusturun ve sehir isminin ilk harfini buyuk harfle diger harflerini kucuk harflerle
        console a yazdırın
        5) Aşağıdaki kurallara gore kullanıcın girdigi pasdword u kontrol ediniz
           a)En az 6 character olsun
           b)En azbir tane buyuk harf olsun
           c)En az bir tane kucuk harf olsun
           d)En az bir tane rakam olsun

           Note 1 :Once canli oturum sirasind cozulen ornekleri yapınız
           Note 2 :Tüm soruları dinamil kodlarla cozulmalıdır
           Note 3 : Birbirinizin cozumlerini inceleyerek tevsiyede bulunabilir yada yardım isteyebilirsiniz
         */








    }
}
