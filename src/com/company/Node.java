package com.company;

public class Node extends Person
{
    Node next;

    public Node()
    {
        this.next = null;
    }

    public void setnext(Node next)
    {
        this.next = next;
    }

    public Node getnext()
    {
        return this.next;
    }
}
