package day08stringmanipulationmemoryusageifstatement;

import javax.sound.midi.Soundbank;

public class StringManipulation01 {
    public static void main(String[] args) {
        //Ornek 1: Bir string in hic character icermedigini(Bos string oldugunu) kontrol eden kodu yazınız
        //1. yol length() ile cozum
        String str= "";
        boolean result1 = str.length()==0;
        System.out.println("String bos mu? " + result1);

        //2. yol tavsiye edilir
        //Java eger bir konuda method olusturmussa , o methodu kullanmak en iyisidir
        boolean result2=str.isEmpty();
        System.out.println("İs Empty ? " + result2);

        //Ornek 2 : Bir String in space haric hicbir character icermedigini kontrol eden kodu yaziniz
        String t="       ";
        //1. yol
        boolean result3=t.replace(" ", "").length()==0;
        System.out.println(result3);

        //2. yol
        boolean result4=t.replace(" ", "").isEmpty();
        System.out.println(result4);

        //3. yol
        boolean result5=t.isBlank();
        System.out.println(result5);
        //isBlank() methodu sadece spaca iceren String ler icin true verir, space disinda bir character var ise false verir
        //isBlank() methodu bos stringler icin de true verir
        //isBlank() methodu space + hic bir sey icin true verir
        //isEmpty() methodu sadece hic bir sey icin true verir
        //Not: isBlank() methodu metinsel anlamda (kelime) anlamında ve sayısal anlamda bos olup olmadığına bakar.
        //Not: isEmpty() methodu ise sadece sayısal olarak boşluga bakar

        //Ornek 3: Bir String de a,e,i, characterlerinin ilk gorunumlerinin indexleri toplamını ekrna yazdırınız.
        //"Java is easy to learn"==>
        // 0123456789.....index

        String r ="Java is easy to learn";
        int idxA=r.indexOf('a');
        System.out.println(idxA);

        int idxI=r.indexOf('i');
        System.out.println(idxI);

        int idxE=r.indexOf('e');
        System.out.println(idxE);

        System.out.println(idxA+idxE+idxI);


        //Ornek 4 : Bir string deki "Java" kelimesinin ilk olarak kacıncı index te kullanıldıgını gosteren kodu yazınız
        // "Ah Java vah Java sensiz olmuyor Java ."
        //Not : indexOf("Java") kullaniminda siz "Java" kelimesinin ilk görünümündeki ilk harfin (yani J nin)index ini almış olursunuz
        String u = "Ah Java vah Java sensiz olmuyor Java .";
        int idxJava= u.indexOf("Java");
        System.out.println(idxJava);

        //indexOf() methodu olmayan characterler icin kullanilirsa her zaman -1 return eder
        int idxjava = u.indexOf("java");
        System.out.println(idxjava);

        //Ornek 5 :Bir String de a,e,i, characterlerinin son gorunumlerinin indexleri toplamını ekrna yazdırınız.
        String v="Java is easy to learn";

        int idxOfa=v.lastIndexOf('a');
        System.out.println(idxOfa);

        int idxOfe=v.lastIndexOf('e');
        System.out.println(idxOfe);

        int idxOfi=v.lastIndexOf('i');
        System.out.println(idxOfi);
        System.out.println(idxOfa+idxOfe+idxOfi);

        //Not : lastIndexOf() methodu olmayan characterler icin kullanilirsa her zaman -1 verir


    }
}
