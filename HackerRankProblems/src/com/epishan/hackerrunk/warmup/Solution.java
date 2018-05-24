package com.epishan.hackerrunk.warmup;

import java.util.*;
import java.io.*;
import java.text.ParseException;
import com.epishan.hackerrunk.ctci.*;

public class Solution {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int d = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		
		
		RotatableArray r = new RotatableArray(n, d, arr);
		//r.print();
		for (int i=0; i < d; i++ ) {
			r.rotateLeft();
		}
		
		int[] result = r.getArray();

		
		//String inputStr = readString();
		
		//MiniMaxSum runner = new MiniMaxSum(arr);
		//runner.printMiniMax();
		
		//BirthdayCakeCandles runner = new BirthdayCakeCandles(arr);
		//System.out.println(runner.blowCandles());
		
//		TimeConversion runner;
//		try {
//			runner = new TimeConversion(inputStr);
//			runner.printTime();
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
	}
	
	static int[] readArray() {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		
		return arr; 
		
	}
	
	static String readString() {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		sc.close();
		
		return s; 
		
	}

}
