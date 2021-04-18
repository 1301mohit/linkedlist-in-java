package javapractice;

public class LinkedList<K> {

    Node<K> head;
    Node<K> tail;

    public Node<K> create(Node<K> node) {
        if(head == null && tail == null) {
            this.head = node;
            this.tail = node;
        }
        else {
            this.tail.setNext(node);
            this.tail = node;
        }
        return head;
    }

    public void display() {
        Node<K> temp = head;
        while(temp.getNext() != null) {
            System.out.print(temp.getValue()+" -> ");
            temp = temp.getNext();
        }
        System.out.println(temp.getValue());
    }

}
