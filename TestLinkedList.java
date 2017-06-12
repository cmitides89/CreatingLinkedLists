public class TestLinkedList{
  public static void main(String[] args){
    MyLinkedList mL = new MyLinkedList();
    //create a node
    Node n1 = new Node("bob");
    Node n2 = new Node("mina");
    Node n3 = new Node("lina");
    Node n4 = new Node("Jill");
    Node n5 = new Node("bill");
    Node n6 = new Node("Jack");
    Node n7 = new Node("bills friend");
    //add the node to the list
    mL.add(n1);
    mL.add(n2);
    mL.add(n3);
    mL.add(n6);
    mL.add(n7);
    // mL.add(n4);
    mL.printList();
    // System.out.println("==================");
    System.out.println(mL.indexOf("bob")+ " bobs index");

    mL.insertAfter(2, n4);
    System.out.println("=========insert after 2========= " + n4.name);
    mL.printList();

    mL.insertBefore(1, n5);
    System.out.println("=========insert before 1========= " +n5.name);
    mL.printList();

    System.out.println("========= removed ========= "+n3.name);
    mL.removeNodeAt(3);
    mL.printList();

    System.out.println("============ remove last ============");
    mL.removeNodeAt(5);
    mL.printList();

    System.out.println("============ remove first ============");
    mL.removeNodeAt(0);
    mL.printList();
  }
}
