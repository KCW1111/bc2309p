import java.util.Optional;
import javax.swing.text.html.Option;

public class OptionalMethod {

  public static String[] database = new String[]{"XYZ","ABC","IJK"};

  //Optional is good for method, as method could return null, and users could encounter error 
  public static void main(String[] args) {

    Optional<Integer> result = OptionalMethod.fromDatabase("mmm");

    if (result.isPresent()){
      System.out.println(result.get());
    }else{
      System.out.println("Not Found");
    }
    // In this way, users will not getting a null object after calling object, which is dangerous to users.
    // Now, before directly return the value, the method first return the object, which this object is always not null
    // and using the object's value to tell the user no value is return after calling the method    
  }

  public static Optional<Integer> fromDatabase(String s){
    //int index = -1;
    for (int i=0; i<database.length; i++){
      if (database[i] == "ABC"){
        return Optional.of(i); // Optional.of(), is indeed a constructor, object is made
      }  
  }
  return Optional.empty(); // Optional.of(), is indeed a constructor, object is made
 
}

}
