package javapractice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LinkedListTest {

    Node<Integer> node1;
    Node<Integer> node2;
    Node<Integer> node3;
    Node<Integer> node4;
    Node<Integer> node5;
    LinkedList<Integer> linkedlist;

    @BeforeEach
    void setUp() {
        node1 = new Node<Integer>(56);
        node2 = new Node<Integer>(30);
        node3 = new Node<Integer>(70);
        node4 = new Node<Integer>(80);
        node5 = new Node<Integer>(90);
        linkedlist = new LinkedList<Integer>();
    }

    @Test
    void givenThreeNumbers_WhenCallCreateMethod_ShouldReturnLinkedListNode() {
        linkedlist.create(node1);
        linkedlist.create(node2);
        Node<Integer> resultNode = linkedlist.create(node3);
        linkedlist.display();
        node1.setNext(node2);
        node2.setNext(node3);
        Assertions.assertEquals(node1.getNext().getNext(), resultNode.getNext().getNext());
    }

    @Test
    void givenNumbers_WhenCallAddAtFirstPositionMethod_ShouldReturnLinkedListNode() {
        linkedlist.create(node3);
        linkedlist.addAtFirstPosition(node2);
        Node<Integer> resultNode = linkedlist.addAtFirstPosition(node1);
        linkedlist.display();
        node1.setNext(node2);
        node2.setNext(node3);
        Assertions.assertEquals(node1.getNext().getNext(), resultNode.getNext().getNext());
    }

    @Test
    void givenNumbers_WhenCallAddAtLastPositionMethod_ShouldReturnLinkedListNode() {
        linkedlist.create(node1);
        linkedlist.addAtLastPosition(node2);
        Node<Integer> resultNode = linkedlist.addAtLastPosition(node3);
        linkedlist.display();
        node1.setNext(node2);
        node2.setNext(node3);
        Assertions.assertEquals(node1.getNext().getNext(), resultNode.getNext().getNext());
    }

    @Test
    void givenNumbers_WhenCallAddAtMiddlePositionMethod_ShouldReturnLinkedListNode() {
        int position = 2;
        linkedlist.create(node1);
        linkedlist.create(node3);
        Node<Integer> resultNode = linkedlist.addAtMiddlePosition(position, node2);
        linkedlist.display();
        node1.setNext(node2);
        node2.setNext(node3);
        Assertions.assertEquals(node1.getNext().getNext(), resultNode.getNext().getNext());
    }

    @Test
    void givenFiveNumbers_WhenCallAddAtMiddlePositionMethod_ShouldReturnLinkedListNode() {
        int position = 1;
        linkedlist.create(node2);
        linkedlist.create(node3);
        linkedlist.create(node4);
        linkedlist.create(node5);
        Node<Integer> resultNode = linkedlist.addAtMiddlePosition(position, node1);
        linkedlist.display();
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        Assertions.assertEquals(node1.getNext().getNext().getNext().getNext(), resultNode.getNext().getNext().getNext().getNext());
    }

    @Test
    void givenFiveNumbers_WhenAddAtMiddlePositionFour_ShouldReturnLinkedListNode() {
        int position = 4;
        linkedlist.create(node1);
        linkedlist.create(node2);
        linkedlist.create(node3);
        linkedlist.create(node5);
        Node<Integer> resultNode = linkedlist.addAtMiddlePosition(position, node4);
        linkedlist.display();
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        Assertions.assertEquals(node1.getNext().getNext().getNext().getNext(), resultNode.getNext().getNext().getNext().getNext());
    }

}
