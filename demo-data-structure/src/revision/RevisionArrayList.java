package revision;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RevisionArrayList {
  public static void main(String[] args) {
    List<Book> books = new ArrayList<>();

    Book book1 = new Book(10.0, "Porter");
    Book book2 = new Book(70.5, "Spiderman");
    Book book3 = new Book(50.3, "Comics");

    books.add(book1);
    books.add(book2);
    books.add(book3);

    //Demo books.add(new Book(30.0,"ABC"));

    // for loop -> "ABC,30.0"

    for (Book book : books) { // List and Array are borned to support foreach
      System.out.println(book.getAuthor() + "," + book.getPrice()); // Demo: String.valueOf(book.getPrice())
    }

    // The average price of books = xx.xx
    double totalPrice = 0; // Demo double sum = 0.0d

    for (Book book : books) {
      totalPrice += book.getPrice();
    }

    // array [] -> array.length
    // String -> str.length()
    // ArrayList<>() -> books.size()
    System.out.println("The average price of books = " + totalPrice/books.size());

    List<Book> books2 = new ArrayList<>();
    books2 = books.subList(0,books.size()-1); // books refer to the original list object

    //System.out.println(books == books2);

    // Book removed = books.remove(0);
    // boolean removebyObject = books.remove(book2);

    // System.out.println("remove by index: " + removed);
    // System.out.println("remove by object: " + removebyObject);

    // remove all books with price > 50
    //for (Book book : books) {
    //  if (book.getPrice()>50.0) // as it is primitive, arithematic operators can be used
    //    books.remove(book); // java.util.ConcurrentModificationException, it tells foreach is borned to read array, not for modificaiton of that array
    //}// But this part didn't throw exception, but demo throws error
    // At the end, this is runtime error, as my original set of books do not have books with price > 50.0, that is why no error is thrown.

    // for (Book book : books) {
    //   System.out.println(book.getPrice());
    // }
    Book removed = new Book();

    for (int i = 0; i<books2.size(); i++){
      if (books2.get(i).getPrice()>50.0){
        removed = books2.remove(i);
        System.out.println("removed book = " + removed); // using println to debug hurt performanace, in production, need to remove
      }
         
    }

    for (Book book : books2) {
      System.out.println(book.toString());
      
    }


    // Add all the books to a Set collection (HasSet)
    Set<Book> bookset = new HashSet<>();
    // System.out.println(books3.add(book1));
    // System.out.println(books3.add(book2));
    // System.out.println(books3.add(book3));

    for (Book book : books) {
      bookset.add(book);
    }

    bookset.clear();

    bookset.addAll(books);


    // Add all the books to an Array (Book[])
    Book[] bookArray = new Book[books.size()]; 
    for (int i = 0; i<books.size(); i++){
      bookArray[i] = books.get(i);
    }







  }
}
