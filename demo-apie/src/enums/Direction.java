package enums;

public enum Direction {

  EAST('E',1),
  SOUTH('S',2),
  WEST('W',1),
  NORTH('N',2),
  ;

  private Direction(char code,int couple){
    this.code = code;
    this.couple = couple;
  }
  private char code;
  private int couple;

  public char getCode() {
    //return code;
    return this.code;
  }

  public int getCouple(){
    return this.couple;
  }

  public boolean isOpposite(Direction direction){
    System.out.println(this.couple); // this, no need to getCouple
    System.out.println(direction.getCouple());
    
    return this.couple == direction.getCouple();

  }

  public static void main(String[] args) {
    System.out.println(Direction.SOUTH.isOpposite(Direction.NORTH));// true

    System.out.println(Direction.SOUTH.isOpposite(Direction.EAST));// true

    System.out.println(Direction.SOUTH.isOpposite(Direction.SOUTH));// true

    System.out.println(Direction.SOUTH.isOpposite(Direction.WEST));// true
  }




}
