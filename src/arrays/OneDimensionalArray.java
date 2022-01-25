package arrays;

public class OneDimensionalArray {

	public static void main(String[] args) {
		
		int a[] = new int [4];
		a[0] = 4;
		a[1] = 8;
		a[2] = 12;
		a[3] = 16;
		
		System.out.println("Element at Index 0: " +a[0]);
		System.out.println("Element at Index 1: " +a[1]);
		System.out.println("Element at Index 2: " +a[2]);
		System.out.println("Element at Index 3: " +a[3]);
		System.out.println(a.length);
		
		for(int i =0; i<a.length;i++) 
		{
			System.out.println(a[i]);
		}

	}

}
