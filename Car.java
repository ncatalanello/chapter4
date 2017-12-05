/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car
{
    private String model;
    private int year;

    
    public Car(String name, int age)
    {
       this.model = name;
       this.year = age;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String toString() {
        return "This is a " + model + " built in " + year;
    }
    public String getModel() {
        return this.model;
    }
    public int getYear() {
        return this.year;
    }
    public boolean equals(Car otherCar){
        if(this.model.equals(otherCar.model) && this.year == otherCar.year){
            return true;
        }
        else{
         return false;   
        }
    }
    
}