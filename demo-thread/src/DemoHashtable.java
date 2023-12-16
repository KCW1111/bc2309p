import java.util.HashMap;
import java.util.Hashtable;

public class DemoHashtable {
  public static void main(String[] args) throws InterruptedException {
    //Hashmap (non Thread-safe)
    //Hashable (Thread-safe）

    HashMap<Integer, String> map = new HashMap<>();
    Hashtable<String,String> table = new Hashtable<>();

    Runnable mapPut = ()->{
      for (int i=0; i<100; i++){
        map.put(i, String.valueOf(i));
      }
    };

    Thread t1 = new Thread(mapPut);
    Thread t2 = new Thread(mapPut);
    t2.start();

    t1.join();
    t2.join();

    System.out.println(map.size());

    for (var entry : map.entrySet()){
      System.out.println(entry.getKey() + " " + entry.getValue());
    }

  }
}
