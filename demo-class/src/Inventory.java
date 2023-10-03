public class Inventory {
  // primitives, wrapper class, String, altogether 18? types
  Stock[] stocks;


  public Inventory(){

  }

  public Inventory (Stock stock){
    this.stocks = new Stock[100]; //the shortcoming of array, you have to declare in advance the spaces required, can be replaced by other data structure
    this.stocks[0] = stock;
  }

  public void add(Stock stock) { //no necessary to be setStock, the meaning is to add/create stock
    for (int i = 0; i<this.stocks.length; i++){
      if (stocks[i] == null){
        stocks[i] = stock;
        break;
      }
    }
  }

  public Stock[] getStocks() {
    return stocks;
  }

  // method: return no. of stock in the stock array
  public int stockNum(){
    int i = 0;
    int counter = 0;
    while (i <this.getStocks().length){
      if (this.getStocks()[i] != null)
        counter++;
        i++;

    }
    return counter;
  }

  public static void main(String[] args) {
    // new a stock with price
    // new an Inventory
    // how to set stock into an inventory

    Stock stock = new Stock(20.0);

    Inventory inventory = new Inventory(stock);

    Stock stock2 = new Stock(30.0);

    inventory.add(stock2);

    Stock stock3 = new Stock(40.0);

    inventory.add(stock3);
    //inventory.add(stock);

    //System.out.println(inventory.getStock().getPrice());
    //System.out.printf("%s%n",inventory.getStock().getPrice());


    //stock.setPrice(20.0);

    // how to print the price of the stock inside the inventorh object
    //chain metho
    //for (Stock s: inventory.getStocks()){
    //  System.out.println(s);
    //}

    // or
    for (int i = 0; i < inventory.getStocks().length; i++){
      if (inventory.getStocks()[i] != null)
        System.out.println("Stock " + i + ", price=" +inventory.getStocks()[i].getPrice());
    }

    System.out.printf("Total No. of stocks is: %s%n",inventory.stockNum());

  }
}
