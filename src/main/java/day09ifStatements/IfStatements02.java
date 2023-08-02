package day09ifStatements;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {
        //Ornek : Kullanıcıdan alınan bir sayının tek mi çift mi oldugunu yazdıran kodu yazınız

        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz..");
        int num =input.nextInt();
        //1. yol
        /*
        if (num% 2 == 0) {

            System.out.println("cift sayıdır");

        }

        if (num % 2 != 0){
            System.out.println("tek sayıdır");

    }
      */

        //2.yol
        if(num%2==0) {
            System.out.println("cift sayıdır..");

        }else{

            System.out.println("tek sayıdır..");



        }


    }
}
