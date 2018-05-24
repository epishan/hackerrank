package hackerrank.day11;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author epish
 */
public class HackerrankDay11 {

    public static final Scanner scan = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    
    private static void printArray(int[][] arr) {
        for (int[] x: arr) {
            for (int y: x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int[][] arr = new int[6][6]; 
        
        for (int i=0; i<6; i++) {
            String[] arrRowItems = scan.nextLine().split(" ");
            scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j=0; j<6; j++) {
                arr[i][j] = Integer.parseInt(arrRowItems[j]);
            }
        }
        
        int maxSum = Integer.MIN_VALUE;
        
        for (int n=0; n<4; n++) {
            for (int m=0; m<4; m++) {
                     
                int counter = 0; // linear coordinates of hourglass
                int tmpSum = 0;
                for (int i=n; i<n+3; i++) {
                    for (int j=m; j<m+3; j++) {
                        if (counter != 3 && counter !=5 ) {
                           //System.out.print(Integer.toString(arr[i][j]) + " "); 
                           tmpSum = tmpSum + arr[i][j];
                        } else {
                           //System.out.print("  ");
                        }
                        counter++;
                    }
                    //System.out.println();
                }
                if (tmpSum>maxSum) {
                    maxSum=tmpSum;
                }
                //System.out.println();
            }
        }
        
        System.out.println(Integer.toString(maxSum));

        
                
        //printArray(arr);
        scan.close();
    }
    
}
