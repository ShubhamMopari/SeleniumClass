import java.util.Arrays;
public class arraymethod {
	public static void main(String[] args) {
		int[] array= {33,3,4,5};
		
		for(int i:array) {
			System.out.println(i);
		}
		
			int clone[]= array.clone();  // clone mehod make duplicate array from existing array
			for (int i : clone) {
				System.out.println(i);  
			
		}
			System.out.println(Arrays.equals(clone, array)); // the method gives the result of two values are true or false.
		int[] copy= Arrays.copyOf(array,10); //the method gives the started point array to end point array by the index of array
		
		for(int i:array) {
			System.out.println(i);
		}
		System.out.println();
		int copy1[]=Arrays.copyOf(array,0);//the method gives size from start point end point set by programmer
		for(int i:array) {
			System.out.println(i);
		}
		System.out.println();
		 Arrays.sort(array);
		 for (int i:array) {
			 System.out.println(i);
		 }
}
}