package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
       // int a[]= new int[];
        //boolean prime = false;
       int  a[]={5,6,3,18,21,13,7};
        for (int i =0;i<a.length;i++) {
            if (a[i] % 2 != 0) {
                System.out.println("it is  a prime no:" + a[i]);
            }
            else {
                System.out.println("it not is a prime no." + a[i]);
            }

        }
    }
}
