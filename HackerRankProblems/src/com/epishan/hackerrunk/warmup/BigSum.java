package com.epishan.hackerrunk.warmup;

class BigSum {
	
	int[] arr;
	
	BigSum (int[] arr ) {
		this.arr = arr;
	}
	
	long getSum() {
		
		long sum = 0L;
		
		for (int i=0; i<this.arr.length; i++) {
			sum = sum + arr[i];
		}
		
		return sum;
	}
}
