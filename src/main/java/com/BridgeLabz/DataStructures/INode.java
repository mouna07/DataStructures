package com.BridgeLabz.DataStructures;

public interface INode<T> {
    void setData(T data);

    T getData();

    void setNext(INode next);

    INode getNext();

}