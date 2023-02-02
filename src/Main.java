import hw30_01_2023.Author;
import hw30_01_2023.Book;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Михаил", "Завидов");
        Author author2 = new Author("Людмила", "Антонова");
        Book book1 = new Book("Мемуары", author1, 2001);
        Book book2 = new Book("Рассказы", author2, 2010);
        System.out.println("Книга 1: " + book1.getBookAuthor().getAuthorName() + " " +
                book1.getBookAuthor().getAuthorSurname() + ", " +
                book1.getBookName() + " , год выпуска: " + book1.getBookYear());
        System.out.println("Книга 2: " + book2.getBookAuthor().getAuthorName() + " " +
                book2.getBookAuthor().getAuthorSurname() + ", " +
                book2.getBookName() + " , год выпуска: " + book2.getBookYear());
        book2.setBookYear(2021);
        System.out.println("Книга 2 перевыпущена в " + book2.getBookYear() + " году");
    }
}