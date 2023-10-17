package transportation;

public class Bus implements Movable {
  private int speed;

  private Location location;

  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public Bus(int speed){
    this.speed = speed;
    this.location = new Location();
  }

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  @Override
  public Bus move(){
    //locaiton x, =1 when speed = 10, +2 when speed = 20
    int newX = this.location.getX() + this.speed / 10;
    this.location.setX(newX);
    return this;
  }

  @Override
  public void accelerate(){
    this.speed += 10;
  }

  public boolean isArrivedDestination(){
    return this.getLocation().getX() >=100;
  }

  public boolean isWinner(){
    return this.isArrivedDestination();
  }
  
}
