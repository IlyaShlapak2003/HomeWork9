public class Book {
    private final String name;
    private final Author Author;
    private Integer date;
    public Book(String name, Author Author, int date){

        this.name=name;
        this.Author = Author;
        this.date=date;
    }
    public String getName(){
        return this.name;
    }
    public Author getAuthor(){
        return this.Author;
    }
    public int getDate(){
        return this.date;
    }
    public void setDate(int date){
        this.date=date;
    }
}
