import java.util.List;

public class StoreOwner {
  private String name;
  private int age;
  private List<String> books;

  public StoreOwner(String name, int age, List<String> books){
    this.name = name;
    this.age = age;
    this.books = books;
  }

  public int getAge() {
    return age;
  }

  public String getName() {
    return name;
  }

  public List<String> getBooks() {
    return books;
  }

}
