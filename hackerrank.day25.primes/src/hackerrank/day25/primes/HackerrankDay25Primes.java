package hackerrank.day25.primes;

import java.io.*;
import java.util.*;
/**
 *
 * @author epish
 */
public class HackerrankDay25Primes {

   static void checkPrime(int n) {
        boolean isPrime = true;
        
        if (n == 1) {
            isPrime = false;
        } else if (n > 2) {    
            for (int i=2; i<Math.sqrt(n)+1; i++) {
                if (n%i == 0) {
                    isPrime = false;
                    //System.out.println("devisor: " + i);
                    break;
                }  
            } 
        }
        
        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = scan.nextInt();
        }
        
        for (int a: arr) {
            checkPrime(a);
        }
        
    }
    
}
