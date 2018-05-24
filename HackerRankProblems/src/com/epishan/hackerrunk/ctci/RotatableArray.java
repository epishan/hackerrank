package com.epishan.hackerrunk.ctci;

import java.util.Arrays;

public class RotatableArray {
	private int[] items;
	private int n;
	
	public RotatableArray(int n, int d, int[] arr ) {
		items = arr;
		this.n = n;
	}
	
	public void print() {
		for (int it : items) {
			System.out.print(it + " ");
		}
		System.out.println();
	}
	
	public void rotateLeft() {
		int[] copy = new int[n];
		System.arraycopy(items, 1, copy, 0, items.length-1);
		//System.out.println(Arrays.toString(copy));
		//System.out.println(Arrays.toString(items));
		copy[n-1] = items[0];
		items = copy;
	}
	
    public void rotateLeft(int d) {
		int[] copy = new int[n];
		System.arraycopy(items, d, copy, 0, n-d);
        System.arraycopy(items, 0, copy, n-d, d);
		//System.out.println(Arrays.toString(copy));
		//System.out.println(Arrays.toString(items));
		//copy[n-1] = items[0];
		items = copy;
	}
	
	public int[] getArray() {
		return items;
	}
}
