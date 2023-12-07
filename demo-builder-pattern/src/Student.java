public class Student {
  private String name;
  private int age;
  private char gender;

  private Student(String name, int age, char gender){
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public static Student.Builder builder(){
    return new Student.Builder();
  }

  public static class Builder{
    private String name;
    private int age;
    private char gender;

    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    public Builder setAge(int age) {
      this.age = age;
      return this;
    }

    public Builder setGender(char gender) {
      this.gender = gender;
      return this;
    }

    public Student build(){
      return new Student(this.name, this.age, this.gender);
    }

  }

  public static void main(String[] args) {
    Student student = new Student.Builder() // empty constructor
    .setName("John")
    .setAge(19)
    .setGender('M')
    .build();

    Student student2 = Student.builder() // new built function to make it elegant
    .setAge(20)
    .setGender('F')
    .setName("Jane")
    .build();
  }
}
