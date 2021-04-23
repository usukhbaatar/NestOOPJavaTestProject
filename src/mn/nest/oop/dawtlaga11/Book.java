package mn.nest.oop.dawtlaga11;

import java.util.Date;

public class Book {
    String name;
    Date publishedDate;
    String isbn;
    double price;
    Person owner;

    public Book() {
        price = 1000;
        System.out.println("Testing");
    }

    public Book(String name, Date publishedDate, String isbn, double price, Person owner) {
        this.name = name;
        this.publishedDate = publishedDate;
        this.isbn = isbn;
        this.price = price;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
