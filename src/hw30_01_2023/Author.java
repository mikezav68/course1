package hw30_01_2023;

public class Author {
    private String authorName;
    private String authorSurname;
    public Author(String name, String surname) {
        this.authorName = name;
        this.authorSurname = surname;
    }
    public String getAuthorName() {
        return authorName;
    }
    public String getAuthorSurname() {
        return authorSurname;
    }
}
