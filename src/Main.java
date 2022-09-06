public class Main {
    public static void main(String[] args) {
        Book Book1 = new Book("Капитанская дочка", "Александр Пушкин", 1837);
        Book Book2 = new Book("Мцыри","Михаил Лермонтов",1840);
        System.out.println("Book1.name = " + Book1.getName());
        System.out.println("Book1.Author = " + Book1.getAuthor());
        System.out.println("Book1.date = " + Book1.getDate());
        Book1.setDate(1836);
        System.out.println("Book1.date = " + Book1.getDate());

        System.out.println("Book2.name = " + Book2.getName());
        System.out.println("Book2.Author = " + Book2.getAuthor());
        System.out.println("Book2.date = " + Book2.getDate());
    }
}