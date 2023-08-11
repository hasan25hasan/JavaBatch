package day25inheritance;

public class Animal {

    //Inheritance ==> miras alma
    /*
    Ozellikleri bir classtan diger classlara alan bir kavramdir
    Mesela siz bir class olusturmak istiyorsunuz ama daha once olusturulmus bir class
     sizin istediginiz ozelliklerin cogunu kapsiyor. O zaman yeni olusturdugunuz classi ozelliklerini kullanmak
     istediginiz class'a child yaparsiniz

     Inheritance'in faydalari
     1) Code tekrarlarindan kurtuluruz
     2) Code tamiri(maintenance)  kolay olur
     3) Child classlari daha atomic yapmis oluruz

     => Bir classi baska bir classin child classi yapmak icin
     extends keywordu kullanilir. Ilk yazilan child, ikinci yazilan class
     parent olur, parent class'a super class da denir

     => child class objectleri parent class tan method ve variable lari kullanabilirler
     => Parent class objectleri child classtan method ve variablelari kullanamazlar

     =>java da classin sadace 1 tane parent i olabilir . coklu parent a "Multiple Inheritance" derler
     tekli parent a "single inheritance" derler.Java  "Multiple Inheritance" i desteklemez.Java  single inheritance kullanir

     =>Apartman seklindeki inheritance yapisina "Multilevel Inheritance" denir, java multilevel inheritanece i destekler

     =>Object class her classin parent idir. java da object class haric her classin paraen i vardir
        Java da parent i olmayan tek class object classdir

        =>Java da parent dan child a olan iliskilere "HAS-A Relation Ship" denir
           child dan  parent a  olan iliskilere "IS-A Relation Ship" denir

       => javada her classin bir tane default constructoru vardir. Bu default constructor classin icinde gorunmez
         cunku default constructor "Object Class" icindedir.








     */

    public void eat() {
        System.out.println("Animal eat...");
    }

    public void drink() {
        System.out.println("Animal drink...");
    }










}
