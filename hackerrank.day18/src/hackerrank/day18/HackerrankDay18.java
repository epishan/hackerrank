/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.day18;

import java.util.*;


/**
 *
 * @author epish
 */
public class HackerrankDay18 {
    
    Stack<Character> s = new Stack<Character>();
    Queue<Character> q = new LinkedList<Character>();
    
    public void pushCharacter(char ch) {
        this.s.push(ch);
    }
    
    public void enqueueCharacter(char ch) {
        this.q.add(ch);
    }
    
    public char popCharacter() {
        return (char) this.s.pop();
    }
    
    public char dequeueCharacter() {
        return (char) this.q.remove();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        HackerrankDay18 p = new HackerrankDay18();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
    
}
