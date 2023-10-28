package enums;

public enum OrderStatus {
  ORDERED,
  PRODUCTION,
  DELIVERED,
  CLOSED,
  ;

  //manage status, order stuats has orders, example, order, then produce, then delivery, then close
  // 1. a method, return next status based on the current status
  // 2. a method, check if the status is forwarded or backward
}
