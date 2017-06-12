public class Node{
  String name;
  Node next;

  // int index;

  Node(){
    name = null;
    next = null;

    // index = null;
  }

  Node(String name){
    this.name = name;
    this.next = null;
    
  }

  // public String toString(){
  //   return "name "+ name+ " next " +next;
  // }
}
