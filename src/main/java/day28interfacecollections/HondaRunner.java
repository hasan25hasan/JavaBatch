package day28interfacecollections;

public class HondaRunner {
    public static void main(String[] args) {
        Civic myCivic=new Civic();
        myCivic.cool();//Civic cools perfectly
        myCivic.run();

        Accord myAccord=new Accord();
        myAccord.cool();//Accord cools super
        myAccord.run();

        System.out.println("AC Price"+Ac.price);//2000
        System.out.println("Engine Price"+Engine.price);//3000
        System.out.println("Security Price"+Security.price);//5000


    }
}
