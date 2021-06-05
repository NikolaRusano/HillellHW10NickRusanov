package Task2;

import java.util.List;


public class Book {
    double price;
    String title;
    final String[] coverTypes = {"hard", "soft"};
    String coverType;


    int quantityOfPages;

    public Book(double price, String title, int quantityOfPages, String coverType) {
        this.price = price;
        this.title = title;
        this.quantityOfPages = quantityOfPages;
        if(coverTypes[0] == coverType) {
            this.coverType = coverType;
        }else if(coverTypes[1] == coverType) {
            this.coverType = coverType;
        }else{
            System.out.println("Incorrect input");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCoverType() {
        return coverType;
    }

    public int getQuantityOfPages() {
        return quantityOfPages;
    }

    public void setQuantityOfPages(int quantityOfPages) {
        this.quantityOfPages = quantityOfPages;
    }


}