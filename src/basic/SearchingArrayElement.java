package basic;

public class SearchingArrayElement {

	public static void main(String[] args) {
		int a[]= {34,56,78,99,65,36,25};
		int key=25;
		for(int i=0;i<a.length;i++) {
			if(a[i]==key) {
				System.out.println("element:"+a[i]+"found at index: "+i);
			}
		}
	}

}
