package hackerrank.algo.pkg4.plusminus;
import java.io.*;
import java.util.*;

public class HackerrankAlgo4Plusminus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int posCount = 0;
        int negCount = 0;
        int zeroCount = 0;
        
        for (int el: arr) {
            if (el > 0) {
                posCount++;
            } else if (el < 0) {
                negCount++;
            } else {
                zeroCount++;
            }
        }
        
        double pf = posCount / (double) arr.length;
        double nf = negCount / (double) arr.length;
        double zf = zeroCount / (double) arr.length;
        
        System.out.println(pf);
        System.out.println(nf);
        System.out.println(zf);
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int[] arr = new int[N];
        for (int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }
        
        sc.close();
        
        plusMinus(arr);
    }
    
}
