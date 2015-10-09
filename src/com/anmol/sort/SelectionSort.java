package com.anmol.sort;

public class SelectionSort {
	public static void sort(int array[]) {
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[j] < array[i]) {  //reverse symbol to sort in reverse direction
					int temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
	}
}
