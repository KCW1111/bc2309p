import java.util.ArrayList;
import java.util.List;

public class Printer<T> {
  //Integer x;
  private T x;

  public Printer(){

  }

  //public Printer(Integer x){
  public Printer(T x){
    this.x = x;
  }

  public T getX() {
    return x; // return this.x??
  }

  public void setX(T x) {
    this.x = x;
  }

  public static void main(String[] args) {
    Printer<String> stringPrinter = new Printer<>(); //autobox
    Printer<Integer> integerPrinter = new Printer<>();
    Printer<Double> doublePrinter = new Printer<>();


    // before Java 1.5
    List objects = new ArrayList<>();
    objects.add("abc");
    objects.add(1);
    objects.add(1.0);
    System.out.println(objects);


    if (objects.get(0) instanceof String){
      String str = (String) objects.get(0);
      str = str.concat("Abc");
    } // as compile time do not know what is the type of objects(0), so, need to check, nevertheless, you still need to check all the class before going on
    //bad design, so after Java 1.5, there is generic

    

  }
}
