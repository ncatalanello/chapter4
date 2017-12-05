

public class Name
{
    private String firstName;
    private String middleName;
    private String lastName;
    public Name (String first, String middle, String last){
        this.firstName = first;
        this.middleName = middle;
        this.lastName = last;
    }
    public String getFirst(){
        return this.firstName;
    }
    public String getMiddle(){
        return this.middleName;
    }
    public String getLast(){
        return this.lastName;
    }
    public String firstMiddleLast() {
        return this.firstName + " " + this.middleName + " " + this.lastName;
    }
    public String lastMiddleFirst() {
        return this.lastName + ", " + this.middleName + ", " + this.firstName;
    }
    public boolean equals(Name otherName){
        if (this.firstName.equalsIgnoreCase(otherName.firstName) && this.middleName.equalsIgnoreCase(otherName.middleName) && this.lastName.equalsIgnoreCase(otherName.lastName)){
            return true;   
        }
        else{
            return false;
        }
    }
    public String initials() {
        return "The initials are " + firstName.substring(0,1) + "." + middleName.substring(0,1) + "." + lastName.substring(0,1);
    }
    public int length(){
        return (firstName.length()+middleName.length()+lastName.length());
    }
}