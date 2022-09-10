
public class arraypractice {
	static void min(int arr[]) {
		int min=arr[0];
		for (int i=1;i<arr.length;i++) {
			if(min>arr[i]){
				min=arr[i];
			}
		}System.out.println("minium is "+min);} 
         static void max (int arr[]) {
        	 int max=arr[0];
        	 for (int i =1;i<arr.length;i++) {
        		 if(max<arr[i]) {
        			 max=arr[i];
        		 }
        	 }
        	 System.out.println("maximum is "+max);
         }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {8,78,9,76,1,};
arraypractice.min(a);
arraypractice.max(a);
	}
}
