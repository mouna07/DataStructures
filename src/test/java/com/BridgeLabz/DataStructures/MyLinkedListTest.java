package com.BridgeLabz.DataStructures;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {
    /* Created Simple Linked List and Added to the First Position */
    @Test
    public void GivenThreeNumbersWhenAddedToLinkedListShouldAddedtoTop() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        myLinkedList.addFirst(myFirstNode);
        myLinkedList.addFirst(mySecondNode);
        myLinkedList.addFirst(myThirdNode);
        boolean result = (myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode)
                && myLinkedList.tail.equals(myFirstNode));
        Assert.assertEquals(true, result);
    }

    /* Created Simple Linked List and Added to the Last Position */
    @Test
    public void GivenThreeNumbersWhenAddedToLinkedListShouldAddedtoBottom() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        myLinkedList.addLast(myFirstNode);
        myLinkedList.addLast(mySecondNode);
        myLinkedList.addLast(myThirdNode);
        boolean result = (myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode)
                && myLinkedList.tail.equals(myThirdNode));
        Assert.assertEquals(true, result);
    }

    /* Insert a Node in Between the Nodes */
    @Test
    public void GivenANodeInsertedInBetweenResultingNodesReturnTrue() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        myLinkedList.addLast(myFirstNode);
        myLinkedList.addLast(myThirdNode);
        myLinkedList.insertNode(myFirstNode, mySecondNode);
        boolean result = (myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode)
                && myLinkedList.tail.equals(myThirdNode));
        Assert.assertEquals(true, result);
    }

    /* Remove First Node */
    @Test
    public void PopNodeFromFrontShouldReturnTrue() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        myLinkedList.addFirst(myFirstNode);
        myLinkedList.addFirst(mySecondNode);
        myLinkedList.addFirst(myThirdNode);
        INode<Integer> deletedNode = myLinkedList.popFirst();
        Assert.assertEquals(deletedNode, myThirdNode);
    }

    /* Remove Last Node */
    @Test
    public void PopNodeFromLastShouldReturnTrue() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        myLinkedList.addFirst(myFirstNode);
        myLinkedList.addFirst(mySecondNode);
        myLinkedList.addFirst(myThirdNode);
        INode<Integer> deletedNode = myLinkedList.popLast();
        Assert.assertEquals(deletedNode, myFirstNode);
    }

    /* Search Node with given data */
    @Test
    public void SearchNodeForGivenDataIfFoundShouldReturnTrue() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        myLinkedList.addFirst(myFirstNode);
        myLinkedList.addFirst(mySecondNode);
        myLinkedList.addFirst(myThirdNode);
        INode searchNode = myLinkedList.searchNode(30);
        Assert.assertEquals(searchNode, mySecondNode);
    }

    /* Search dataNode and Insert the Node */
    @Test
    public void SearchDataNodeForGivenDataIfFoundShouldInsertGivenNodeAndReturnTrue() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyNode<Integer> myFourthNode = new MyNode<>(40);
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        myLinkedList.addFirst(myFirstNode);
        myLinkedList.addFirst(mySecondNode);
        myLinkedList.addFirst(myThirdNode);
        INode searchNode = myLinkedList.searchNode(30);
        myLinkedList.insertNode(searchNode, myFourthNode);
        boolean result = (myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(searchNode)
                && myLinkedList.head.getNext().getNext().equals(myFourthNode) && myLinkedList.tail.equals(myFirstNode));
        Assert.assertEquals(true, result);
    }

    /* Search dataNode and Delete the Node return size */
    @Test
    public void DeleteNodeFromLinkedlistIfDeletedShouldReturnSizeAndReturnTrue() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(40);
        MyNode<Integer> myThirdNode = new MyNode<>(30);
        MyNode<Integer> myFourthNode = new MyNode<>(56);
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        myLinkedList.addFirst(myFirstNode);
        myLinkedList.addFirst(mySecondNode);
        myLinkedList.addFirst(myThirdNode);
        myLinkedList.addFirst(myFourthNode);
        myLinkedList.popNode(40);
        int size = myLinkedList.getSize();
        Assert.assertEquals(3, size);
    }

    /* Element Added in the sorted Linked List */
    @Test
    public void IfLInkedListIsInAscendingOrderReturnTrue() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyNode<Integer> myFourthNode = new MyNode<>(40);
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        myLinkedList.sortedLinkedList(myFirstNode);
        myLinkedList.sortedLinkedList(mySecondNode);
        myLinkedList.sortedLinkedList(myThirdNode);
        myLinkedList.sortedLinkedList(myFourthNode);
        boolean result = myLinkedList.head.equals(mySecondNode) && myLinkedList.head.getNext().equals(myFourthNode)
                && myLinkedList.head.getNext().getNext().equals(myFirstNode) && myLinkedList.tail.equals(myThirdNode);
        Assert.assertEquals(true, result);
    }

    @Test
    public void IfStackIsCreatedShouldReturnTrue() {
        Stack<Integer> stack = new Stack<>();
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        stack.push(myThirdNode);
        stack.push(mySecondNode);
        stack.push(myFirstNode);
        INode peek = stack.peek();
        Assert.assertEquals(peek, myFirstNode);
    }

    @Test
    public void IfStackIsPopOrPeekShouldReturnTrue() {
        Stack<Integer> stack = new Stack<>();
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        stack.push(myThirdNode);
        stack.push(mySecondNode);
        stack.push(myFirstNode);
        INode popStack = stack.pop();
        INode peek = stack.peek();
        Assert.assertEquals(popStack, myFirstNode);
    }

    @Test
    public void IfQueueIsCreatedShouldReturnTrue() {
        Queue<Integer> queue = new Queue<>();
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        queue.enqueue(myFirstNode);
        queue.enqueue(mySecondNode);
        queue.enqueue(myThirdNode);
        INode peek = queue.peek();
        Assert.assertEquals(peek, myFirstNode);
    }
}