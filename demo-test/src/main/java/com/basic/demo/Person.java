package com.basic.demo;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@SuperBuilder
public class Person {
  private String name;
  private int age;

  public int getAge() {
    return age;
  }

  public String getName() {
    return name;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public void setName(String name) {
    this.name = name;
  }
}
