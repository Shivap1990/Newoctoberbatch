package arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		int [][]array = {{8,5,7},{9,6,4},{3,2,6}};
		
		System.out.println(array.length);
		System.out.println(array[0].length);
		
		for(int i =0; i<3;i++) 
		{
			for (int j =0;j<3;j++) 
			{
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}

}
