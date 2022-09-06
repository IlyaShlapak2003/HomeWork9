public class Book {
    private String name;
    private String Author;
    private int date;
    public Book(String name, String Author, int date){
        this.name=name;
        String[] author=Author.split(" ");
        Author writer=new Author(author[0],author[1]);
        this.Author = (writer.getName())+" "+(writer.getSurname());
        this.date=date;
    }
    public String getName(){
        return this.name;
    }
    public String getAuthor(){
        return this.Author;
    }
    public int getDate(){
        return this.date;
    }
    public void setDate(int date){
        this.date=date;
    }
}
