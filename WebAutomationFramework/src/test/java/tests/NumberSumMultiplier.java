package tests;

import java.util.Scanner;

public class NumberSumMultiplier {

	public static void main(String[] args) {		
		
		int[] arr = {1,2,4,1,1,2,3};
		System.out.println(SumMultiplier(arr));

	}
		
	static boolean SumMultiplier(int arr[]) {		
		
		int largest = arr[0];
		int secLargest = arr[0];
		
		int sum = 0;
		int n =arr.length;
		for(int i =0;i<n;i++) {
			
			if(arr[i]>largest)
			{
			largest=arr[i];
			}
			if(secLargest >arr[i]) 
			{
				secLargest=arr[i];
			}			
			sum = sum + arr[i];
		}
		
		if((sum * 2)>largest *secLargest)
			return false;
		else
			return true;	
		
	}

}
