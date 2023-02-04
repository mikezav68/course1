package hw30_01_2023;

public class Book {

    private String bookName;

    private Author bookAuthor;

    private int bookYear;

    public Book(String bookName, Author bookAuthor, int bookYear) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookYear = bookYear;
    }

    public String getBookName() {
        return bookName;
    }

    public Author getBookAuthor() {
        return bookAuthor;
    }

    public int getBookYear() {
        return bookYear;
    }

    public void setBookYear(int bookYear) {
        this.bookYear = bookYear;
    }

    public String toString() {
        return this.bookAuthor.toString() + ", " + this.bookName + ", " + this.bookYear;
    }

    public boolean equals(Book book) {
        if (book == null || getClass() != book.getClass()) {return false;}
        return bookName.equals(book.getBookName()) && bookAuthor.equals(book.getBookAuthor())
                && bookYear == book.getBookYear();
    }

    public int hashCode() {
        return java.util.Objects.hash(bookAuthor, bookName, bookYear);
    }
}
