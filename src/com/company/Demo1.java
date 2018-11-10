package com.company;

import java.io.*;
import java.util.Scanner;

public class Demo1 {
    private Scanner input=null;

    private Demo1(){
        input = new Scanner(System.in);
    }

    public static void main(String[] args)
    {
        Demo1 obj = new Demo1();
        System.out.println(obj.input.nextLine());
    }
}
