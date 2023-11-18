import java.util.Deque;
import java.util.LinkedList;

public class DemoDeque {
  public static void main(String[] args) {
    // Interface (Deque)
    Deque<Customer> customers = new LinkedList<>();
    // Hide the methods of List, it contains only Deque methods

    Customer customer1 = new Customer("Ada");
    Customer customer2 = new Customer("Bob");
    Customer customer3 = new Customer("Candy");
    Customer customer4 = new Customer("Dave");
    Customer customer5 = new Customer("Elsa");


    customers.add(customer1);
    customers.add(customer2);
    customers.add(customer3);
    //customers.add(customer4);
    //customers.add(customer5);

    //System.out.println(customer1.getName());
    System.out.println(customers); // with toString is class cutomers, the object references will be printed

    customers.addFirst(customer4);
    customers.addLast(customer5);

    System.out.println(customers);

    customers.remove();
    System.out.println(customers);
    customers.removeFirst();
    System.out.println(customers);
    customers.removeLast();
    System.out.println(customers);

    customers.pop(); // squivalent to removeFrist()
    System.out.println(customers);
    customers.push(customer5); //equivalent addFrist()
    System.out.println(customers);

    
  }
}
