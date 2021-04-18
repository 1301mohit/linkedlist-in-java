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
        if(head == null && tail == null)
            System.out.println("Linked list is empty");
        Node<K> temp = head;
        while(temp.getNext() != null) {
            System.out.print(temp.getValue()+" -> ");
            temp = temp.getNext();
        }
        System.out.println(temp.getValue());
    }

    public Node<K> addAtFirstPosition(Node<K> node) {
        if(head == null && tail == null)
            head = node;
        else {
            node.setNext(head);
            head = node;
        }
        return head;
    }

}
