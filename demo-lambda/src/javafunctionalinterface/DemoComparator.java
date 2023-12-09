package javafunctionalinterface;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DemoComparator {
  public static void main(String[] args) {
    Customer customer1 = new Customer("Mary", LocalDate.of(2000,10,7));
    Customer customer2 = new Customer("Sam", LocalDate.of(2000,10,8));
    Customer customer3 = new Customer("Kate", LocalDate.of(2000,10,9));
    Customer customer4 = new Customer("Ken", LocalDate.of(2000,10,10));

    Comparator<Customer> sortByName = (c1,c2) -> {
      return c1.getName().compareTo(c2.getName());
    };

    Comparator<Customer> sortByJoinDate = (c1,c2) -> {
      return c1.getJoinDate().isBefore(c2.getJoinDate()) ? 1 : -1;
    };

    Comparator<Customer> sortByNameAndThenJoinDate = sortByName.thenComparing(sortByJoinDate);

    List<Customer> customers = new ArrayList<>(List.of(customer1,customer2,customer3,customer4));

    Collections.sort(customers, sortByNameAndThenJoinDate);

    System.out.println(customers);


  }
}
