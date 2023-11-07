public class ArrayList2 {

  Integer[] integers;

  public ArrayList2(){
    integers = new Integer[0];
  }

  //int counter = 0;
  public boolean add(Integer integer){
    //counter++;
    //this.integers = new Integer[counter];
    Integer[] integerTemp = new Integer[this.integers.length];
    for (int i=0; i<this.integers.length; i++){
      integerTemp[i] = this.integers[i];
    }
    this.integers = new Integer[this.integers.length + 1];

    for (int i=0; i<integerTemp.length; i++){
      this.integers[i] = integerTemp[i];
    }
    this.integers[this.integers.length-1] = integer;
    return true;

  }

  //Lesson Demo

  // Integer[] integerTemp = new Integer[this.integers.length+1];
  // int i =0;
  // for (Integer old: this.integers){
  //   newIntegers[i++] = old;
  // }

  // newIntegers[i] = integer;
  // this.integers = newIntegers;
  // return true


  public Integer[] getIntegers(){
    return this.integers;
  }

  public Integer set(int index, Integer newInteger){
    //return the old element as per the specification
    return this.integers[index] = newInteger;
  }

  public Integer get(int index){
    return this.integers[index];
  }

  public int lastIndexOf(Integer integerCheck){
    int index = -1;
    for (int i=0; i<this.integers.length; i++) {
      if (integerCheck == this.integers[i]){ // should use this.integers[i].equals(integerCheck)
        index = i;
      }
      
    }
    return index;
  }

  public static void main(String[] args) {
    ArrayList2 arrayList = new ArrayList2();
    arrayList.add(10);
    arrayList.add(1);
    arrayList.add(100);
    arrayList.add(50);
    arrayList.add(40);

    System.out.println(arrayList);

    arrayList.set(1,999);

    System.out.println(arrayList); // check if the old arraylist is returned

    //System.out.println(arrayList[2]);
    for (Integer integer : arrayList.getIntegers()) {
      System.out.println(integer);
      
    }

    System.out.println(arrayList.get(1));

    arrayList.add(10);
    System.out.println(arrayList.lastIndexOf(10));

    

  }

}
