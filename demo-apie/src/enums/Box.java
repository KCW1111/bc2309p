package enums;



public class Box {
  private Color color;

  public static final int SIZE = 100;

  public Box(Color color){
    this.color = color;
  }

  public Color getColor() {
    //return color;
    return this.color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public char getColorCode(){  //instance method
    return this.getColor().getCode();
    //demo, return this.color.getCode();
  }

  public static void main(String[] args) {
    Box box = new Box(Color.BLUE); // color is not a class, it ias a enum....style like static final
    //using String to define color may cause problem, as String White = String white = String w.h.i.t.e????? infinite ways to describe "White"

    // Primitive & enum should always be compared by using ==, ==, use to check the address
    // Wrapper class & cusom class should be always compared by "equals()"
    if (box.getColor() == Color.BLUE){
      System.out.println("this box color is Blue");
    }


    box.setColor(Color.BLACK);

    if (box.getColor() == Color.BLACK){
      System.out.println("this box color is Black");
    }

    
    char sth = box.getColor().getCode();

    System.out.println(sth);

    System.out.println(Box.SIZE);


    System.out.println(box.getColorCode());

    System.out.println(Color.BLUE.name().toLowerCase());

    // for-each, common for business use, no need to use for, if else
    for (Color color : Color.values()){ // Color array wil be given
      System.out.println(color.getCode());
      System.out.println(color.getDescription());
    }

    // valueOf()
    System.out.println(Color.valueOf("WHITE")); // from string to enum



    

    
  
  
  
  
  }
}
