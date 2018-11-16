package com.company;

import java.util.Scanner;

public class Linked_List
{
    private Node head;
    private Node tail;

    public Linked_List()
    {
        this.head = null;
    }

    public void Build_List()
    {
        this.head = Build_List(head);
    }

    public void Reverse_List()
    {
        Reverse_List(this.head);
    }

    public int count()
    {
        return count(head);
    }

    protected Node Build_List(Node head)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("add new user? ");
        String answer = input.next();

        if(answer.equalsIgnoreCase("y"))
        {
            Node new_node = new Node();
            new_node.input();
            new_node.setnext(Build_List(head));
            return new_node;
        }
        else
        {
            this.tail = head;
            return null;
        }
    }

    protected Node Reverse_List(Node head)
    {
        if(head == null)
        {
            return null;
        }
        if(head.getnext() == null)
        {
            this.head = head;
            return head;
        }
        Node temp = Reverse_List(head.getnext());
        temp.setnext(head);
        head.setnext(null);
        return head;
    }

    protected int count(Node head)
    {
        if(head == tail)
        {
            return 1;
        }
        if(head.equals(tail))
        {
            return (1 + count(head.getnext()));
        }
        else
        {
            return count(head.getnext());
        }
    }

    private void Add_List(Node new_item)
    {
        if(head != null)
        {
            Node curr = this.head;
            while (curr.getnext() != null)
            {
                curr = curr.getnext();
            }
            curr.setnext(new_item);
        }
        else
        {
            head = new_item;
        }
    }

    public void Display_List()
    {
        Node curr = this.head;
        while(curr != null)
        {
            curr.display();
            curr = curr.getnext();
            System.out.println();
        }
    }

}
