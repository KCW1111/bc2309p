@FunctionalInterface // This part help checking if more than one method is/are declared
public interface Concat {
  
  String concat(String s1, String s2);
  //String concat2(String s1, String s2, String s3); // it throws error, as more than one method in functional interface

}
