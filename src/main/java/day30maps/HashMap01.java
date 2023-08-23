package day30maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01 {
    public static void main(String[] args) {
      /*  sozluk yapisi map'a benzer
        solda kelime, sagda aciklamasi vardir
        soldakiler tekrarli olamaz sagda tekrar olabilir
        map te boyledir soldakiler Unique  olacak sag taraf tekrarli olabilir
        de olmayapilir repeatedly (tekrarli) olabilir
        sola unique lere key tekrarli olabilen sagdaki data lara value denir
        */

           /*
        1)  Map lerde sozluklerdeki gibi kelime ve manasi seklinde bir kullanim vardir
        2)  key kismi tekrarsiz, value kismi tekrarli olabilir
        3)  Map lerdeki her bir elemana Entry denir, tamamina ise EntrySet denir
        4)  Entry ler tekrarsiz oldugu icin EntrySet  denilir
        5)  Key ve value lar ayri ayri data typelarinda olabilirler
        6)  Map ler collection degildir, farkli bir yapidir
         */

        //Map nasil olusturulur?
        HashMap<String ,Integer> countryPopolation=new HashMap<>();
        countryPopolation.put("Germany",83000000);
        countryPopolation.put("Albania",30000000);
        countryPopolation.put("USA",400000000);
        countryPopolation.put("Turkey",83000000);
        countryPopolation.put("Netherland",83000000);
        System.out.println(countryPopolation);

        //get() methodu key ile calisir ve value kismini verir
        int usaPpopulation=countryPopolation.get("USA");
        System.out.println(usaPpopulation);//400000000

        //Butun key leri nasil alabiliriz?
        Set<String> keys=countryPopolation.keySet();
        System.out.println(keys);//[Netherland, USA, Turkey, Germany, Albania]

        //Butun value lari nasil alabiliriz?
        Collection<Integer> values=countryPopolation.values();
        System.out.println(values);//[83000000, 400000000, 83000000, 83000000, 30000000]

        //Ornek 1 : countryPopulation map indeki ulkelerin nufuslarinin ortalamasi kaçtir?
        Collection<Integer> value=countryPopolation.values();
        int sum=0;
        for (Integer w:value ) {
            sum=sum+w;

        }
        System.out.println(sum/ value.size());//135800000

        //entrySet()maptaki entry leri kalip halinde alip bize Set in icine koyarak verir
        //Loop lar mapler ile kullanilamaz.bunun icin entryset methodu kullaniriz(forlar ile yaparken bu yontem kullanilir)
        Set<Map.Entry<String ,Integer>> entries=countryPopolation.entrySet();
        System.out.println(entries);

        //Ornek 2: countryPopolation Map indeki ulkelerin isimlerinin  character sayisi ile nüfuslarinin toplamini bulunuz.
        int toplam=0;
        for (  Map.Entry<String ,Integer> w:entries){
            toplam=toplam+w.getKey().length()+ w.getValue();

        }
        System.out.println(toplam);//679000033









    }
}
