package collection;
import java.util.ArrayList;
import java.util.Scanner;
/*1)the collection java is a framework provides an architecture to store and manipulate 
 *the group of objects.
 *2) java collection can achieve all the operations that you perform on data such as 
 *searching,sorting,insertion,manipulation and deletion.
 *3) in collection each element of object type ,every element is stored as an object form.
 *4) The java.util package contains all the classes and interfaces 
 * 
 * 
 */

public class arraylist {
	public static void main(String[] args) {
		ArrayList list =new ArrayList();
		list.add(null);
		list.add("riyansh");
		list.add(true);
		list.add(new arraylist());
		System.out.println(list.toString());
		System.out.println(list.hashCode());
		Scanner sc=new Scanner(System.in);
	int be = sc.nextInt();
		
		System.out.println(list);
		list.add(1,"database");
		list.remove(1);
		System.out.println(list.size());
		for (int i =0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		for (Object fruit:list) {
			System.out.println(fruit);
			
			
		}
	}

}
