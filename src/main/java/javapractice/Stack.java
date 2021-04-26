package javapractice;

public class Stack<K> {

    INode<K> top = null;
    LinkedList<Integer> linkedList = null;

    public Stack() {
        linkedList = new LinkedList<>();
    }

    public INode<K> push(INode node) {
        top = linkedList.addAtFirstPosition(node);
        return top;
    }


}
