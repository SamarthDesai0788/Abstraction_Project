package basic;

public class Twoarray {

	public static void main(String[] args) {
		        int[] array1 = { 1, 3, 5, 7, 9 };
		        int[] array2 = { 2, 4, 6, 8, 10 };
		        int[] result = new int[array1.length];
		        for (int i = 0; i < array1.length; i++) {
		            result[i] = array1[i] + array2[i];
		        }
		        System.out.println("Result array after addition:");
		        for (int i = 0; i < result.length; i++) {
		          System.out.print(result[i] + " ");
		        }
		    }
		}

