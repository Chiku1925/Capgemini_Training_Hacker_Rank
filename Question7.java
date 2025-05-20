package org.example.Day2;

import java.io.*;
import java.util.*;

public class Question7 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        String s=Integer.toString(n);
        if(n==Integer.parseInt(s)){
            System.out.println("Good job");}
        else{
            System.out.println("Wrong answer");
        }
    }
}

