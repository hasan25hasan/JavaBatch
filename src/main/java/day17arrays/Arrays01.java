package day17arrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        //Arrayleri kisa yoldan nasil olusturabiliriz?
        int arr []={63,19,313,353,7,100,4};
        System.out.println(Arrays.toString(arr));

        //Ornek 1:Verilen array da kac tane cift sayı kac tane tek sayi oldugunu bulan kodu yazınız

        int sayac=0;

        for (int w :  arr ) {

            if(w%2==0){
                sayac++;
            }
        }
        System.out.println("Array de "+sayac+" adet cift sayi "+ (arr.length-sayac)+" adet tek sayi kullanilmistir");

        //Ornek2: Size verilen bir String arraydeki 5 karakter den az karakter icerenleri konsola yazdiriniz


        String  stdNames [] =  new String [5];
        stdNames [0] ="Ajda";
        stdNames [3] ="Cuneyt";
        stdNames [2] ="Tom";
        stdNames [1] ="Ayhan";
        stdNames [4] ="Filiz";
        System.out.println(Arrays.toString(stdNames));

        //[Ajda, Ayhan, Tom, Cuneyt, Filiz]
        for(String w: stdNames){

            if(w.length()<5){
                System.out.println(w);

            }
        }

        //Ornek 3: Bize verilen bir string arraydeki isimleri alfabetik siraya koyduktan sonra
        // F ile baslayan isimler haricdiger isimleri consola yazdiriniz

        //Note sort() mertodu sayisal data tplelari kucukten buyuge siralar .(ascending order)
        //Note sort() methodu String data typelari alfabetik olarak siralar.(alphabetic order)
        //Note 3 (ascending order)  +(alphabetic order) =Natural order
        //Note 4 sort() methodu array elemanlarini (Natural order) a gore siralar.


        Arrays.sort(stdNames);
        System.out.println(Arrays.toString(stdNames));//[Ajda, Ayhan, Cuneyt, Filiz, Tom]

        for(String w : stdNames){

            if(w.startsWith("F")){
                continue;
            }
            System.out.println(w);
        }


    }

}

