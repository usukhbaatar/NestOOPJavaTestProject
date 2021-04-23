package mn.nest.oop.dawtlaga11;

import java.util.ArrayList;
import java.util.GregorianCalendar;

// start point
public class Main {
    public static void main(String[] args) {
        System.out.println("Dawtlaga");
        Book b = new Book();

        GregorianCalendar cal = new GregorianCalendar();
        cal.set(2021, 11, 12);

        Person person = new Person("Bilegt", "I'm the king", cal.getTime());

        // String name, Date publishedDate, String isbn, double price, Person owner
        cal.set(1998, 0, 12);
        Book book = new Book("No name", cal.getTime(), "001", 15000.0, person);

        // array
        Book[] bookArray = new Book[2];
        for (int i = 0; i < 2; i++) {
            bookArray[i] = new Book();
        }

        // array list
        ArrayList<Book> books = new ArrayList<>(); // c++ vector<Book> books;

        for (int i = 0; i < 2; i++) {
            books.add(new Book());
        }
        books.add(book);

        double sum = 0;
        for (int i = 0; i < books.size(); i++) {
            sum += books.get(i).getPrice();
        }

        System.out.println(sum);
    }
}
