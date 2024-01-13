package com.basic.demo;
public class RealCalculator {

  private Calculators calculators;


  // dependency injection
  public RealCalculator(Calculators calculators){
    this.calculators = calculators;
  }
  

  // Unit Test: From calculate() method perspective,
  // we don't need to know what exactly add() method performs
  // when p =10, and assume add(p, p/2) return 3, then calculate() return 17
  public int calculate(int p){
    return calculators.addition(p,p/2) + p + 4;
  }


  public int sleep(int second){
    int result = calculators.addition(second, second /2);

    for (int i = 0; i< 5; i++){ // 0-5
      result += i * 2;
    }
    return result;
  }
}
