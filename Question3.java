package org.example.Day2;
import java.util.*;
import java.io.*;
import java.math.*;
public class Question3 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum=a;
            for(int j=0;j<n;j++){
                sum+=((Math.pow(2,j))*b);
                System.out.print(sum +" ");
            }
            System.out.println();


        }
        in.close();
    }
}

