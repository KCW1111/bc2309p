import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomHashMap {

  public static void main(String[] args) {
    Map<Integer, OrderItem> itemMap = new HashMap<>();
    itemMap.put(1, new OrderItem(3,4.5));
    itemMap.put(2, new OrderItem(5,6.5));
    itemMap.put(3, new OrderItem(7,8.5));

    OrderItem orderItem = itemMap.get(3);
    System.out.println(orderItem.getUnitPrice());

    Map<Customer, List<Order>> cusMap = new HashMap<>();
    Customer c1 = new Customer("John");
    Customer c2 = new Customer("John"); // obviously, c1 and c2 are 2 objects are they are with different object reference
    // but the overrided equals defines what is "EQUAL"

    cusMap.put(c1, List.of(new Order(),new Order())); 

    // if(c1.equals(c2)){
    //   cusMap.put(c2, List.of(new Order()));
    // }

    
    cusMap.put(c2, List.of(new Order(),new Order(), new Order())); // Hashmap.class line 633 check equalsk which this equals being overrided in Customer.java


    System.out.println(cusMap.size());
    System.out.println(cusMap.get(c1).size());
    System.out.println(cusMap.get(c2).size());
    
  }
  
}
