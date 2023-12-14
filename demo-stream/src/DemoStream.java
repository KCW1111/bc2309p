import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStream{
  public static void main(String[] args) {
    // Predicate
    // Consumer
    // Stream = Predicate + Consumer

    List<String> strings = new ArrayList<>();
    strings.add("ABC");
    strings.add("ABFxxx");
    strings.add("ABE");
    strings.add("ABGxxx");

    int total = 0;

    for (String string : strings) {
      if (string.length() <=3){
        System.out.println(string);
        total += string.length(); // *********this is the characterisitics of for loop, work with total*********
      }
    }

    // after Java 8
    strings.stream()//retrun from List<String> to Stream<String>
    .filter(string -> string.length() <=3) // intermediate operation (anytime output boolean), -> boolean output
    .forEach(string -> System.out.println(string)); // terminate operation (anytime output void)
    //***********.forEach(string -> total += string.length()); // this is illegal, that is not the idea of stream, not for changing or accumulating outside scope variable ************
    //Predicate<Integer> overSomethingFormula = num -> num > 20; // new an objec there (an object reference)

    Stream<String> ss = strings.stream()
    .filter(string -> string.charAt(2) == 'F'); // as intermediate operation will always output boolean value
    System.out.println(strings.size());//3
    System.out.println(ss.count());//1, things inside stream is not observable

    // Convert data structure (the main purpose of Stream)
    Set<String> s1 = new HashSet<>();
    // without stream, from list to set is painful
    // using stream:
    
    Set<String> s2 = strings.stream()//
    .filter(string -> string.length()>3)
    .collect(Collectors.toSet());// HashSet Object

    s2.stream().forEach(string->System.out.println(string));
    System.out.println(s2.getClass());

    //things under collections can use stream

    List<String> ns = strings.stream()//
    .filter(string->string.length()>3) // intermediate
    .map(string->string.concat("hello")) //intermediate (in this part, you can have string modified)
    .collect(Collectors.toList()); //terminate

    System.out.println(ns.getClass());







    List<Person> persons = new ArrayList<>();
    persons.add(new Person("Mary",20));
    persons.add(new Person("John",21));
    persons.add(new Person("Kate",22));

    // stream.map() -> ["ABC","DEF","HIJ"]
    List<String> ns2 = persons.stream()
    .map(e-> e.getName())
    .collect(Collectors.toList());

    System.out.println(ns2);


    List<BookStore> bookStores = new ArrayList<>();
    bookStores.add(new BookStore("Wendy", List.of("ABC","DEF")));
    bookStores.add(new BookStore("Jenny", List.of("BAC","AAA","XYZ")));


    // Storeownwer list
    List<String> owners = bookStores.stream()
    .map(e->e.getOwner())
    .collect(Collectors.toList());

    System.out.println(owners);

    // Demo
    List<Person> persons2 = new ArrayList<>();
    persons.add(new Person("Wendy",20));
    persons.add(new Person("Oscar",21));
    persons.add(new Person("Jenny",22));

    List<StoreOwner> owners2 = persons.stream()
    .filter(p->{
      for (BookStore bs : bookStores){
        if (p.getName().equals(bs.getOwner())){
          return true;
        }
      }
      return false;
    })
    .map(e->{
      for (BookStore bs : bookStores){
        if (e.getName().equals(bs.getOwner())){
          return new StoreOwner(bs.getOwner(), e.getAge(),bs.getBooks());
        }
      }
      return null;
    })
    .collect(Collectors.toList());

    System.out.println(owners2);

    //Find the List<String> names, who has a bookstore, and contain the "AAA" book

    List<String> owners3 = persons.stream()
    .filter(p->{
      for (BookStore bs : bookStores){
        if (p.getName().equals(bs.getOwner()) && bs.getBooks().contains("ABC")){
          return true;
        }
      }
      return false;
    })
    .map(p->p.getName())
    .collect(Collectors.toList());

    System.out.println(owners3);


    //Stream covers about 80% of loop and restructuring, so for-each can be replaced

    // sorted()
    List<String> nameList2 =List.of("Jenny","Tommy","Betty");
    Comparator<String> decendingName = (s3,s4)->s3.compareTo(s4);

    nameList2.stream()
    .sorted()
    .forEach(e->System.out.println(e));

    // Stream.class
    Stream<String> ss2 = Stream.of("ABC","AAA","IJK"); // one of the stream type, the content just like a list
    ss2.filter(e->e.startsWith("A"))
    .forEach(e->System.out.println(e));

    












  }
}