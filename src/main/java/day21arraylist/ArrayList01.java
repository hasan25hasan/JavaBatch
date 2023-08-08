package day21arraylist;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {

     /*
     1)Ayni data type indaki coklu datalari depolamak icin Array kullaniliriz
     2)Arraylarin negatif bir yönü var, icine koyacaginiz eleman sayisini en basta belirlemek zorundasiniz
     3)Arrayler eleman sayisinda esnek degildirler, bu yuzden java Arraylist adli bir yapi olusturdu
     Bu  yapi eleman sayisinda esnektir.Hiç eleman koymazsaniz eleman sayisini sifir olarak ayarlar,
     1000 eleman koyarsanız eleman sayisini 1000 olarak ayarlar
     4)Arraylist yerine sadece List de diyebilirsiniz
     5)Java Arraylist leri olusturduktan sonra Array leri iptal etmedi çunku;
          a)Array ler super hizlidir
          b)Array lae memory de cok az yer kaplar
          c)Bu nedenle eleman sayisi belli olan dataları depolamak icin Array ler tercih edilir
      6)Array ler pirimitive data type lari ve referanslari depolayabilir
        Ama ArrayList ler non-pirimitive data type lari depolar,bu nedenle ArrayList ler Array lerden dafa fazla yer kaplarlar

      */

        //ArrayList nasil olusturulur?
        ArrayList<Integer> ages = new ArrayList<Integer>();

        //ArrayList console a nasil yazdirilir?
        System.out.println(ages);

        //ArrayList lere eleman nasi eklenir
        //ArrayList lere eleman eklemekmicin add() methodu kullaniriz
        //add() methodu elemanlari sizin verdiginiz sirada "list"e ekler ( insertion order)
        ages.add(9);
        ages.add(12);
        ages.add(10);
        ages.add(1,656);
        ages.add(3,777);
        ages.add(888);
        System.out.println(ages);

        //List e coklu eleman nasil eklenir? veya Liste baska bir list nasil eklenir?
        //Bir List e coklu eleman eklemek icin o elemanlari oncelikle bir Listin icine koymalisiniz

        ArrayList<Integer>newAges=new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);
        System.out.println(newAges);

        ages.addAll(newAges);
        System.out.println(ages);

        ages.addAll(2,newAges);
        System.out.println(ages);

        //ArrayList te eleman sayisi nasil bulunur
        //size() methodu bir List deki eleman sayisini verir
        int numOfElemen =ages.size();
        System.out.println(numOfElemen);//12

        //ArrayList de specific bir eleman nasil alinir?
        //get() methodu index kullanarak istedigimiz elemani almaya yarar
        int el1=ages.get(1);
        System.out.println(el1);//656

        //ArrayList de specific bir elemani nasil degistirebiliriz?
        ages.set(6,111);
        ages.set(4,313);
        System.out.println(ages);

        //Bir List de tum elemanlari nasil silebiliriz?
        ages.clear();
        System.out.println(ages);

        //ArrayList e specific bir elemanin var olup olmadigini nasil anlariz?

        boolean r =ages.contains(313);
        System.out.println(r);

        //Bir ArryList in bos olup olmadigini nasil kontrol ederiz?
        //isEmpty() methodu ArrayList bos ise true bos degil ise false return eder
        boolean r2=ages.isEmpty();
        System.out.println(r2);

        //Example 1 :Size verilen bir List in bos olup olmadigini kontrol eden kodu yaziniz.
        ArrayList<String> names=new ArrayList<>();
        names.add("Gulce");
        names.add("Seda");
        names.add("Benna");
        names.add("Rıdvan");
        names.add("Enes");

        //1. yol
        if(names.size()==0){
            System.out.println("List is empty");
        }else{
            System.out.println("List has at least 1 element");
        }

        names.clear();

        //2. yol (tavsiye edilir)
        if (names.isEmpty()){
            System.out.println("List is empty");

        }else {
            System.out.println("List has at least 1 element");
        }

        /*
        Bit methodu ögrenirken asagıdaki 3 seyi ögenin
        1)O method ne iş yapar?
        2)Omethod nasil kullanilir?
        3)Omethodsize neyi verir?
         */


















    }
}
