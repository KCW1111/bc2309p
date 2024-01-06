package com.basic.demo;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@AllArgsConstructor
public class Employee extends Person{
  public Employee(String name, int age) {
    super(name, age);
    //TODO Auto-generated constructor stub
  }

  private int employeeId;

  public static void main(String[] args) {
    Employee Susan = new Employee(1234);
    Employee May = new Employee("May", 21);
    
  }
}
