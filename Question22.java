package org.example.Day5;

import java.util.*;
import java.math.BigInteger;

public class Question22 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input=new Scanner(System.in);
        BigInteger A=new BigInteger(input.next());
        BigInteger B=new BigInteger(input.next());
        System.out.println(A.add(B));
        System.out.println(A.multiply(B));


    }
}