public class Book {
    private final String name;
    private final Author Author;
    private Integer year;
    public Book(String name, Author Author, int year){

        this.name=name;
        this.Author = Author;
        this.year=year;
    }
    public String getName(){
        return this.name;
    }
    public Author getAuthor(){
        return this.Author;
    }
    public int getYear(){
        return this.year;
    }
    public void setYear(int year){
        this.year=year;
    }
}
