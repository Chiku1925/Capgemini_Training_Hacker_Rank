package org.example.Day2;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Question5 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input=new Scanner(System.in);
        for(int i=1;input.hasNext();i++){
            String str=input.nextLine();
            System.out.println(i+ " "+str);
        }
    }
}
