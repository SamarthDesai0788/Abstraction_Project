package basic;

public class Arraydimention {

	public static void main(String[] args) {
		int arr[][]=new int[3][3];
		arr[0][0]=1;
		arr[0][1]=2;
		arr[0][2]=3;
		arr[1][0]=4;
		arr[1][1]=5;
		arr[1][2]=6;
		arr[2][0]=7;
		arr[2][1]=8;
		arr[2][2]=9;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++)
		{
				System.out.print(arr[i][j]+" ");
				}
			System.out.println();
		
int arr1[][]= {{11,12,13},{14,15,16},{17,18,19}};
	for(int k=0;k<arr1.length;k++) {
		for(int j=0;j<arr1.length;j++)
	{
			System.out.print(arr1[k][j]+" ");
			}
		System.out.println();
	}
	}
	}
}
