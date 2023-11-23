package comparables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Book implements Comparable<Book> {
  
  private String name;

  //private String author;

  private double price;

  public Book(String name, double price){
    this.name = name;
    this.price = price;
  }

  public double getPrice() {
    return price; // return this.price?
  }

  //public int compareTo(T o);

  @Override
  public int compareTo(Book book){ // the high price comes first
    if(book.getPrice() > this.price)
      return 1; // control the sorting from min to max or max to min
    return -1; // control the sorting from min to max or max to min

  }

  @Override
  public String toString(){
    return this.name;
  }

  public static void main(String[] args) {
    List<Book> books = new ArrayList<>(List.of(new Book("A",30.5),new Book("B",50.8),new Book("C",40.9)));


    // Sorting
    Collections.sort(books);


    System.out.println(books);
  }


}
