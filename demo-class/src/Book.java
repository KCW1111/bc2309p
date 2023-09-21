public class Book { // A template to describe the objects
    
    int no0fPages;
    String author;

    // Behavior
    // instance method (an instance means an object)
    public void setAuthor(String x){ // no static here!
        this.author = x;
    }

    public String getAuthor(){
        return this.author;
    }

    //System.out.println("Test2");

    public static void main(String[] args) {
        Book book1 = new Book(); // book1 is an object
        book1.setAuthor("John");
        System.out.println(book1.getAuthor());
        Book book2 = new Book(); // book2 is another object
        System.out.println(book2.getAuthor()); // String default value is null
    }

}
