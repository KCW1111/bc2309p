package javafunctionalinterface;

import java.time.LocalDate;

public class Customer {
  private String name;
  private LocalDate joinDate;

  public Customer(String name, LocalDate joinDate){
    this.name = name;
    this.joinDate = joinDate;
  }

  public LocalDate getJoinDate() {
    return joinDate;
  }

  public void setJoinDate(LocalDate joinDate) {
    this.joinDate = joinDate;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString(){
    return this.name + " and " + this.joinDate + "\n";
  }
  
}
