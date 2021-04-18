package javapractice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LinkedListTest {

    Node<Integer> node1;
    Node<Integer> node2;
    Node<Integer> node3;
    LinkedList<Integer> linkedlist;

    @BeforeEach
    void setUp() {
        node1 = new Node<Integer>(56);
        node2 = new Node<Integer>(30);
        node3 = new Node<Integer>(70);
        linkedlist = new LinkedList<Integer>();
    }

    @Test
    void givenThreeNumbers_WhenCallCreateMethod_ShouldReturnLinkedListNode() {
        node1.setNext(node2);
        node2.setNext(node3);
        linkedlist.create(node1);
        linkedlist.create(node2);
        Node<Integer> resultNode = linkedlist.create(node3);
        linkedlist.display();
        Assertions.assertEquals(node1.getNext().getNext(), resultNode.getNext().getNext());
    }

    @Test
    void givenNumbers_WhenCallAddAtFirstPositionMethod_ShouldReturnLinkedListNode() {
        node1.setNext(node2);
        node2.setNext(node3);
        linkedlist.create(node3);
        linkedlist.addAtFirstPosition(node2);
        Node<Integer> resultNode = linkedlist.addAtFirstPosition(node1);
        linkedlist.display();
        Assertions.assertEquals(node1.getNext().getNext(), resultNode.getNext().getNext());
    }

    @Test
    void givenNumbers_WhenCallAddAtLastPositionMethod_ShouldReturnLinkedListNode() {
        node1.setNext(node2);
        node2.setNext(node3);
        linkedlist.create(node1);
        linkedlist.addAtLastPosition(node2);
        Node<Integer> resultNode = linkedlist.addAtLastPosition(node3);
        linkedlist.display();
        Assertions.assertEquals(node1.getNext().getNext(), resultNode.getNext().getNext());
    }

}
