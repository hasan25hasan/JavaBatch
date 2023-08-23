package day30maps;

import java.util.Arrays;
import java.util.HashMap;

public class Homework {
    public static void main(String[] args) {
        //HomeWork
        //Verilen bir String'de hangi harfin kac defa kullanildigini veren method olusturunuz.
        //"Hello Henry!" ==> H=2, e=2, l=2, o=1, n=1, r=1, y=1

        String hello="Hello Henry!";
        hello=hello.replaceAll("[\\p{Punct}\\s]","");//"Hello Henry!" veriable ni noktalama isaretlerinden arindirdik ve boslukları arindirdik
        System.out.println("Noktalama isaretleri kaldirildi" +""+  hello);

        String letter[]=hello.split("");//String olan "Hello Henry!" variable ı array e donusturdu
        System.out.println(Arrays.toString(letter));

        HashMap<String, Integer> hb = new HashMap<>();

        for ( String w:letter ) {
            Integer number=hb.get(w);
            if (number==null){//numara degiskeni eşit ise hiclige
                hb.put(w,1);// harf var ise 1 yaz
            }else hb.put(w,number+1);//eger degilse 1 ile topla

        }
        System.out.println(hb);//{r=1, e=2, H=2, y=1, l=2, n=1, o=1}


    }
}
