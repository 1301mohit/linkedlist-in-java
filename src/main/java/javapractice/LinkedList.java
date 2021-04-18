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

    public Node<K> addAtLastPosition(Node<K> node) {
        return create(node);
    }

    public Node<K> addAtMiddlePosition(int position, Node<K> node) {
        Node<K> temp = null;
        if(head == null && tail == null)
            head = node;
        else if(position == 1)
            return addAtFirstPosition(node);
        else {
            temp = head;
            for(int i = 1; i < position - 1; i++) {
                temp = temp.getNext();
            }
            node.setNext(temp.getNext());
            temp.setNext(node);
        }
        return head;
    }

    public Node<K> removeAtFirstPosition() {
        if(head == null && tail == null)
            System.out.println("List is empty");
        else {
            Node<K> temp = head;
            head = head.getNext();
            temp.setNext(null);
        }
        return head;
    }
}
