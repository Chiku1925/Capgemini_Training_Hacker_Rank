package org.example.Day4;

import java.util.*;

public class Question18 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s=s.trim();
        if (s.isEmpty()) {
            System.out.println(0);
        }

        // Write your code here.
        else{
            String regex="[ !,?._'@]+";
            String[] splitArr=s.split(regex);
            System.out.println(splitArr.length);

            for(int i=0;i<splitArr.length;i++){
                System.out.println(splitArr[i]);
            }
        }
        scan.close();
    }
}

