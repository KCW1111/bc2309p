package human;

public class Superwoman implements Superpower{

  @Override
  public void fly(){
    System.out.println("I am also flying....");
  }

  @Override
  public void precogitate(){
    System.out.println("Superwoman has precogitation power.");
  }
}
