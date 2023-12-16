import java.util.Optional;

public class Calculation {
  //public static Integer add (Optional<Integer> x, Optional<Integer> y) // this is bad as the users need to provide optional before callign the method
  //which is useless

  public static void main(String[] args) {
    Integer i1 = null;
    Integer i2 = 2;
    System.out.println(add(Optional.ofNullable(i1),Optional.ofNullable(i2))); // null + 2 -> 2
    System.out.println(add(null, null)); // throw IAE
  }

  // Design NOT ok
  // you have to handle null scenario for both Optional Object
  // and the object inside the Ooptional Object
  // The worse part is, users need to handle if the object is null, then handle if the thing inside the object is null
  // both the class designer and user suffer
  public static Integer add(Optional<Integer> optional, Optional<Integer> optional2){
    if (optional== null || optional2 == null)
      throw new IllegalArgumentException();
    int xValue = 0;
    if (optional.isPresent()){
      xValue = optional.get();
    }
    int yValue = 0;
    if (optional2.isPresent()){
      yValue = optional2.get();
    }
    return xValue + yValue;
  }
}
