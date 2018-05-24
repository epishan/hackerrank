package com.epishan.hackerrunk.warmup;

class BirthdayCakeCandles {
	int[] height;
	
	BirthdayCakeCandles(int[] height) {
		this.height = height;
	}
	
	public int blowCandles() {
		int max = 0;
		int count = 0;
		
		for (int i=0; i<this.height.length; i++) {
			if (this.height[i]>max) {
				max = this.height[i];
				count = 1;
			} else if (this.height[i]==max) {
				count++;
			}
		}
		
		return count;
	}
}
