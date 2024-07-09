package Linked_List;

// linked list without using collection framework
public class Scratch {
    Node head;
    private int size;

     Scratch(){
         size = 0;
     }

     public class Node {
         String data;
         Node next;

         Node(String data){
             this.data = data;
             this.next = null;
             size++;
         }
     }

     //add first function
    public void addFirst(String data){
         Node newNode = new Node(data);
         newNode.next = head;
         head = newNode;
    }

    //add last function
    public void addLast(String data){
         Node newNode = new Node(data);
         if(head == null){
             head = newNode;
             return;
         }
         Node lastNode = head;
         while(lastNode.next != null){
             lastNode = lastNode.next;
         }
         lastNode.next = newNode;
    }

    //print List
    public void printList(){
         Node currNode = head;
         while(currNode != null){
             System.out.print(currNode.data + "->");
             currNode = currNode.next;
         }
        System.out.println("Null");
    }

    // remove first function
    public void removeFirst(){
         if(head == null){
             System.out.println("Empty List");
             return;
         }
         head = this.head.next;
         size--;
    }

    //remove last function
    public void removeLast(){
         if(head == null){
             System.out.println("Empty List");
             return;
         }
         size--;

         if(head.next == null){
             head = null;
             return;
         }

         Node currNode = head;
         Node lastNode = head.next;
         while(lastNode.next != null){
             currNode = currNode.next;
             lastNode = lastNode.next;
         }
         currNode.next = null;
    }

    //get size
    public int getSize(){
         return size;
    }

    public static void main(String[] args) {
        Scratch list = new Scratch();
        list.addLast("is");
        list.addLast("a");
        list.addLast("list");
        list.printList();

        list.addFirst("this");
        list.printList();
        System.out.println(list.getSize());

        list.printList();
        list.removeFirst();
        list.printList();
        list.removeLast();
        list.printList();
    }
}
