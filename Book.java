

public class Book
{
    private String title;
    private Author nm;
    
    public Book(String ttl, Author name)
    {
        this.title = ttl;
        this.nm = name;
        
    }
    public String toString() {
        return "The title of this book is " +title+ ". The author is " +nm;
    }
}