package com.company;

import java.util.Scanner;

public class Person
{
    protected String name;
    protected int age;
    protected float wage;
    protected Scanner input;


    public Person()
    {
        this.name = null;
        this.age = 0;
        this.wage = 0;
        this.input = new Scanner(System.in);
    }

    public void input()
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

    public void display()
    {
        System.out.println("Name: " + name + "\nAge: " + age + "\nWage: $" + wage + "/hour");
    }

    public boolean equals(String name)
    {
        return this.name.equalsIgnoreCase(name);
    }

}
