
/**
 * Write a description of class CarDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CarDriver
{
    public static void main(String[]args){
        Car myCar = new Car ("Datsun 240z", 1972);
        Car yourCar = new Car ("Datsun 240z", 1972);
        System.out.println(myCar.toString());
        System.out.println(myCar.equals(yourCar));
    }
}