package day15loops;

import java.util.Scanner;

public class WhileLoop02 {
    public static void main(String[] args) {

        //Example 1: Kullanicinin verdigi sayi icin carpim tablosunu olusturup console'a yazdiran kodu yaziniz
/*            3 ==> 3x1=3
                    3x2=6
                    3x3=9
                    3x4=12 ...
                    3x10=30*/

        Scanner input= new Scanner(System.in);
        System.out.println("Carpım tablosunu gormek icin bir sayi giriniz...");
        int num=input.nextInt();

        int i=1;
        while(i<11){
            System.out.println(num+" * "+i+" = "+(num*i));

            i++;

        }

        //Example 2: Verilen bir string de her harfin sonrasına "*" sembolu ekleyiniz
        //      Java ==> J*a*v*a*
        // class da scanner input oldugu için ikinci sefere tekrar scanner yazmaya gerek yoktur
        System.out.println("Bir kelime giriniz");
        String word=input.next();
        String newWord="";

        int a=0;
        while (a<word.length()){
            newWord=newWord+ word.charAt(a)+"*";
            a++;
        }
        System.out.println(newWord);

        //Example 3: Bir string deki tekrarsız karakterleri konsola yazdırınız(İnterwiew sorusu)
        // kertenkelle ==> rtn
        // indexOf("k") ==> 0  farkli, tekrarli
        // lastIndexOf("k") ==> 6

        // indexOf("r") ==> 2  ayni ise tekrarsiz
        // lastIndexOf("r") ==> 2

        String s = "kertenkelle";
        String sonuc = "";
        int b = 0;
        while (b < s.length()) {
            char ch = s.charAt(b);
            if (s.indexOf(ch) == s.lastIndexOf(ch)) {
                sonuc = sonuc + ch;
            }
            b++;
        }
        System.out.println(sonuc);














    }
}
