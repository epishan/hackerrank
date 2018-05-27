import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    private int[] getFreq(String s) {
        int[] freq = new int[26];
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            int chi = Character.getNumericValue(ch);
            //System.out.println("ch: " + ch + " ch_i: " + chi);
            // shifting to 10->0; as we work only with a-z
            freq[chi-10]++;
        }
        return freq;
    }
    
    private void printFreq(int[] freq) {
        char ch;
        for (int i=0; i<freq.length; i++) {
            if (freq[i]!=0) {
                ch = (char) (i+97);
                System.out.print(ch + "=" + freq[i] + " ");
            }
        }
        System.out.println("");
    }
    
    private void Anagram(String a, String b) {
        
        int[] freqA, freqB;
        
        freqA = getFreq(a);
        freqB = getFreq(b);
        
        int diff=0;
        for (int i=0; i<freqA.length; i++) {
            diff = diff + Math.abs(freqA[i]-freqB[i]);
        }
        
        System.out.println(diff);

    }
    
    
    private Map putWords(String[] m) {
        
        Map dict = new HashMap();
        for (String w: m) {
            if (dict.containsKey(w)) {
                int count = (int) dict.get(w);
                dict.put(w,++count);
                //System.out.println("existing word: " + w + " count: " + count);
            } else {
                dict.put(w,1);
                //System.out.println("new word: " + w);
            }
        }
        return dict;
    }
    
    private boolean getFromDict(Map dict, String word) {
        
        if (dict.containsKey(word)) {
            int count = (int) dict.get(word);
            if (count > 1) {
                dict.put(word,--count);
                //System.out.println("found word: " + word + " left: " + count);
            } else {
                dict.remove(word);
                //System.out.println("found word: " + word + " no left");
            }
            return true;
        } else {
            //System.out.println("word  " + word + " not found");
            return false;
        }
        
    }
    
    private boolean RamsonNote(String[] m, String[] n) {
        
        Map mHash = putWords(m);
        
        for (String word : n) {
            if (!getFromDict(mHash,word)) {
                return false;
            }
        }
        return true;
    }
    
    private static boolean isOpening(Character ch) {
        if (ch == '(' || ch == '[' || ch == '{') {
            return true;
        } else {
            return false;
        }
    } 
    
    private static boolean isMatching(Character ch1, Character ch2) {
        if (ch1 == '(' && ch2 == ')') {
            return true;
        }
        if (ch1 == '{' && ch2 == '}') {
            return true;
        }
        
        if (ch1 == '[' && ch2 == ']') {
            return true;
        }
        return false;        
    }
    
    private static boolean isBalanced(String expression) {
        Stack<Character> st = new <Character>Stack();
        
        for (int i=0; i<expression.length(); i++) {
            Character ch = expression.charAt(i);
            if(isOpening(ch)) {
                st.push(ch);
            } else {
                if (st.isEmpty() || !isMatching(st.pop(), ch)) {
                    return false;
                }
            }
        } 
        
        if (st.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    
    
    public static class MyQueue<T> {
        Stack<T> stackNewestOnTop = new Stack<T>();
        Stack<T> stackOldestOnTop = new Stack<T>();

        public void enqueue(T value) { // Push onto newest stack
            stackNewestOnTop.push(value);
            Stack<T> tmpStack = new Stack<T>();
            tmpStack.push(value);
            while (!stackOldestOnTop.isEmpty()) {
                tmpStack.push(stackOldestOnTop.pop());
            }
            stackOldestOnTop = tmpStack;
        }

        public T peek() {
            if (!stackOldestOnTop.isEmpty()) {
                return stackOldestOnTop.peek();
            } else {
                return null;
            }
      
        }

        public T dequeue() {
            T el = stackOldestOnTop.pop();
            Stack<T> tmpStack = new Stack<T>();
            while (!stackNewestOnTop.isEmpty()) {
                tmpStack.push(stackNewestOnTop.pop());
            }
            return el;
        }
        
        public void print () {
            Stack<T> tmpStack = stackNewestOnTop.
            
        }
    }
    
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
                queue.print();
            } else if (operation == 2) { // dequeue
                queue.dequeue();
                queue.print();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }
        scan.close();

    }
}