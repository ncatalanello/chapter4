// ****************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades,
//   compute the average, and return a string containing student's info.
// ****************************************************************
import java.util.Scanner;
public class Student
{
    //declare instance data
    private String name;
    private double test1;
    private double test2;
    //constructor
    //-----------------------------------------------
    public Student(String studentName)
    {
        this.name = studentName;
    }
    //-----------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //-----------------------------------------------
    public void inputGrades()
    {
        //add body of inputGrades
        Scanner scan = new Scanner(System.in);
        System.out.println("What was the score on test 1 for " +this.name+ "?");
        this.test1 = scan.nextDouble();
        System.out.println("What was the score on test 2 for " +this.name+ "?");
        this.test2 = scan.nextDouble();
    }
    //-----------------------------------------------
    //getAverage: compute and return the student's test average
    public double getAverage(){
        return (test1+test2)/2.0;
    }
    //-----------------------------------------------
    //getName: returns private name
    public String getName(){
        return this.name;
    }
    //-----------------------------------------------
    //getName: return the student's name
    //-----------------------------------------------
    //add header for getName
    public String toString(){
        return "The average between: " +test1+ " and " +test2+ " is " + this.getAverage();
    }
    
    {
        //add body of printName
    }
}