package day01variables;//içinde bulunulan pacge ismi

public class Variables01 {

    public static void main(String[] args) {
        //java bu satırı okumaz, Kendimize veya başkalarına açıklamadır.
        /*
        java bu satırlarıda okumaz
         */

        //Variable nasıl oluşturulur?
        //Data Type + Variable name + Atama Operatörü (Assigement operatorü) + Variable değeri + Noktalı virgül
        int             age                            =                            13             ;

        //java cümlesi => statement
        //Dilbilgisindeki nokta ne ise javadaki '';'' aynı şeydir, yani statement in bittiğini gösterir
        //Eğer variable declaration yapar, Assigment yapmazsanız java kendi default değerlerini koyar
        //Default değer sayılar için sıfırdır.
        //Java ''='' assiginment oparatör ve java bu oparatörü gördüğü zaman önce sağ tarafı çalıştırır.
        //ve sağdaki değeri alır soldaki kutuya koyar
        //Javada eşittir demek ''==''           Matemetikte ''='' , Javada ''==''
        //Data type + variableName ===> Variable declaration
        //Assigment operatör (=) + Variable değeri ==> Assigment

        /*
        Java da temel de iki tip data vardır;
           1)Primitive data type:
               char, boolean, byte, short, int, long, float, double
           2)non-primitive data type:
               String
         */
        //Ornek 1: Öğrenci ismi için variable oluşturup değer olarak Ali Can atayınız
        String ogrenciAdi = "Ali Can" ;

        //Stringlere verilen değerler daima çift tırnak içinde olmalıdır
        //Stringler için default value (varsayılan değer) "nuul" dir
        /*
        String variable oluşturduğumuzda çoğu zaman ona bir değer atar.Atama yapmazsak java da variable için varsayılan
        değer olarak null koyar
        *null demek 0 demek değildir , 0 da coding te bir değerdir, null ise hiçlik demektir
        *null demek içinde variable veya method bulunmayan boş bir objedir
        *   {}==>eleman yok    {0}==> elemanı sıfır
         */

        //char data type:
        // Tek karakterler için kullanılır.Sayı sembol yada harf farketmez
        //Ornegin ==> A, X,4,?
        //Ornek 2: char data type inda bir ismin ilk harfi olarak bir variable oluşturunuz ve bir değer atayınız
        char İsminİlkHarfi = 'A' ;
        //Note : char data type ında değerler tek tırnak içinde konulmalıdır

        //boolean data type:
        //boolean'lar sadece iki farklı değer alabilir ; true veya false
        //isimlendirme yapılırken başına is konulur
        //ornek 3 : boolean data type inda emeklimisin sorusu için bir variable oluşturun ve falsa değerini atayın
        Boolean emeklimisin = false;

        //byte data type:
        //tam sayılar içindir, hafızada 2 byte yer kaplar
        //byte: - 128 den başlar + 127 e tamsayı değerleri için kullanılır
        //Ornek 4: byte data type inda öğrenci yaşı oluşturun ve değer atayın
        byte ogrenciYasi = 127;

        //short data type:tam sayılar içindir, hafızada 2 byte yer  kaplar
        //short : -32768 den + 32767 dahil değerler

        short siteNüfusu = 1350;

        //İnt data type:
        //tam sayılar içindir, hafızada 4 byte yer kaplar
        //int :-2,147,648 ile 2,483,647 ye kadar
        int ülkeNüfusu = 25458455 ;

        //long data type :
        //tam sayılar içindir, hafızada 8 byte yer kaplar
        //ornek
        long hücresayısı = 654546516545646555L;
        //note:Bir değer long ise sonuna  "L" yada "l"koyulur ama genelde büyük "L" kullanmalıyız
        //Eğer long'a atadığınız değer int' lerin aralığında ise sonuna L koymaya gerek yok
        //long dememize rağmen sonuna L koymazsak eğer int aralığında ise java onu int kabul eder

        //float data type:
        //virgüllü sayılar (ondalık sayılar) için kullanılır.(fiyatlandırmalar örnek olabilir)

        //ornek 8 : Gomlek ve ayakkabı fiyatları için iki tane variable oluşturunuz
        float gömlekFiyatı = 12.99F;
        float ayakkabıFiyatı = 15.99F;

        //Note:java ondalıktaki sayıları otomatik olarak double kabul eder
        //4 byte yer kaplar

        //double data type :
        //double memory de 8 byte yer kaplar, ondalıklı kısım için daha fazla rakam alır
        //ondalıklı sayılar için  kullanılır
        //Ornek 9  : Hücre ağırlığı ve amip in ağırlığı için oluşturunuz
        double weigthCell = 0.00000000000113;
        double weightAmip = 0.000000000000015;

        //Ornek 10 = Öğrenci notları için iki adet variable oluşturunuz  ve toplamlarını ekrana yazdırınız


        //----------ekrana yazdırmak için-----------
        System.out.println(5);//ekrana yazdırmak içindir ve pointer i bir sonraki satıra koyar
        System.out.print(15);//ekrana yazdırır ve pointer i aynı satırda tutar

        byte note1=55;
        byte note2=33;
        System.out.println(note1+note2);

        //homework
        /*
        1) 3 farklı data türünde variable oluşturun ve bunları farklı satırlarda yazdırın
        2)ülke ve şehir isimleri için iki variable oluşturun ve bunları yazdırın
        3)iki tamsayı türünde variable oluşturup toplamını yazdırın.


         */


















    }











}
