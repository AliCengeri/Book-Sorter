import java.util.*;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Diyar", 30, "Emir", "10/10/2010");
        Book book2 = new Book("Babalar", 40, "Demir", "10/10/2013");
        Book book3 = new Book("Cadı", 20, "Cemre", "10/10/2012");
        Book book4 = new Book("Asil Kan", 50, "Bekir", "10/10/2014");
        Book book5 = new Book("Eski Dünya", 60, "Ali", "10/10/2015");
        
        TreeSet<Book> books = new TreeSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        for (Book book : books) {
            System.out.println(book.getName());
        }

        TreeSet<Book> newBooks = new TreeSet<>((o1, o2) -> o1.getPageNum() - o2.getPageNum());
        newBooks.add(book1);
        newBooks.add(book2);
        newBooks.add(book3);
        newBooks.add(book4);
        newBooks.add(book5);
        for (Book book : newBooks) {
            System.out.println(book.getPageNum());
        }
    }
}