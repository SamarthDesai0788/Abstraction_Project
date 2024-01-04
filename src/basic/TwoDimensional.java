package basic;

public class TwoDimensional {

	public static void main(String[] args) {
		int arr1[][]= {{1,2,3},{2,3,4},{4,5,6}};
		int arr2[][]= {{1,5,8},{2,4,6},{3,5,7}};
		int arr3[][]=new int[3][3];
		System.out.println("addition of two arrays");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
			arr3[i][j]=arr1[i][j]+arr2[i][j];
			
			System.out.print(arr3[i][j]+" ");
			}
			System.out.println( );
		}
		System.out.println("substraction of two arrays");
		int arr4[][]=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				
				arr4[i][j]=arr1[i][j]-arr2[i][j];
				System.out.print(arr4[i][j]+" ");
			}
			System.out.println();
		}
	}
}
			