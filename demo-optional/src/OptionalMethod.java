import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.swing.text.html.Option;

public class OptionalMethod {

  public static String[] database = new String[]{"XYZ","ABC","IJK"};
  //public static List<String> database2 = new ArrayList<>(List.of("ABC","DEF","GHI"));
  public static List<String> database2 = List.of("ABC","DEF","GHI");

  public static List<Person> database3 = List.of(new Person("John"),new Person("Mary"),new Person("Cherry"));

  //Optional is good for method, as method could return null, and users could encounter error 
  public static void main(String[] args) {

    Optional<Integer> result = OptionalMethod.fromDatabase("mmm");

    // Approach 1: isPresent() + get()
    if (result.isPresent()){
      System.out.println(result.get());
    }else{
      System.out.println("Not Found");
    }
    // In this way, users will not getting a null object after calling object, which is dangerous to users.
    // Now, before directly return the value, the method first return the object, which this object is always not null
    // and using the object's value to tell the user no value is return after calling the method    

    // Approach 2: orElse()
    Integer integer = result.orElse(0);

    // Approach 3: isPresent() ***prefer this one
    result.ifPresent(e->{
      System.out.println("Intger is " + e);
      throw new RuntimeException();
    }
);

    // Approach 4: 
    result.orElseThrow(()->new RuntimeException());
    System.out.println(result);

    database2.indexOf("abc");






  }

  // Common Use Case: Optional<T> as a return type
  public static Optional<Integer> fromDatabase(String s){
    //int index = -1;
    for (int i=0; i<database.length; i++){
      if (database[i] == "ABC"){
        return Optional.of(i); // Optional.of(), is indeed a constructor, object is made
      }  
  }
  return Optional.empty(); // Optional.of(), is indeed a constructor, object is made
}

  public static Optional<Integer> fromDatabase2(String s){
    Optional<String> os = database2.stream()
    .filter(e->"abc".equals(e)) // "abc"
    .findFirst();

    if (!os.isPresent()){
      return Optional.of(-1);
    }

    return Optional.of(database2.indexOf(os.get()));
  }

  // findFirst()
  public static Optional<Person> fromDatabase3(String name){
    // Find Person By name in database3
    if (name == null){
      throw new IllegalArgumentException();
    }
    return database3.stream()
    .filter(e-> name.equals(e.getName()))
    .findFirst();
  }
 
}
