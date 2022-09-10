package collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ListInterface {
public static void main(String[] args) {
	List l=new ArrayList();
	l.add("path");
	l.add("smaer");
	l.add("rrr");
	
	
	
	System.out.println(l);
	for (int i=0;i<l.size();i++) {
		System.out.println(l.get(i));
	}
}
}
