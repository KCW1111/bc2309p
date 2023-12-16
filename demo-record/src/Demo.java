public class Demo{
    public static void main(String[] args) {
        Book book1 = new Book("ABC", "John"); // All-args constructor

        //getter, setter?
        System.out.println(book1.author());
        System.out.println(book1.bookName());

        //Private Attributes
        // book1.author, cannot access attribute, so it is private
        // book1.bookName, cannot access attribute, so it is private
        // No Setter in Java record

        // toString, equals(), hashCode()?
        System.out.println(book1.toString());

        Book book2 = new Book("ABC","John");
        System.out.println(book1.equals(book2));

        Book book3 = new Book("ABCD", "John");
        System.out.println("book1's hashcode is: " + book1.hashCode());
        System.out.println("book2's hashcode is: " + book2.hashCode());
        System.out.println("book3's hashcode is: " + book3.hashCode());

        Book book4 = new Book(null, "Peter");



    }
}
