package hackerrank.algo.pkg4.plusminus;
import java.io.*;
import java.util.*;

public class HackerrankAlgo5Staircase {

    // Complete the plusMinus function below.
    
    static void printStair(int lvl, int base) {   
        StringBuffer outputBuffer = new StringBuffer(base);
        for (int i = 0; i < base-lvl; i++){
           outputBuffer.append(" ");
        }
        for (int i = 0; i < lvl; i++){
           outputBuffer.append("#");
        }
        System.out.println(outputBuffer.toString());
    }
    
    static void staircase(int n) {
        
        for (int i=1; i<n+1; i++) {      
            printStair(i, n);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        sc.close();
        
        staircase(N);
    }
    
}
