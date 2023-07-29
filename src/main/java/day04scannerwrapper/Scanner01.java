package day04scannerwrapper;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //Ornek : Kullanıcıdan ilk ismini ve soy ismini alıp ikisini aynı satırda ekrana yazdırınız.

        //1. adım :Scanner class tan bir object oluştur
        Scanner input = new Scanner(System.in);

        //2. adım: Kullanıcıya ne istediğinize dair mesaj verin
        System.out.println("ilk ismini giriniz..");

        //3. adim : Uygun methodu kullanarak kullanıcının verdiği datayı memory e yerleştiriniz
        //next() methodu kullanıcıdan tek kelimeli string almak için kullanılır
        String firstName =input.next();

        System.out.println("Soy isminizi giriniz...");
        String lastName = input.next();

        System.out.println(firstName+" "+lastName);



    }

}

