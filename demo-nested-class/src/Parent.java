public abstract class Parent {
  abstract void read();

  public static void main(String[] args) {
    Parent x = new Parent() {
      @Override
      public void read(){
        System.out.println("Hello");
      }
    };

    x.read();
  }
}
