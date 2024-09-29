//4.	Create a class called Book to represent a book. A Book should include four pieces of information as instance variables‐a book name, an ISBN number, an author name and a publisher. Your class should have a constructor that initializes the four instance variables. Provide a set method and get method for each instance variable. In addition, provide a method named getBookInfo that returns the description of the book as a String.
public class Book {
    String bookName;
    String isbnNumber;
    String authorName;
    String publisher;

    public Book(String bookName, String isbnNumber, String authorName, String publisher) {
        this.bookName = bookName;
        this.isbnNumber = isbnNumber;
        this.authorName = authorName;
        this.publisher = publisher;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getBookName() {
        return bookName;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getBookInfo() {
        return "Book Name: " + bookName + "\n" +
               "ISBN Number: " + isbnNumber + "\n" +
               "Author Name: " + authorName + "\n" +
               "Publisher: " + publisher;
    }

    public static void main(String[] args) {
        Book book1 = new Book("Java", "978", "Bloch", "Wesley");
        System.out.println(book1.getBookInfo());
        book1.setBookName("Java (2nd Edition)");
        System.out.println("\nUpdated Book Information:");
        System.out.println(book1.getBookInfo());
    }
}
