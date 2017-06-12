public class MyLinkedList{
  //this node will be our first node in the linked list
  private Node first;

  MyLinkedList(){
    //if first is null it is our first item in the linked list
    first = null;
  }

  public void add(Node n){
    //if our node has first null we know that it is a new list and we need to
    //make n our head
    if(first == null){
      first = n;
    }else{
      //add our node to be the next item that is null if first is not null
      Node trav = first;
      while(trav.next != null){
        //if its not null move to the next node
        trav = trav.next;
      }
      trav.next = n;
    }
  }
  public void removeNodeAt(int index){

    int nodeCount = 0;
    Node trav;
    trav = first;
    //move forward && add to our counter
    while(trav != null){
      trav = trav.next;
      nodeCount++;
    }
    System.out.println("Node count = " +nodeCount);
    //reset trav to null
    trav = null;
    //if index is smaller than our count
    if(index < nodeCount){
      //and index is 0, that means we want to remove our first node
      if(index == 0){
        //make trav = first to go to that position
        trav = first;
        //replace first with it's next reference
        trav = trav.next;
        //now make the first's original next null
        first.next = null;
        //override first with trav
        first = trav;
      }else{
        trav = first;
        int pos = 0;
        while(pos < index-1){
          trav = trav.next;
          pos ++;
        }
        //last element
        if(trav.next.next == null){
          trav.next = null;
        }else{
          Node temp = trav.next.next;
          trav.next.next = null;
          trav.next = temp;
        }

      }
    } //end if index <= nodeCount

  }

  public void insertAfter(int index, Node n){
    Node trav = first;
    int count = 0;
    while(count < index){
      trav = trav.next;
      count ++;
    }
    n.next = trav.next;
    trav.next = n;
  }

  public void insertBefore(int index, Node n){
    Node trav;
    int nodeCount = 0;
    trav = first;
    while(trav != null){
      trav = trav.next;
      nodeCount ++;
    }
    System.out.println("Node count = " + nodeCount);
    trav = null;
    if(index < nodeCount){
      if(index == 0){
        n.next = first;
        first = n;
      }else {
        trav = first;
        int pos = 0;
        while(pos < index-1){
          trav = trav.next;
          pos++;
        }
        n.next = trav.next;
        trav.next = n;
      }
    }
  }

  public void printList(){
    Node trav = first;
    // System.out.println(first.name);
    while(trav != null){
      // System.out.println(trav.name);
      System.out.println( indexOf(trav.name)+ " name: "+trav.name);
      //reassign to a new next
      trav = trav.next;
      // System.out.println(trav.next.toString());
    }
  }

  public int indexOf(String nm){
    int count = 0;
    boolean isNotNull;
    Node trav = first;
    while(trav != null){
    // while(trav.name != null){
      if(trav.name.equals(nm)){
        return count;
      }
      count ++;
      trav = trav.next;
    }
    return -1;
  }

}
