public class DemoOuter {
  // public static void main(String[] args) {
  //   Outer outer = new Outer();
  //   Outer.NestedClass staticNestedClass = new Outer.NestedClass();
  // }

  public static void main(String[] args) {
    Outer outer = new Outer("ABC");

    Outer.NestedClass staticNestedClass = new Outer.NestedClass("BCD");

    Company.Employee employee = new Company.Employee("John", 123);
    Employee employee2 = new Employee();

    Outer outer2 = new Outer("DEF");
    Outer.InnerClass inner = new Outer("DEF").new InnerClass("IJK");
    inner.display(); // one reference (outter) linking 2 objects (inner)
    outer2.display();

    // Example Library
    Library library1 = new Library("ABC");
    Library.Book book1 = library1.new Book("Book 1");

    System.out.println("book1 info = " + book1.info());

  }


}
