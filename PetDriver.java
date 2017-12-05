
/**
 * Write a description of class PetDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PetDriver
{
    
    public static void main(String[]args)
    {
        Pet whilly = new Pet (10, 35, "Whilly", true);
        Pet billy = new Pet(10,23,"Billy", true);
        System.out.println(whilly);
        Pet.example();
        System.out.println("Number of pets: " + Pet.numPets);
        
    }

}