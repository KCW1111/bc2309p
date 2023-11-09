import java.util.Objects;

public class Student {

  private int age;
  private String name;

  public Student(int age, String name){
    this.age = age;
    this.name = name;
  }

  @Override
  public boolean equals(Object obj){
    if (this == obj) // this is also the address of the current object
      return true;
    if (!(obj instanceof Student))
      return false;
    Student student = (Student) obj;
      return Objects.equals(this.age, student.age) && Objects.equals(this.name, student.name);
    
  }


  @Override
  public int hashCode(){
    return Objects.hash(this.age,this.name); // hash(what), depends on your conditions, if one criterion is used, then just input one attribute
    
  }

  @Override
  public String toString(){
    return this.name + " " + this.age;
  }
}
