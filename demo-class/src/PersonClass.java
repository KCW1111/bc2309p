public class PersonClass {
  int age;
  char sex; // 'M' or 'F'
  String firstName;
  String lastName;
  int hkid;

  public void setAge (int age){
    this.age = age;
  }

  public void setLastName(String lastName){
    this.lastName = lastName;
  }

  public boolean isElderly(){
    if (this.age > 65)
      return true;
    return false;
  }

  public void setSex(char sex){
    this.sex = sex;
  }

  public String isMale(){
    if (this.sex == 'M')
      return "This is a man.";
    return "This is a woman";
  }

  public static void main(String[] args) {
    PersonClass person = new PersonClass();
    person.setAge(65);
    System.out.println(person.isElderly()); // false

    PersonClass person2 = new PersonClass();
    person2.setSex('F');
    System.out.println(person2.isMale());
  }

  
  




}
