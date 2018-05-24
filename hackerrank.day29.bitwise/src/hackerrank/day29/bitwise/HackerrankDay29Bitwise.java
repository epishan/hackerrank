package hackerrank.day29.bitwise;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class BitwiseList {

    private int[] s;
    private int n, k;
    
    BitwiseList (int N, int K) {
        this.s = new int[N];
        this.n = N;
        this.k = K;
        for (int i=0; i<N; i++) {
            this.s[i]=i+1;
        }
    }
    
    public int getMaxBitSum() {
        int sum = 0;
        int tmp = 0;
        for (int i=0; i<this.n-1; i++ ) {
            for (int j=i+1; j<this.n; j++ ) {
                tmp = this.s[i] & this.s[j];
                //System.out.println("A = " + this.s[i] + " B = " + this.s[j] + "; A&B =" + tmp );
                if ( tmp > sum && tmp < this.k ) {
                    sum = tmp;
                }
            }
        }
        
        return sum;
    }
    
}

public class HackerrankDay29Bitwise {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        List<BitwiseList> myList = new ArrayList<BitwiseList>();
        
        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);
            myList.add(new BitwiseList(n,k));
        }

        scanner.close();
        
        for (BitwiseList bwObj: myList) {
            System.out.println(bwObj.getMaxBitSum());
        }
    }
}
