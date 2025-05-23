package org.example.Day5;

import java.io.*;
import java.math.*;

import static java.util.stream.Collectors.joining;


public class Question21 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        BigInteger b= new BigInteger(n);
        if(b.isProbablePrime(100)){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }

        bufferedReader.close();
    }
}
