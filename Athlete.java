
public class Athlete
{
    private String name;
    private int age;
    
    public Athlete(String nm, int ag)
    {
        this.name = nm;
        this.age = ag;
    }
    
    public  void setAge(int newAge){
        this.age = newAge;
    }
    
    public String toString(){
        return name + " is an athlete who is " + age + " years old.";
    }
}