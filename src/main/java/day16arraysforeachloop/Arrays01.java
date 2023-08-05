package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        int a=13;
        //Bu yapinin icinde sadece bir tane data depolanabilir.
        //Ama biz kod yazarken yapının icinde coklu data depolama ihtiyaci hissederiz
        //Bir yapının içinde çoklu data depolayabilmek icin Java Array yapisini olusturmustur

        //Array nasil olusturulur?
        String stdNames [] =new String[5];
        //Arreyler konsola nasıl yazdirilir
        System.out.println(Arrays.toString(stdNames));

        /*
        Arrayler diger collectiondan cok cok daha hizlidir(Superfast)
        Arrayler diger collectionlardan daha az memory kullanirler
         */

        //Array e nasıl eleman ekleme yapilir?
        stdNames[2]="Benna";
        stdNames[3]="Abdullah";
        stdNames[4]="Recep";
        stdNames[0]="Ekim";
        stdNames[1]="Hasan";
        System.out.println(Arrays.toString(stdNames));

        //Array den specific bir elemani nasıl aliriz
        System.out.println(stdNames[3]);
        System.out.println(stdNames[4]);


        //Ornek1:Arraydeki her elemanın sonuna "!" isareti koyarak ekrana yazdiriniz
        //length() string lerde method (parantezli), array lerde ise parantezsiz yazilir(method degil)

        for(int i =0; i<stdNames.length;  i++){
            System.out.println(stdNames[i]+"!");
        }








    }
}
