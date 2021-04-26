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


    public void display() {
        linkedList.display();
    }

    public INode pop() {
        INode temp = top;
        top = top.getNext();
        linkedList.removeAtFirstPosition();
        return temp;
    }

    public INode peek() {
        return top;
    }

    public boolean isEmpty() {
        if(top == null)
            return true;
        return false;
    }

    public int size() {
        return linkedList.size();
    }
}
