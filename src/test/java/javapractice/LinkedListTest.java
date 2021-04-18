package javapractice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListTest {

    @Test
    void givenThreeNumbers_WhenCallCreateMethod_ShouldReturnLinkedListNode() {
        Node<Integer> node1 = new Node<Integer>(56);
        Node<Integer> node2 = new Node<Integer>(30);
        Node<Integer> node3 = new Node<Integer>(70);
        node1.setNext(node2);
        node2.setNext(node3);
        LinkedList<Integer> linkedlist = new LinkedList<Integer>();
        linkedlist.create(node1);
        linkedlist.create(node2);
        Node<Integer> resultNode = linkedlist.create(node3);
        linkedlist.display();
        Assertions.assertEquals(node1.getNext().getNext(), resultNode.getNext().getNext());
    }
}
