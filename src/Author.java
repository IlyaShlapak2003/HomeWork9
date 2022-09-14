import java.util.Objects;

public class Author {
    private final String name;
    private final String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    @Override
    public String toString() {
        return this.name + " " + this.surname;
    }
    @Override
    public int hashCode(){
        return Objects.hash(name, surname);
    }
    @Override
    public boolean equals(Object ob){
        return this.equals(ob);
    }

}
