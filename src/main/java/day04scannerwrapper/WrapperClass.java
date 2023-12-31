package day04scannerwrapper;

public class WrapperClass {
    public static void main(String[] args) {

        //primitive     :   char     -  boolean - byte - short - int     - long  - float - double
        //Wrapper Class :  Character -  Boolean - Byte - Short - Integer - Long  - Float - Double

        //Wrapper class lar non-primitive dir. o yuzden memory de cok yer kaplarlar
        //o yuzden sart degilse  Wrapper class kullanmayi tercih etmeyiz
        //n yazip nokta koyarsaniz hic method goremezsiniz, cunku primitive ler method icermez
        int n = 12;

        //m yazip nokta koyarsaniz bircok method gorursunuz, cunku wrapper classlar method icerir
        Integer m=12;

        byte p = 13;
        Byte r = 13;

        //Ornek 1: short data type inin minimum ve maximum degerlerin kod yazarak bulunuz
        short maxShort = Short.MAX_VALUE;
        System.out.println("maxShort = " + maxShort);//maxShort = 32767

        short minShort = Short.MIN_VALUE;
        System.out.println("minShort = " + minShort);//minShort = -32768


        //ornek 2 : int data type nın minimum değeri ile byte data type nin maximum değerleri toplamını bulunuz
        int intMİN= Integer.MIN_VALUE;
        byte byteMax = Byte.MAX_VALUE;
        System.out.println( intMİN+byteMax);//-2147483521







//Ornek 3: Primitive int i Wrapper Integer a ceviriniz.(AutoBoxing)
        int num = 19;
        Integer wrapperNum = num;

        //Ornek 4: Wrapper Byte i primitive byte a ceviriniz(Unboxing)
        Byte k = 19;
        byte primitiveK = k;

        //Ornek 5: Primitive char i Wrapper Character e ceviriniz(Autoboxing)
        char initial = 'T';
        Character initialWrapper = initial;

        //Ornek 6: Wrapper Boolean i primitive boolean a ceviriniz(Unboxing)
        Boolean isOldWrapper =true;
        boolean isOld = isOldWrapper;





    }

}