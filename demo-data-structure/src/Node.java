// Design a Class (Node), link up another Node object

public class Node {

  private String id;
  private Node next; // object refereence

  public Node(){

  }

  public Node(String id){
    this.id = id;
  }

  // public void add(Node next){

  // }

  public Node getNext(){
    return this.next;
  }

  // public void setNext(Node next){
  public void setNext(Node next){
    this.next = next;
  }

  public static void main(String[] args) {
    Node node1 = new Node("John"); // node1->node2
    System.out.println(node1);
    Node node2 = new Node("Mary");
    System.out.println(node2);
    node1.setNext(node2);

    Node node3 = new Node("Peter");
    System.out.println(node3);
    node2.setNext(node3);

    // node1->node2->node3

    Node head = node1;
    while(head.next != null){
      head = head.getNext();
      System.out.println(head.id);
    }

  }
  
}
