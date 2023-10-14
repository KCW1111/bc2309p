public class SmallBird extends Bird{

  // Cannot override the "final" fly() method in Bird.class
  // @Override
  // public void fly(){

  // }

  public SmallBird(String name){
    super(name);
  }

  public static void main(String[] args) {
    Bird b1 = Bird.valueOf("John");
    SmallBird sm1 = new SmallBird("ABC");
    
    sm1.equals("abc");
  }
  
}
