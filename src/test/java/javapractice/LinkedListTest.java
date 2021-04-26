package javapractice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListTest {

    INode<Integer> node1;
    INode<Integer> node2;
    INode<Integer> node3;
    INode<Integer> node4;
    INode<Integer> node5;
    LinkedList<Integer> linkedlist;

    @BeforeEach
    void setUp() {
        node1 = new Node<>(56);
        node2 = new Node<>(30);
        node3 = new Node<>(70);
        node4 = new Node<>(80);
        node5 = new Node<>(90);
        linkedlist = new LinkedList<>();
    }

    @Test
    void givenThreeNumbers_WhenCallCreateMethod_ShouldReturnLinkedListNode() {
        linkedlist.create(node1);
        linkedlist.create(node2);
        INode<Integer> resultNode = linkedlist.create(node3);
        linkedlist.display();
        node1.setNext(node2);
        node2.setNext(node3);
        assertEquals(node1.getNext().getNext(), resultNode.getNext().getNext());
    }

    @Test
    void givenNumbers_WhenCallAddAtFirstPositionMethod_ShouldReturnLinkedListNode() {
        linkedlist.create(node3);
        linkedlist.addAtFirstPosition(node2);
        INode<Integer> resultNode = linkedlist.addAtFirstPosition(node1);
        linkedlist.display();
        node1.setNext(node2);
        node2.setNext(node3);
        assertEquals(node1.getNext().getNext(), resultNode.getNext().getNext());
    }

    @Test
    void givenNumbers_WhenCallAddAtLastPositionMethod_ShouldReturnLinkedListNode() {
        linkedlist.create(node1);
        linkedlist.addAtLastPosition(node2);
        INode<Integer> resultNode = linkedlist.addAtLastPosition(node3);
        linkedlist.display();
        node1.setNext(node2);
        node2.setNext(node3);
        assertEquals(node1.getNext().getNext(), resultNode.getNext().getNext());
    }

    @Test
    void givenNumbers_WhenCallAddAtMiddlePositionMethod_ShouldReturnLinkedListNode() {
        int position = 2;
        linkedlist.create(node1);
        linkedlist.create(node3);
        INode<Integer> resultNode = linkedlist.addAtMiddlePosition(position, node2);
        linkedlist.display();
        node1.setNext(node2);
        node2.setNext(node3);
        assertEquals(node1.getNext().getNext(), resultNode.getNext().getNext());
    }

    @Test
    void givenFiveNumbers_WhenCallAddAtMiddlePositionMethod_ShouldReturnLinkedListNode() {
        int position = 1;
        linkedlist.create(node2);
        linkedlist.create(node3);
        linkedlist.create(node4);
        linkedlist.create(node5);
        INode<Integer> resultNode = linkedlist.addAtMiddlePosition(position, node1);
        linkedlist.display();
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        assertEquals(node1.getNext().getNext().getNext().getNext(), resultNode.getNext().getNext().getNext().getNext());
    }

    @Test
    void givenFiveNumbers_WhenAddAtMiddlePositionFour_ShouldReturnLinkedListNode() {
        int position = 4;
        linkedlist.create(node1);
        linkedlist.create(node2);
        linkedlist.create(node3);
        linkedlist.create(node5);
        INode<Integer> resultNode = linkedlist.addAtMiddlePosition(position, node4);
        linkedlist.display();
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        assertEquals(node1.getNext().getNext().getNext().getNext(), resultNode.getNext().getNext().getNext().getNext());
    }

    @Test
    void givenNumbers_WhenRemoveAtFirst_ShouldReturnLinkedListNode() {
        linkedlist.create(node1);
        linkedlist.create(node2);
        linkedlist.create(node3);
        INode<Integer> resultNode = linkedlist.removeAtFirstPosition();
        linkedlist.display();
        node2.setNext(node3);
        assertEquals(node2.getNext(), resultNode.getNext());
    }

    @Test
    void givenNumbers_WhenRemoveAtLast_ShouldReturnLinkedListNode() {
        linkedlist.create(node1);
        linkedlist.create(node2);
        linkedlist.create(node3);
        linkedlist.display();
        INode<Integer> resultNode = linkedlist.removeAtLastPosition();
        linkedlist.display();
        node1.setNext(node2);
        assertEquals(node1.getNext(), resultNode.getNext());
    }

    @Test
    void givenNumbers_WhenSearch_ShouldReturnPosition() {
        linkedlist.create(node1);
        linkedlist.create(node2);
        linkedlist.create(node3);
        linkedlist.display();
        int position = linkedlist.search(30);
        assertEquals(2, position);
    }

    @Test
    void givenNumbers_WhenSearchLastKey_ShouldReturnPosition() {
        linkedlist.create(node1);
        linkedlist.create(node2);
        linkedlist.create(node3);
        linkedlist.display();
        int position = linkedlist.search(70);
        assertEquals(3, position);
    }

    @Test
    void givenNumbers_WhenSearchFirstKey_ShouldReturnPosition() {
        linkedlist.create(node1);
        linkedlist.create(node2);
        linkedlist.create(node3);
        linkedlist.display();
        int position = linkedlist.search(56);
        assertEquals(1, position);
    }

    @Test
    void givenNumber_WhenInsertAfterFixedNode_ShouldReturnNode() {
        linkedlist.create(node1);
        linkedlist.create(node2);
        linkedlist.create(node3);
        linkedlist.display();
        INode<Integer> resultNode = linkedlist.insertAfterFixedNode(node2, node4);
        linkedlist.display();
        node1.setNext(node2);
        node2.setNext(node4);
        node4.setNext(node3);
        assertEquals(node1.getNext().getNext().getNext(), resultNode.getNext().getNext().getNext());
    }

    @Test
    void givenNumber_RemoveFromLinkedList_ShouldReturnNode() {
        linkedlist.create(node1);
        linkedlist.create(node2);
        linkedlist.create(node3);
        linkedlist.create(node4);
        linkedlist.display();
        INode<Integer> resultNode = linkedlist.removeFromMiddle(node3);
        linkedlist.display();
        node1.setNext(node2);
        node2.setNext(node4);
        assertEquals(node1.getNext().getNext(), resultNode.getNext().getNext());
    }

    @Test
    void givenNumber_RemoveFromFirstPosition_ShouldReturnNode() {
        linkedlist.create(node1);
        linkedlist.create(node2);
        linkedlist.create(node3);
        linkedlist.create(node4);
        linkedlist.display();
        INode<Integer> resultNode = linkedlist.removeFromMiddle(node1);
        linkedlist.display();
        node2.setNext(node3);
        node3.setNext(node4);
        assertEquals(node2.getNext().getNext(), resultNode.getNext().getNext());
    }

    @Test
    void givenNumber_RemoveFromLastPosition_ShouldReturnNode() {
        linkedlist.create(node1);
        linkedlist.create(node2);
        linkedlist.create(node3);
        linkedlist.create(node4);
        linkedlist.display();
        INode<Integer> resultNode = linkedlist.removeFromMiddle(node4);
        linkedlist.display();
        node1.setNext(node2);
        node2.setNext(node3);
        assertEquals(node1.getNext().getNext(), resultNode.getNext().getNext());
    }

    @Test
    void givenNumber_RemoveAbsetNode_ShouldReturnNull() {
        linkedlist.create(node1);
        linkedlist.create(node2);
        linkedlist.create(node3);
        linkedlist.create(node4);
        INode<Integer> resultNode = linkedlist.removeFromMiddle(node5);
        linkedlist.display();
        node1.setNext(node2);
        node2.setNext(node3);
        assertEquals(null, resultNode);
    }

    @Test
    void givenNumbers_WhenCallSortMethod_ShouldReturnSortedData() {
        linkedlist.create(node1);
        linkedlist.create(node2);
        linkedlist.create(node4);
        linkedlist.create(node3);
        INode<Integer> resultNode = linkedlist.sort(node5);
        linkedlist.display();
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        assertEquals(node1.getNext().getNext().getNext().getNext(), resultNode.getNext().getNext().getNext().getNext());
    }
}
