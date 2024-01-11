package com.basic.demo;

import javax.annotation.processing.Generated;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true) // default is false
@ToString(callSuper = true)
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder //use when in extending other class
public class Staff extends Person{

  public Staff(String name, int age) {
    super(name, age);
    
  }
  private String name;
  private int age;

  public boolean isAdult(){
    return this.age >=18;
  }

  public static void main(String[] args) {

    Staff staff = new Staff("John", 20);
    Staff staff2 = new Staff();
    Staff staff3 = new Staff("John",20);
    Staff staff4 = Staff.builder()
    .name("Steven")
    .age(30)
    .build();
    System.out.println(staff4);

    
    
  }
  
}
