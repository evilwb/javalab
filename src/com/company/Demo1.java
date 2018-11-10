package com.company;

import java.io.*;
import java.util.Scanner;

public class Demo1
{
    private Scanner input;
    private int age;
    private float wage;
    private String name;

    private Demo1()
    {
        input = new Scanner(System.in);
    }

    private void read()
    {
        System.out.print("Enter a name: ");
        this.name = this.input.nextLine();
        System.out.print("Enter an age: ");
        this.age = this.input.nextInt();
        this.input.nextLine();
        System.out.print("Enter a wage: ");
        this.wage = this.input.nextFloat();
        this.input.nextLine();
    }

    private void display()
    {
        System.out.println("Name: " + name + "\nAge: " + age + "\nWage: $" + wage + "/hour");
    }

    public static void main(String[] args)
    {
        Demo1 obj = new Demo1();
        obj.read();
        obj.display();
    }
}
