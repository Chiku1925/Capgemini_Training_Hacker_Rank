package org.example.Day4;

import java.util.*;

public class Question16 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String rev= new StringBuilder(A).reverse().toString();
        if(A.compareTo(rev)==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}



