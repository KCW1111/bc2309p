// Design a Class (Node), link up another Node object

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NameList {

  private String id;
  private NameList next; // object refereence

  public NameList(){

  }

  public NameList(String id){
    this.id = id;
  }

  // public void add(Node next){

  // }

  public NameList getNext(){
    return this.next;
  }

  // public void setNext(Node next){
  public void add(NameList next){
    // this.next = next;
    this.getLast().next = next;
  }

  public void add(String id){
    // this.next = new NameList(id);
    this.getLast().next = new NameList(id);
  }

  public NameList getLast(){
    NameList head = this;
    while(head.next != null){
      head = head.getNext();
      //System.out.println(head.id);
    }
    return head;
  }

  public NameList getMiddle(){
    // To Do
    // Step 1 count total num of elements
    // Step 2 loop until the half count
    return null;
  }

  public String remove(String id){
    //return a removed element
    //if not found, return null
    NameList headCurrent = this;
    int exitCounter = 0;
    while(headCurrent.id != id && exitCounter<5){
      //System.out.println(headCurrent.id);

      NameList headNext = headCurrent.getNext();
      System.out.println(headCurrent);
      System.out.println(headNext);
      if (headNext.id == id){
        String returnRemoved = headNext.id;
        headCurrent.next = headNext.next;
        return returnRemoved;
      }
      exitCounter++;
        
      //System.out.println(head.id);
    }

    return null;
    
  }

  public void check(NameList nl){
    while(nl.next != null){
      System.out.println(nl.id);
    }
  }



  public static void main(String[] args) {
    NameList node1 = new NameList("John"); // node1->node2
    System.out.println(node1);
    NameList node2 = new NameList("Mary");
    System.out.println(node2);
    node1.add(node2);

    NameList node3 = new NameList("Peter");
    System.out.println(node3);
    node2.add(node3);

    NameList node4 = new NameList("Parker");
    System.out.println(node4);
    node3.add(node4);


    //System.out.println(node2.getLast().id);

  //   // node1->node2->node3

  //   NameList head = node1;


  //   while(head.next != null){
  //     head = head.getNext();
  //     System.out.println(head.id);
  //   }

  NameList nl = new NameList();
  nl.add("ABC");
  nl.add("DEF");
  nl.add("XYZ");

  LinkedList<String> nl2 = new LinkedList<>();
  nl2.add("ABC");
  nl2.add("DEF");
  nl2.add("XYZ");

  //String thingRemoved = nl.remove("XYZ");

  System.out.println(node1.remove("XYZ"));
  //System.out.println(nl.getNext().getNext().getNext().id);



  List<String> nl4 = new ArrayList<>();
  nl4 = new LinkedList<>();
  // Compile time in Java
  nl4.add("ABC") ; // List<String> determine which methods can be invoiked
  // Run time in Java: nl4 will know which object it points to
  nl4.remove(0);

  System.out.println(nl4.size()); // 0

  }
  
}
