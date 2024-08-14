import org.w3c.dom.Node;

import java.util.Scanner;
import java.util.Vector;

/*class LL
 {
  private   Node head;
    private Node tail;
     int size;

    public LL()
    {
        this.size = 0;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size += 1;

    }

    public void Display() {
        Node temp = head;
        while (temp!= null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }


    public class Node {
          int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next)
        {
            this.value = value;
            this.next = next;
        }
    }

 }
 class Main{
    public static void main(String[] args){
        LL l = new LL();
        l.insertFirst(10);
        l.insertFirst(20);
        l.insertFirst(30);
        l.insertFirst(44);
        l.insertFirst(55);
        l.Display();
    }
 }*/
/*class LL{
    private Node head;
    private Node tail;
     int size ;
    public LL(){
       this.size =0;
    }
    public void createList() {
        Scanner s = new Scanner(System.in);
      //  Node head = null;
        int i = 1;
        System.out.println("enter the size of data");
        int size = s,nextInt()'
        while (i <= size) {
            System.out.println("enter the data of node" + i);
            int data = s.nextInt();
            Node node = new Node(data);
            if (head == null) {
                head = node;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = node;
            }
            i++;
        }
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print(" END ");
    }
    int getMiddle(){
        Node temp = head;
        Vector <Integer> list = new Vector<>();
        while(temp!=null){
            list.add(temp.data);
            temp=temp.next;
        }
        int mid_index = list.size() /2;
        return list.get(mid_index-1);
    }
    public void removeFirst(){
     int val = head.data;
     head = head.next;
     if(head==null){
         tail = head;
     }
     size--;
    }

     public class Node{
         int data;
         private Node next;
         Node(int data){
             this.data =data;
         }
         Node(int data, Node next){
             this.data= data;
             this.next = next;
         }
    }
}
public class Main{
    public static void main(String... args){
        LL l = new LL();
        l.createList(4);
        l.display();
        System.out.println("middle value of linked list is " + l.getMiddle());
    l.removeFirst();
        l.display();
    }
}*/
/*class LL{
    private Node head;
    private Node tail;
    public int size ;
    public LL()
    {
        this.size =0;
    }
    public void insertFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }
        //size+=1
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }f
        System.out.print("END");

    }

    class Node
    {
      private Node next;
      private Node prev;
      public int data;
      public Node(int data){
          this.data = data;
      }
      public Node(Node next , Node prev , int size )
      {
          this.next = next;
          this.prev = prev;
         this.data = data;
      }
    }
    }
    public class Main{
    public static void main(String[] args){
        LL l = new LL();
        l.insertFirst(10);
        l.insertFirst(20);
        l.insertFirst(30);
        l.display();
    }
}*/
class DLL{
    private Node head;
   // private Node tail;
    public int size;
    DLL(){
        this.size =0 ;
    }
    public void createDLL()
    {
        Scanner s  = new Scanner(System.in);
       System.out.println("enter the size of the list");
        int size = s.nextInt();
         for(int i = 1; i<= size;i++)
         {
            System.out.println("enter data of node" + i);
            int data = s.nextInt();
            Node node  = new Node(data);
            node.next= head;
            node.prev= head.prev;
                head.prev = node;
            head = node;
         }
    }
    public void Display(){
        Node temp = head;
        Node last = null;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            last = temp;
            temp = temp.next;
          //  size--;
        }
        System.out.print(" END ");

        System.out.println(" print reverse");
        while (last != null){
            System.out.print(last.data + " -> ");
            last = last.prev;
        }
        System.out.print("END");
    }
    class Node{
        Node next;
        Node prev;
        int data;
        Node(int dtata){
            this.data = data;
        }
        Node(Node next, Node prev , int data){
            this.next = next;
            this.prev =prev;
            this.data = data;
        }
    }
}
class Main{
    public static void main(String[] args){
        DLL d =new DLL();
        d.createDLL();
        d.Display();
     //   d.Display1();

    }
}