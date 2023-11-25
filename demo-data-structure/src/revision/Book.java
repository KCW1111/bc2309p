package revision;

public class Book {

  private double price;
  private String author;

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public Book(){

  }

  public Book(double price, String author){
    this.price = price;
    this.author = author;
  }

  @Override
  public String toString(){
    return "The author is: " + this.author + " and the price is: " + this.price;
  }





}
