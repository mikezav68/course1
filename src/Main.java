import hw30_01_2023.Author;
import hw30_01_2023.Book;

public class Main {

    public static void main(String[] args) {
        Author author1 = new Author("Михаил", "Завидов");
        Author author2 = new Author("Людмила", "Антонова");
        Author author3 = new Author("Людмила", "Антонова");
        Book book1 = new Book("Мемуары", author1, 2001);
        Book book2 = new Book("Рассказы", author2, 2010);
        Book book3 = new Book("Рассказы", author2, 2021);
        Book book4 = new Book("Мемуары", author1, 2001);
        Book book5 = new Book("Рассказы", author1, 2010);
        // проверяем, верно ли реализован метод toString:
        System.out.println("Книга 1: " + book1.toString());
        System.out.println("Книга 2: " + book2.toString());
        System.out.println("Книга 3: " + book3.toString());
        // проверяем, как работают методы сравнения:
        System.out.println("У авторов 3 и 2 одинаковые имя и фамилия, значит они одинаковые: " + author3.equals(author2));
        System.out.println("У авторов 1 и 2 разные имя и фамилия, значит они разные: " + author1.equals(author2));
        System.out.println("У книг 3 и 2 отличается год выпуска, поэтому они разные: " + book3.equals(book2));
        System.out.println("У книг 1 и 4 все параметры одинаковые: " + book4.equals(book1));
        System.out.println("У книг 2 и 5 разные авторы, значит и они разные: " + book5.equals(book2));
        // выведем несколько хэш-кодов:
        System.out.println(author1.hashCode());
        System.out.println(author2.hashCode());
        System.out.println(book1.hashCode());
        System.out.println(book4.hashCode());
    }

}