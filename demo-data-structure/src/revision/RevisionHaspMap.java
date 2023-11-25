package revision;

import java.util.HashMap;
import java.util.Map;

public class RevisionHaspMap {

  private static int counter = 0;
  private static final String KEY_PREFIX = "B";

  public static String genKey(){
    //counter++;
    return KEY_PREFIX + ++counter;
      
    }

  public static void putBook(Map<String,Book> bookMap, Book book){
    bookMap.put(genKey(),book);
  }

  // instance method not complete, or could override put()???
  // public void putBk(Book book){
  //   this.put(genKey(),book);
  // }
  public static void main(String[] args) {

    
    // key -> "B1","B2","B3"
    Map<String,Book> bookMap = new HashMap<>();
    bookMap.put(genKey(),new Book(10.0,"ABC"));
    bookMap.put(genKey(),new Book(11.1,"IJK"));
    bookMap.put(genKey(),new Book(20.2,"LMN"));

    Map<String,Book> bookMap2 = new HashMap<>();
    putBook(bookMap2, new Book(30.3,"BLK"));
    putBook(bookMap2, new Book(40.4, "PINK"));


    // Loop Map.Entry -> entrySet()
    for (Map.Entry<String, Book> entry : bookMap.entrySet()){
      System.out.println(entry.getKey() + " " + entry.getValue());
    }

    for (Map.Entry<String, Book> entry : bookMap2.entrySet()){
      System.out.println(entry.getKey() + " " + entry.getValue());
    }

    String bookKey = "B3";

    for (Map.Entry<String, Book> entry: bookMap.entrySet()) {
      if (entry.getKey().equals(bookKey))
        System.out.println("Found");
      System.out.println("Not Found");
        
    }

    // Demo

    String bookKey2 = "B4";

    if (!bookMap.containsKey(bookKey2)){
      bookMap.put(bookKey2, new Book(99.9, "Super"));
    }

    System.out.println(bookMap); // as Map has toString method, will call Book.toString


    System.out.println("key = B2 = " + bookMap.get("B2"));







  }
}
