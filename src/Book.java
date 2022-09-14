import java.util.Objects;
public class Book {
    private final String name;
    private final Author Author;
    private Integer year;

    public Book(String name, Author Author, int year) {

        this.name = name;
        this.Author = Author;
        this.year = year;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.Author;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Name =" + ' ' + this.name + ", Author = " + this.Author + ", Year = " + this.year + ' ';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Book book = (Book) o;
        return year == book.year && name.equals(book.name) && Author.equals(book.Author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Author, year);
    }
}
