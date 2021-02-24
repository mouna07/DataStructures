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
        myLinkedList.printMyNodes();
        boolean result = (myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode)
                && myLinkedList.tail.equals(myFirstNode));
        Assert.assertEquals(true, result);
    }
}
