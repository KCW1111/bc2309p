import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Box<T, U> {
  private T data;
  private U value;

  public Box(){

  }

  public Box(T data, U value){
    this.data = data;
    this.value = value;
  }

  public static <T,U> Box<T,U> createBox(T data, U value){
    Box<T,U> box = new Box<T,U>(data,value);
    return box;
  }

  public static void main(String[] args) {

    Box<int[], String> box1 = new Box<>(new int[] {10, -100,-4}, "World");
    Box<String, String> box2 = new Box<>("Hello", "Tag");

    Box<List<String>, Map<String,String>> box3 = new Box<>(List.of("abc","def"),new HashMap<>());

    Box<String, Integer> box4 = Box.createBox("hello", 100);

    
  }
}
