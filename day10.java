import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int num = n;
        String binary = "";
        int count = 0;
        while(num!=0){
            int rem = num % 2;
            binary = binary + rem;
            num = num / 2;
        }
        long bin = Long.parseLong(binary);
        
        String s ="";
        int ones = 0;
        while(bin!=0){
            long last = bin % 10;
            if(last == 1){
                s = s + last;
                count = s.length();
                if(count>ones){
                    ones = count;
                }
            }else{
                s = "";
            }
            bin = bin /10;
            }
            
        
        System.out.println(ones);


        scanner.close();
    }
}
