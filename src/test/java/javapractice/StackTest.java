package javapractice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StackTest {

    Stack<Integer> stack = null;
    INode<Integer> node1;
    INode<Integer> node2;
    INode<Integer> node3;
    INode<Integer> node4;
    INode<Integer> node5;

    @BeforeEach
    void setUp() {
        stack = new Stack<>();
        node1 = new Node<>(56);
        node2 = new Node<>(30);
        node3 = new Node<>(70);
        node4 = new Node<>(80);
        node5 = new Node<>(90);
    }

    @Test
    void givenNumber_WhenCreateStack_ShouldReturnNode() {
        INode resultNode = stack.push(node1);
        assertEquals(node1, resultNode);
    }

}
