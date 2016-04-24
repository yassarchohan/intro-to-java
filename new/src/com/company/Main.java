package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try
        {
            System.out.println("hello world");
            System.out.println("please enter any variable");
            char j = (char) System.in.read();
            char chk = 'a';
            if(j == chk)
            {
                System.out.println("you win the game");
            }
            else
            {
                System.out.println("sorry u lose the game");
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
    }
}
