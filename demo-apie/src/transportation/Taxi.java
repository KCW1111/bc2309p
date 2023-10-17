package transportation;

public class Taxi implements Movable{

  private int speed;
  private Location location;

  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }


  public Taxi(int speed){
    this.location = new Location();
    this.speed = speed;
  }

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  @Override
  public Taxi move(){
    int newX = this.location.getX() + this.speed / 10;
    this.location.setX(newX);
    return this;
  }

  @Override
  public void accelerate(){
    this.speed += 20;
  }

  public boolean isArrivedDestination(){
    return this.getLocation().getX() >=100;
  }

  public boolean isWinner(){
    return this.isArrivedDestination();
  }
  
}
