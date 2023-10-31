package enums;

public enum OrderStatus {
  ORDERED(1),
  PRODUCTION(2),
  SHIPPED(3),
  DELIVERED(4),
  CLOSE(5),
  ;

  //manage status, order stuats has orders, example, order, then produce, then delivery, then close
  // 1. a method, return next status based on the current status
  // 2. a method, check if the status is forwarded or backward

  private int statusCode;

  private OrderStatus(int statusCode){
    this.statusCode = statusCode;
  }

  public int getStatusCode() {
    return this.statusCode;
  }

  public OrderStatus getOrderStatus(int statusCode){
    for (OrderStatus status : OrderStatus.values()){
      if (status.getStatusCode() == statusCode)
        return status;
    }
    return null;
  }

  //equals, whitin the world the programmer created, the paradigm, the 2 objects are the same (not talking about things in the heap)
  //so, equals is not required in enum
  //hascode is not needed, as limited objects, they are all distinct

  public OrderStatus nextStatus(){
    //int currentStatus = this.getStatusCode();  //this, no need to getStatus(), as this can look for its attributes
    // int currentStatus = this.statusCode + 1;
    // if (currentStatus>5)
    //   return getOrderStatus(currentStatus);
    // return null;

    int code = this.statusCode < 5? this.statusCode + 1 : this.statusCode;
    return getOrderStatus(code);
  }

  public boolean isForwardStatus(OrderStatus orderStatus){

    return this.statusCode < orderStatus.getStatusCode();
  }

  public static void main(String[] args) {
    System.out.println(OrderStatus.DELIVERED.nextStatus());
    System.out.println(OrderStatus.ORDERED.isForwardStatus(OrderStatus.SHIPPED));
  }




}
