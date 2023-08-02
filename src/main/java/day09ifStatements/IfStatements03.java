package day09ifStatements;

import java.util.Scanner;

public class IfStatements03 {
    public static void main(String[] args) {
        //Ornek : Kullanıcının vermis oldugu character buyuk harf ise ekrana "Buyuk Harf",
        //kucuk harf ise ekrana "Kucuk Harf" yazdıran kodu olusturunuz

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen bir character giriniz..");
        char ch=input.next().charAt(0);
        //1. yol
        /*if(ch>='A' && ch <='Z'){
            System.out.println("Buyuk harf");
    }

       if (ch>='a' && ch <='z'){
           System.out.println("Kucuk harf");
    }*/

        //2. yol
        if (ch>='A' && ch<='Z') {
            System.out.println("Buyuk harf");
        } else if (ch>='a' && ch<='z') {
            System.out.println("Kucuk harf");

        }else {
            System.out.println("Harf degil");

        }
    }


}

