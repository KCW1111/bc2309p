import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {
  public static void main(String[] args) {
    //<key, value> pair -> Entry
    Map<String, String> stringMap = new HashMap<>();
    stringMap.put("A","John");
    //stringMap.put("A","Mary");
    stringMap.put("A2","Sally");
    stringMap.put(null,"Oscar");
    stringMap.put(null,"Cherry");
    System.out.println(stringMap.get("A"));
    System.out.println(stringMap.get("A2"));
    System.out.println(stringMap.get(null));

    // Loop Map.Entry -> entrySet()
    for (Map.Entry<String, String> entry : stringMap.entrySet()){
      System.out.println(entry.getKey() + " " + entry.getValue());
    }

    // Loop value -> values()
    for (String value:stringMap.values()){
      System.out.println("value = " + value); // not sequential, be careful
    }

    // keySet()
    for (String key:stringMap.keySet()){
      System.out.println("key = " + key); // also not sequential
    }

    System.out.println(stringMap.containsKey(null));
    System.out.println(stringMap.containsKey("A2"));

    String[] strings = {"John", "hello", "Oscar", "oscar", "Vincent"};
    //check if the value exists in map, if no, add into the map, if yes, print "John (value) already exist"

    for (String string : strings) {
      if (stringMap.containsValue(string))
        System.out.println(string + " already exist");
      else
        stringMap.put(generateKey(),string);
      
    }

    System.out.println(strings);

    // Loop Map.Entry -> entrySet()
    for (Map.Entry<String, String> entry : stringMap.entrySet()){
      System.out.println(entry.getKey() + " " + entry.getValue());
    }

    
    }

    static int counter = 1;
    public static String generateKey(){
      return "G" + ++counter;


  }
}
