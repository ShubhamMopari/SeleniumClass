import java.util.Scanner;
import java.util.regex.Pattern;
public class d {

	public static void main(String[] args) {
	StringBuffer s=	new StringBuffer("salu");
	System.out.println(s.append(" kalu"));
	System.out.println(s);
	System.out.println(s.delete(5, 9));
	s.replace(0, 1, "a");
	System.out.println(s);

	String s1="";
	System.out.println("salu"+s1.contains("sam"));
	Scanner sc=new Scanner(System.in);
	s1=sc.next();
	System.out.println(s1);
	 
	s.reverse();
	System.out.println(s);
	

	}

}
