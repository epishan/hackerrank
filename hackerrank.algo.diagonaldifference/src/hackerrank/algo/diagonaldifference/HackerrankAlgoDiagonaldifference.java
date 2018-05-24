package hackerrank.algo.diagonaldifference;
import java.io.*;
import java.util.*;

public class HackerrankAlgoDiagonaldifference {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int[][] matrix = new int[N][N];
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        //System.out.println(Arrays.deepToString(matrix));
        sc.close();
        
        int sum1 = 0;
        int sum2 = 0;
        for (int i=0; i<N; i++) {
            sum1 = sum1 + matrix[i][i];
            sum2 = sum2 + matrix[i][N-1-i];
        }
        
        System.out.println(Math.abs(sum1-sum2));
    }
    
}
