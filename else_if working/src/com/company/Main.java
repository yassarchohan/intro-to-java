package com.company;

import com.sun.java_cup.internal.runtime.Scanner;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.Console;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try
        {
            System.out.println("hello world");
            System.out.println("please enter any variable");
            //int number = 10;
            int userinput = 81;
            if (userinput >= 80)
            {
                System.out.println("your are successed in the Git test");
                System.out.println("you will get treat from sir for scoring above 80 marks");

            }
            else if (userinput >=70)
            {
                System.out.println("your are successed in the Git test");
            }
            else if (userinput >=60)
            {
                System.out.println("your are just passed in the Git test");
            }
            else
            {
                System.out.println("sorry sir u have failed in git exam");
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
    }
}
