package com.company;

import java.util.Scanner;

public class Linked_List
{
    private Node head;

    public Linked_List()
    {
        this.head = null;
    }

    public void Build_List()
    {
        Scanner input = new Scanner(System.in);
        int max = 0;

        System.out.print("# of students in the list: ");
        max = input.nextInt();

        for(int i = 0; i < max; i++)
        {
            System.out.println("Student " + i + " info");
            Node new_item = new Node();
            new_item.input();
            this.Add_List(new_item);
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
