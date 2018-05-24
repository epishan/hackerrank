/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.day19;

import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
   int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int sum = 1; // will always include devisor 1;
        int i = 2; // current devisoe
        while (i <= Math.sqrt(n)) {
            if (n % i == 0) {
                //System.out.println(i);
                sum = sum + i;
                int j = n / i; 
                if (i != j) {
                    //System.out.println(j);
                    sum = sum + j;
                }
            }
            i++;
        }
        sum = sum + n; // itself
        return sum;
    }
}

public class HackerrankDay19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculator(); 
        int sum = myCalculator.divisorSum(n);
        //System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        //System.out.println(sum);
    }
    
}
