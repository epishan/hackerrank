import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        scan.nextLine();
        for (int j=0; j<T; j++) {
            String S = scan.nextLine();
            split(S);
        }
    }

    public static void split(String S) {
        char[] charArray = S.toCharArray();
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for (int i=0; i<S.length(); i++ ) {
            if ((i & 1) == 0) {
                s1.append(charArray[i]);
            } else {
                s2.append(charArray[i]);
            }
        }
        System.out.println(s1 + " " + s2);
    }
}
