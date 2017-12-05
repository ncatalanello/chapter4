

public class Library
{
    private Book[] books;
    private String libraryName;
    private int index = 0;
    
    public Library(String libNm, int size)
    {
        this.libraryName = libNm;
        this.books = new Book[size];
        }
    public String toString() {
        String output = "This library has: \n";
        for (Book b : books){
            output +=b + "\n";
        }
        return output;
    }
    public void addBook(Book otherBook){
        this.books[index] = otherBook;
        index++;
    }
    public void addBook(Book b, int i){
        books[i] = b;
    }
}