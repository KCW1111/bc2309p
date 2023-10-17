package transportation;

public class Location {

  private int x; // starting point 1, end point = 10


  public Location(){

    this.x = 1;

  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public boolean isArrivedDestination(){
    return this.x >=100;
  }

  public static void main(String[] args) {
    // 1 bus, 1 taxi
    //while loop,isArrivedDestination, exit loop, print Bus or Taxi Win

    Bus bus = new Bus(10);
    Taxi taxi = new Taxi(10);
    //Location locationTaxi = new Location();
    //Location locationBus = new Location();

    while (true) {
      if (bus.move().isWinner()){
        System.out.println("Bus Win");
        break;
      }else if(taxi.move().isWinner()){
        System.out.println("Taxi Win");
        break;
      }else{
        System.out.println("Bus speed is:" + bus.getLocation().getX());
        System.out.println("Taxi speed is:" + taxi.getLocation().getX());
        // bus.move();
        // taxi.move();
      }
        
      

      
      
    }
  }





}
