
// //     Node head;
// //     private int size;

// //     LL(){
// //         this.size = 0;
// //     }
// //     class Node{
// //         String data;
// //         Node next;
// //         Node(String data){
// //             this.data=data;
// //             this.next=null;
// //             size++;
// //         }
// //     }
// //     //add - first ,last
// //     public void addFirst(String data){
// //         Node newNode = new Node(data);
// //         if(head == null){
// //             head = newNode;
// //             return;
// //         }
// //         newNode.next = head;
// //         head = newNode;
// //     }
// //     //add-last
// //     public void addLast(String data){
// //         Node newNode = new Node(data);
// //         if(head == null){
// //             head = newNode;
// //             return;
// //         }
// //         Node currentNode = head;
// //         while(currentNode.next != null){
// //             currentNode = currentNode.next;
// //         }
// //         currentNode.next = newNode;
// //     }
// //     public void printList(){
// //         if(head == null){
// //             System.out.println("List is empty");
// //             return;
// //         }
// //         Node currNode = head;
// //         while(currNode != null){
// //             System.out.print(currNode.data + " -> ");
// //             currNode = currNode.next;
// //         }
// //         System.out.print("Null");
// //     }
// //     public void deleteFirst(){
// //         if(head == null){
// //             System.out.print("List is empty");
// //             return;
// //         }
// //         size--;
// //         head = head.next;
// //     }
// //     public void deleteLast(){
// //         if(head == null){
// //             System.out.print("List is empty");
// //             return;
// //         }
// //         size--;
// //         if(head.next == null){
// //             head = null;
// //             return;
// //         }
// //          Node secondLast = head;
// //          Node lastNode = head.next;
// //          while(lastNode.next != null){
// //             lastNode = lastNode.next;
// //             secondLast = secondLast.next;
// //          }
// //          secondLast.next = null;
// //     }
// //     public int getSize(){
// //         return size;
// //     }
// //     public static void main(String[] args) {
// //         LL list = new LL();
// //         list.addFirst("a");
// //         list.addFirst("b");
// //         list.addLast("c");
// //         list.printList();
// //         list.deleteFirst();
// //         list.printList();
// //         System.out.print(list.getSize());
// //     }
// // }
// // public class Main{
// //     public static void main(String[] args){
// //     }
// // }
// import java.util.*;
// class LL{
//     public static void main(String[] args) {
//         LinkedList<String> list = new LinkedList<String>();
//         list.addFirst("a");
//         list.addFirst("0");
//         list.addLast("b");
//         System.out.println(list.size());
//         for(int i=0; i<list.size();i++){
//             System.out.println(list.get(i));
//         }
//         System.out.println("Null");
//     }
// }
public class StackClass {

    static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Stack {

        public static Node head;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }




    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }

}
