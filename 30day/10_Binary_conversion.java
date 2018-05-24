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

        scanner.close();

        // convert to binary
        List<Integer> binaryArray = new ArrayList<Integer>();

        while (n>0) {
            int rem = n%2;
            n = n/2;
            binaryArray.add(rem);
        }
        /***
        for(int i=binaryArray.size()-1; i>=0; i-- ) {
            System.out.print(binaryArray.get(i));
        }
        ***/
        int max = 0;
        int curMax = 0;
        for (Integer i : binaryArray) {
            if (i==1) {
                curMax++;
            } else {
                curMax=0;
            }
            if (curMax>max) {
                max = curMax;
            }
        }
        System.out.print(max);
    }
}
