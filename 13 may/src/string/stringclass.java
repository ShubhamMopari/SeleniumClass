package string;

public class stringclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="salute";
String L="";
for (int i=0;i<s.length();i++) {
	System.out.print(s.charAt(i));
}
System.out.println();
for (int i=s.length()-1;i>=0;i--) {
	System.out.print(s.charAt(i));
}
System.out.println();
String p=s;
for(int i=s.length()-1;i>=0;i--) {
	s.charAt(i);
}
if(p==s) {
	System.out.println("the string is palindrome");
}else {
	System.out.println("the string is not palindrome");
}
	}

}
