package basic;

import java.util.Arrays;

public class Assending {

	public static void main(String[] args) {
		int arr[]= {12,34,10,5,7};
		int temp=0;
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
				System.out.println("after sorting");
				for(int i=0;i<arr.length;i++) {
					System.out.println(arr[i]);
					
				
				}
			}
		}

	
