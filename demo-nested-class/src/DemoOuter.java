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

    Company.Employee employee3 = Company.createEmployee("May", 124);

    Outer outer2 = new Outer("DEF");
    Outer.InnerClass inner = new Outer("DEF").new InnerClass("IJK");
    inner.display(); // one reference (outter) linking 2 objects (inner)
    outer2.display();

    // Example Library
    Library library1 = new Library("ABC");
    Library.Book book1 = library1.new Book("Book1");

    // Try to be: library1.newBook("Book 1");
    Library library2 = new Library("DEF");
    Library.Book bk1 = library2.createBook("Book1");

    System.out.println("book1 info = " + book1.info());
    System.out.println("bk1 info = " + bk1.info());

  }


}
