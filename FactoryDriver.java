

public class FactoryDriver
{
    public static void main(String[]args){
        Factory tesla = new Factory (2000, 50);
        Car c = new Car ("Model 3", 2017);
        tesla.setCar(c, 0);
        System.out.println (tesla);
    }
}