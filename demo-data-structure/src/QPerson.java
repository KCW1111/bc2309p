
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QPerson implements Comparable<QPerson> {
  
  private String name;

  //private String author;

  private int age;

  public QPerson(String name, int age){
    this.name = name;
    this.age = age;
  }

 public int getAge() {
   return age;
 }

 public String getName() {
   return name;
 }

  //public int compareTo(T o);

  @Override
  public int compareTo(QPerson person){ 
    if(person.getName().compareTo(this.name);
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

  @Override
  public int compareTo(QPerson o) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
  }


}

}
