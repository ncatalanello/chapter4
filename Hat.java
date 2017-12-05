
/**
 * Write a description of class Hat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hat
{
    private int size;
    private String color;
    private boolean fit;
    
    public Hat(int sz, String clr, boolean ft){
        this.size = sz;
        this.color = clr;
        this.fit = ft;
    }
    public void SetFit(boolean ft){
         this.fit = ft;
    }
    public String getColor(){
        return this.color;
    }
    public String toString(){
        return "This hats color is: " + color;
    }
    
}