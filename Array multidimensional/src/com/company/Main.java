package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int a[][] = new int[2][3];
        a[0][0] = 4;
        a[0][1] = 2;
        a[0][2] = 6;
        a[1][0] = 10;
        a[1][1] = 2;
        a[1][2] = 4;

        System.out.println(a[0][0]);
       // System.out.print("  "+a[1][1]);

       for (int i =0 ; i<a.length;i++) {
           System.out.println(" ");
           for (int j =0; j< a[i].length;j++ )
           System.out.print(a[i][j]+" ");

       }
        }
    }

