import java.math.BigDecimal;
import java.util.ArrayList;

public class Order {
  private int orderNum;

  public static int counter = 0;

  private ArrayList<OrderItem> orderItems;

  public Order(){
    //this.orderNum = orderNum + 1;

    this.orderNum = ++counter;
    this.orderItems = new ArrayList<>();
  }

  public boolean add(OrderItem orderItem){
    return this.orderItems.add(orderItem);
    
  }

  public double total(){
    BigDecimal total = BigDecimal.valueOf(0);
    //total = 0.0;
    for (OrderItem item : this.orderItems){
      total = total.add(item.itemTotal());
    }
    return total.doubleValue();
  }

}
