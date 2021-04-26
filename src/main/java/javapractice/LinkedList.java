package javapractice;

public class LinkedList<K extends Comparable> {

    INode<K> head;
    INode<K> tail;

    public INode<K> create(INode<K> node) {
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
        INode<K> temp = head;
        while(temp.getNext() != null) {
            System.out.print(temp.getValue()+" -> ");
            temp = temp.getNext();
        }
        System.out.println(temp.getValue());
    }

    public INode<K> addAtFirstPosition(INode<K> node) {
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

    public INode<K> addAtLastPosition(INode<K> node) {
        return create(node);
    }

    public INode<K> addAtMiddlePosition(int position, INode<K> node) {
        if(head == null && tail == null) {
            head = node;
            tail = node;
        }
        else if(position == 1)
            return addAtFirstPosition(node);
        else {
            INode<K> temp = head;
            for(int i = 1; i < position - 1; i++) {
                temp = temp.getNext();
            }
            node.setNext(temp.getNext());
            temp.setNext(node);
        }
        return head;
    }

    public INode<K> removeAtFirstPosition() {
        if(head == null && tail == null)
            System.out.println("List is empty");
        else {
            INode<K> temp = head;
            head = head.getNext();
            temp.setNext(null);
        }
        return head;
    }

    public INode<K> removeAtLastPosition() {
        if(head == null && tail == null)
            System.out.println("List is empty");
        else {
            INode<K> temp = head;
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
            INode<K> temp = head;
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

    public INode<K> insertAfterFixedNode(INode<K> node, INode<K> newNode) {
        if(head == null && tail == null)
            System.out.println("List is empty");
        else {
            INode<K> temp = head;
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
            INode<K> temp = head;
            while(temp != null) {
                temp = temp.getNext();
                count++;
            }
        }
        return count;
    }

    public INode<K> removeFromMiddle(INode<K> node) {
        if(head == null && tail == null)
            System.out.println("List is empty");
        int position = search(node.getValue());
        if(position == 1)
            return removeAtFirstPosition();
        else if(position == size())
            return removeAtLastPosition();
        else {
            INode<K> temp = head;
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

    public INode<K> sort(INode<K> node) {
        INode<K> node1 = head;
        INode<K> node2 = head.getNext();
        INode<K> temp = node;
        while(node1.getNext() != null) {
            while(node2 != null) {
                if (node1.getValue().compareTo(node2.getValue()) == 1) {
                    temp.setValue(node1.getValue());
                    node1.setValue(node2.getValue());
                    node2.setValue(temp.getValue());
                }
                node2 = node2.getNext();
            }
            node1 = node1.getNext();
            node2 = node1.getNext();
        }
        return head;
    }
}
