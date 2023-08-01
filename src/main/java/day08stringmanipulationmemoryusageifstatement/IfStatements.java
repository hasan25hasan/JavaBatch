package day08stringmanipulationmemoryusageifstatement;

public class IfStatements {
    public static void main(String[] args) {
        //if statements
        //bazı kodları bazı sartlara gore aktive edebilmek icin if statements kullanilir
        //if eger demek ==> if cumlesi

        //if you study hard, you eill leran java ==> english (ingilizce mantıgı)

        /*
        if(you study haard){
        you will learn Java   ==>Java (Java mantıgı)
        }

         */

        //Ornek 1 : Sayi pozitif ise ekrana pozitif yazdirin

        int num= 13;

        if (num>0){
            System.out.println(num+"==> pozitiftir");

        }

        //Ornek 2 : sayı -1 ile 10 arasında ise ekrana "Rakam" yazdırınız
        // -1<n<1 ==> n>-1 && n<10
        int n=5;

        if (n>-1 && n<10){
            System.out.println("Rakam");

        }




    }


}
