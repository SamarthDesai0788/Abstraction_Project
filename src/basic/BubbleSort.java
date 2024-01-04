package basic;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[]= {12,34,10,5,7};
		int temp=0;
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[i]>arr[j+1]) {
					 temp=arr[i];
					arr[i]=arr[j+1];
					arr[j+1]=temp;
	}
}
}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}