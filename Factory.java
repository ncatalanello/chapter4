

public class Factory
{
    private double squareFoot;
    private Car[] inventory;
    public Factory(double sqFt, int number){
        this.squareFoot = sqFt;
        this.inventory = new Car[number];
        
    }
    public void setCar(Car c, int index){
        inventory[index] = c;
        
    }
    public String toString() {
        String output = "This factory has \n";
        for (Car c : inventory){
            output += c + "\n";
        }
        return output;
    }
}