import java.math.BigDecimal;

public class OrderItem {
  private int quantity;
  private double unitPrice;

  public OrderItem(int quantity, double unitPrice){
    this.quantity = quantity;
    this.unitPrice = unitPrice; 
  }

  public int getQuantity() {
    return quantity;
  }

  public double getUnitPrice() {
    return unitPrice;
  }

  public BigDecimal itemTotal(){
    return BigDecimal.valueOf(quantity).multiply(BigDecimal.valueOf(unitPrice));
  }

   public static void main(String[] args) {
    OrderItem oi = new OrderItem(2, 3);
    System.out.println(oi.itemTotal());
   }
}
