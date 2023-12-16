import java.util.Optional;

//Optiona.<T> should NOT be used for defining the type of attribute
// 1. Call API, this class may be used for deserialization, then Optional<T> may have some problems.
// 2. Interact with Database, deserialzation 
public class Person {

  private String name;

  private Optional<String> emailAddress; // Not ok, wrong design

  public Person(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public Optional<String> getEmailAddress(){ // Not ok
    return this.emailAddress;
  }

  public void setEmailAddress(String s){ // Not ok
    // if(s==null)
    // throw new IllegalArgumentException();
    this.emailAddress= Optional.ofNullable(s);
  }
}
