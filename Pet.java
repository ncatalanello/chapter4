
public class Pet
{
    private int age;
    private int weight;
    private String name;
    private boolean alive;
    public static int numPets;
    public Pet(int old, int mass, String nm, boolean al) {
        this.age = old;
        this.weight = mass;
        this.name = nm;
        this.alive = al;
        numPets++;
    }
    public static void example(){
        System.out.println("This is Static!");
    }
    public void setAlive(boolean al){
     this.alive = al;   
    }
    public String getName(){
        return this.name;
    }
    public String toString(){
        return "This pets name is: " + this.name;
    }
}