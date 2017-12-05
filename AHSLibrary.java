


public class AHSLibrary
{
    public static void main(String[]args) {
        Library acalanes = new Library ("Acalanes Library", 30);
        Author john = new Author ("John", 21);
        Book a = new Book ("Book a", john);
        Author kate = new Author ("Kate", 22);
        Book b = new Book ("Book b", kate);
        acalanes.addBook(a);
        acalanes.addBook(b);
        System.out.println(acalanes);
    }
}