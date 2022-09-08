public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Александр", "Пушкин");
        Author author2 = new Author("Михаил","Лермонтов");
        Book Book1 = new Book("Капитанская дочка", author1, 1837);
        Book Book2 = new Book("Мцыри",author2,1840);
        System.out.println("Book1.name = " + Book1.getName());
        System.out.println("Book1.author = " + Book1.getAuthor().getName() + " " + Book1.getAuthor().getSurname());
        System.out.println("Book1.date = " + Book1.getDate());
        Book1.setDate(1836);
        System.out.println("Book1.date = " + Book1.getDate());

        System.out.println("Book2.name = " + Book2.getName());
        System.out.println("Book2.name1 = " + Book2.getAuthor().getName() + " " + Book2.getAuthor().getSurname());
        System.out.println("Book2.date = " + Book2.getDate());
    }
}