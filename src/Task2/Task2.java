package Task2;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        Book book1 = new Book(500.50,"The Dark Tower", 700, "hard");
        Book book2 = new Book(1750.50,"CLR via C#", 900, "hard");
        Book book3 = new Book(22.50,"Fury", 125, "soft");
        Book book4 = new Book(50.50,"To Kill a Mockingbird", 300, "soft");
        Book book5 = new Book(75.50,"Souls of the Black People", 350, "soft");
        ArrayList<Book>bookCollection = new ArrayList<>();
        bookCollection.add(book1);
        bookCollection.add(book2);
        bookCollection.add(book3);
        bookCollection.add(book4);
        bookCollection.add(book5);

        try {
            bookCollection.get(5);
        } catch (Exception e) {
            System.out.println("Перехвачено исключение: " + e.getMessage());
            System.out.println("Index out of array range");
        }
    }
}
