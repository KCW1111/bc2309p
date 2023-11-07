import java.util.ArrayList;
import java.util.Arrays;

public class DemoArrayList {

    public static void main(String[] args) throws Exception {
        //Array
    String[] strings = new String[5];

    for(int i = 0; i<strings.length; i++){
        strings[i] = "hello";
    }

    //string[5] = "hello"; // java.lang.ArrayIndexOutOfBoundsException

    // ArrayList.class

    ArrayList<String> strings2 = new ArrayList<>(); // Variable Size
    // from 1.5 or 1.8 on, ArrayList<String> strings2 = new ArrayList<String>(); is not required
    strings2.add("hello");
    strings2.add("hello");
    strings2.add("hello");
    strings2.add("hello");
    strings2.add("hello");
    // for-each
    for (String string : strings2) {
        System.out.println(string);
    }

    //ArrayList, put 1,2,3.....10 and printout

    ArrayList<Integer> integers = new ArrayList<>();
    int i = 1;
    while (i<=10){
        integers.add(i); // i -> primitive -> Wrapper ckass (auto-box)
        //integers.add(Integer.valueOf(i);
        i++;
    }

    for (Integer integer : integers) {
        System.out.println(integer);
        
    }

    //ArrayList, put 1, 2, 3, ....10 and print out
    //Store the number swhich can be dvided by 3
    //while loop

    ArrayList<Integer> integers2 = new ArrayList<>();
    int j =1;
    while(j<=10){
        if (j%3 == 0)
            integers2.add(j);
        j++;
    }
    
    for (Integer integer : integers2) {
        System.out.println(integer);
        
    }

    // ArrayList considers ordering
    // set(), to update value at some place
    integers2.set(1,10);
    for (Integer integer : integers2) {
        System.out.println(integer);        
    }// 3, 10, 9

    // get()
    System.out.println(integers2.get(2)); //9

    //size()
    System.out.println(integers2.size()); //3

    // add null
    integers2.add(null);
    System.out.println(integers2.size()); //4

    // isEmpty
    System.out.println(integers2.isEmpty()); //false

    //
    integers2.remove(2); // remove 3rd objecgt in the list
    System.out.println(integers2.size()); //3

    System.out.println(integers2.size());
    System.out.println(integers2.get(0));
    System.out.println(integers2.get(1));
    System.out.println(integers2.get(2));

    System.out.println(integers2.contains(null));


    //sublist
    System.out.println(integers.subList(0, integers.size()));


    ArrayList<Integer> integers3 = new ArrayList<>();
    integers3.add(1000);
    integers3.add(2000);

    integers3.addAll(integers2);
    System.out.println(integers3);

    // indexOf
    System.out.println(integers3.indexOf(1000));
    integers3.add(1000);
    System.out.println(integers3);
    System.out.println(integers3.lastIndexOf(1000));

    // add(index, element) -> insert
    integers3.add(1,1500);
    System.out.println(integers3);

    // removeAll()

    ArrayList<Integer> removeList = new ArrayList<>();
    removeList.add(1000);
    removeList.add(1500);
    integers3.removeAll(removeList);
    System.out.println(integers3);


    // Conversion to Array (ArrayList to Array), always use
    // ArrayList<Integer> -> Integer[]

    Integer[] arr = integers3.toArray(new Integer[0]);
    System.out.println(Arrays.toString(arr));

    // to object array
    Object[] arr2 = integers3.toArray();
    Integer[] result = new Integer[arr2.length];
    int k = 0;
    for (Object obj: arr2){
        if (obj == null ){
            result[k++] = null;
        }else if (obj instanceof Integer)
            result[k++] = (Integer) obj;
            //System.out.println(obj.getClass());
    }
    System.out.println(Arrays.toString(arr2));

    }
}
