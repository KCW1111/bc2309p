import java.math.BigDecimal;
import java.util.ArrayList;

public class Customer {

  private String name;

  public String getName(){
    return this.name;
  }

   private ArrayList<Order> orders;

   public Customer(String name){
    this.name = name;
    this.orders = new ArrayList<>();
   }

    public boolean addOrder(Order order){
    return this.orders.add(order);
  }

  public boolean add(Order order){
    return this.orders.add(order);
    
  }

  public boolean isVip(){
    // >= 2 order && order total > 50
    double total = 0;
    for (Order order : this.orders) {
      total+=order.total();
    }
    return this.orders.size() >= 2 && total > 50;
  }

  public double totalOrderAmount(){
    BigDecimal totalOrderAmount = BigDecimal.valueOf(0);
    for (Order order : this.orders){
      totalOrderAmount = totalOrderAmount.add(BigDecimal.valueOf(order.total()));
    }
    return totalOrderAmount.doubleValue();
  }

  public String toString(){
    return this.name;
  }
  

  // public double checkOut(){
  //   BigDecimal total = BigDecimal.valueOf(0);
  //   //total = 0.0;
  //   for (Order order : orders) {
      
  //   }
  //   for (OrderItem item : this.orderItems){
  //     total = total.add(item.itemTotal());
  //   }
  //   return total.doubleValue();
  // }


    public static void main(String[] args) {
    Customer customer1 = new Customer("John");

    Order order1 = new Order();
    order1.add(new OrderItem(4, 3.4));
    order1.add(new OrderItem(9, 1.5));

    Order order2 = new Order();
    order2.add(new OrderItem(3, 3.4));
    order2.add(new OrderItem(7, 1.5));

    customer1.add(order1);
    System.out.println(order1.total());
    System.out.println(customer1.totalOrderAmount());
    customer1.add(order2);
    System.out.println(order2.total());
    System.out.println(customer1.totalOrderAmount());

    
    

    System.out.println(customer1.isVip());
  }



}
