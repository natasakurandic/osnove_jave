package d11_09_2023;

public class Book {

    private String isbn;
    private String bookName;
    private int yearOfPublication;
    private Author author;

    public Book () {

    }
    public Book (String isbn, String bookName, int yearOfPublication, Author author) {
        this.isbn = isbn;
        this.bookName = bookName;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getBookName() {
        return bookName;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public Author getAuthor() {
        return author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
    public void print () {
        System.out.println("(" + this.isbn + ")");
        System.out.println("(" + this.bookName + ") - (" + this.yearOfPublication + ")");
        System.out.println("Author: " + getAuthor());
    }
}
