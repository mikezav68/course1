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

    public String toString() {
        return this.authorName + " " + this.authorSurname;
    }

    public boolean equals(Author author) {
        if (author == null || getClass() != author.getClass()) {return false;}
        return authorName.equals(author.getAuthorName()) && authorSurname.equals(author.getAuthorSurname());
    }

    public int hashCode() {
        return java.util.Objects.hash(authorName, authorSurname);
    }
}
