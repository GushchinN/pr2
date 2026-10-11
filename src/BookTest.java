public class BookTest {
    public static void main(String[] args){
        Book book1 = new Book("Толстой", "Война и мир", 1869);
        System.out.println(book1.toString());

        book1.setYear(1867);
        System.out.println("Новый год издания: " + book1.getYear());

        Bookshelf shelf = new Bookshelf(4);
        shelf.add(book1);
        shelf.add(new Book("Достоевский", "Преступление и наказание", 1866));
        shelf.add(new Book("Булгаков", "Мастер и Маргарита", 1967));
        shelf.add(new Book("Пушкин", "Евгений Онегин", 1833));

        System.out.println("\nКниги на полке:");
        shelf.printAll();

        System.out.println("\nСамая ранняя: " + shelf.getOldest().toString());
        System.out.println("Самая поздняя: " + shelf.getNewest().toString());

        shelf.sortByYear();
        System.out.println("\nПосле сортировки по году:");
        shelf.printAll();
    }
}
