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
        if(head == null && tail == null) {
            head = node;
            tail = node;
        }
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
        if(head == null && tail == null) {
            head = node;
            tail = node;
        }
        else if(position == 1)
            return addAtFirstPosition(node);
        else {
            Node<K> temp = head;
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

    public Node<K> removeAtLastPosition() {
        if(head == null && tail == null)
            System.out.println("List is empty");
        else {
            Node<K> temp = head;
            while(temp.getNext().getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(null);
            tail = temp;
        }
        return head;
    }

    public int search(K key) {
        int position = 1;
        if(head == null && tail == null)
            System.out.println("List is empty");
        else {
            Node<K> temp = head;
            while(temp != null) {
                if(key == temp.getValue()) {
                    return position;
                }
                temp = temp.getNext();
                position++;
            }
            System.out.println("Key not found");
        }
        return 0;
    }

    public Node<K> insertAfterFixedNode(Node<K> node, Node<K> newNode) {
        if(head == null && tail == null)
            System.out.println("List is empty");
        else {
            Node<K> temp = head;
            while(temp != node) {
                temp = temp.getNext();
            }
            newNode.setNext(temp.getNext());
            temp.setNext(newNode);
        }
        return head;
    }

    public int size() {
        int count = 1;
        if(head == null && tail == null)
            return 0;
        else {
            Node<K> temp = head;
            while(temp != null) {
                temp = temp.getNext();
                count++;
            }
        }
        return count;
    }

    public Node<K> removeFromMiddle(Node<K> node) {
        if(head == null && tail == null)
            System.out.println("List is empty");
        int position = search(node.getValue());
        if(position == 1)
            return removeAtFirstPosition();
        else if(position == size())
            return removeAtLastPosition();
        else {
            Node<K> temp = head;
            while(temp.getNext() != null && temp.getNext() != node) {
                temp = temp.getNext();
            }
            if(temp.getNext() != null)
                temp.setNext(temp.getNext().getNext());
            else
                return null;
        }
        return head;
    }
}
