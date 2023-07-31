package day06swapvaluesstringmanipulations;

import javax.lang.model.SourceVersion;

public class StringManipulations01 {
    public static void main(String[] args) {
        //String bir non-primitive data type dir ve ayni zamanda bir classdir
        String s = "Java is easy";

        //Ornek1: "s" Stringindeki tum characterleri buyuk harf yapiniz
        String sUpper = s.toUpperCase();
        System.out.println(sUpper);//JAVA İS EASY

        //Ornek2:"s" Stringindeki charecterleri kucuk harf yapınız
        String sLower = s.toLowerCase();

        System.out.println(sLower);

        //Ornek3: "s" String'indeki ilk charakterleri aliniz?
        char firstChar=s.charAt(0);
        System.out.println(firstChar);

        //Ornek4: "s" Stringideki bastan ikinci ve sondan ikinci  karakteri alıp yazdıralım
        char secondChars=s.charAt(1);
        char secondLastChar=s.charAt(10);
        System.out.println(""+secondChars+secondLastChar);//as

        //Ornek5: "s" stringinde kullanılan character sayisini bulunuz
        int sLenght =s.length();
        System.out.println(sLenght);//12

        //Ornek 6:"s" String indeki ilk dort karaktericalınız
        //s.substring(0,4)==> bu kullanımda ilk index dahilidir,ikinci index harictir.
        String sub1=s.substring(0,4);
        System.out.println(sub1);

        //Ornek 7:"s"String'ındekı "is" kelimesini alınız
        String sub2 =s.substring(5,7);
        System.out.println(sub2);//is

        //Ornek 8:"s"" String indeki "easy" kelimesini aliniz
        String sub3= s.substring(8,12);
        System.out.println(sub3);//easy

        //İkinci yol:
        String sub4=s.substring(8);
        System.out.println(sub4);//easy

        //Ornek9:"s"" String inde "money" kelimesinin var olup olmadığını kontrol ediniz
        boolean isExist=s.contains("money");
        System.out.println(isExist);

        //Ornek10 : "s"" String inin belli  bir baslayıp baslamadıgını kontrol ediniz
        boolean isStart=s.startsWith("Java");
        System.out.println(isStart);

        //Ornek11: "s" String inin 5. index dahil olmak uzere bu index den itibaren "i" karakteri ile başlayıp
        //başlamadığını kontroleden kod yazınız.
        boolean isBegin= s.startsWith("i",5);
        System.out.println(isBegin);


    }
}
