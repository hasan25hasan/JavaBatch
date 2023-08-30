package day32exceptions;

public class E02 {
    public static void main(String[] args) {

        Object obj=70;
        try {
            String  str=(String) obj;
            System.out.println(str);
        } catch (Exception e) {
            System.err.println("Her data ytoeknxj");

        }

    }

}
