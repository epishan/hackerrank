package com.epishan.hackerrunk.warmup;

import java.util.Arrays;

public class MiniMaxSum {
	
	int[] values;
	
	MiniMaxSum(int[] arr) {
		this.values = arr;
	}
	
	public void printMiniMax() {
		
		Arrays.sort(this.values);
		long min = 0;
		long max = 0;
		
		int i=0;
		while(i<this.values.length) {
			//skipping first for min
			if (i>0) {
				max = max + this.values[i];
				
			}
			//min skipping last
			if (i<this.values.length-1) {
				min = min + this.values[i];
			}
				
			i++;
		}
		
		System.out.println(min + " " + max);
		
	}
}
