public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Александр", "Пушкин");
        Author author2 = new Author("Михаил","Лермонтов");
        Book Book1 = new Book("Капитанская дочка", author1, 1837);
        Book Book2 = new Book("Мцыри",author2,1840);
        System.out.println(Book1);
        System.out.println(Book2);

    }
}