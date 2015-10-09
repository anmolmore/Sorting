package com.anmol.sort.test;

import com.anmol.sort.BubbleSort;
import com.anmol.sort.SelectionSort;

public class SortTest {
	public static void main(String[] args) {
		
		int array[] = {34,53,54,232,23};
		BubbleSort.sort(array);
		for(int i=0;i<array.length;i++)
			System.out.println(array[i]);
		
		System.out.println();
		
		int array1[] = {34,53,54,232,23};
		SelectionSort.sort(array1);
		for(int i=0;i<array1.length;i++)
			System.out.println(array1[i]);
		
	}
}
