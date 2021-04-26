package javapractice;

public class Node<K> implements  INode<K> {

    private K value;
    private INode<K> next;

    public Node(K value) {
        this.value = value;
        this.next = null;
    }

    public K getValue() {
        return value;
    }

    public void setValue(K value) {
        this.value = value;
    }

    public INode<K> getNext() {
        return next;
    }

    public void setNext(INode<K> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
    
}
