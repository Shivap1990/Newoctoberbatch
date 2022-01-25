package arrays;

public class ObjectArray {

	public static void main(String[] args) {
		
		Object array[]= new Object[5];// homogeneous, heterogenous elements
		
		array[0]= 1;
		array[1] = "Shri";
		array[2] = true;
		array[3] = 'z';
		array[4] = 15000.0023;
		System.out.println(array.length);
		for(int i=0;i<5;i++) 
		{
			
			System.out.println(array[i]);
		}
	}

}
