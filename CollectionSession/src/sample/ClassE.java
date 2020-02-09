package sample;

import java.util.ArrayList;
import java.util.Iterator;

public class ClassE {

	public static void main(String[] args) {
		ClassW e1=new ClassW("ravi", "qa", 123, 24);
		ClassW e2=new ClassW("raju", "dev", 456, 25);
		
		ArrayList<ClassW>obj=new ArrayList<>();
		
		obj.add(e1);
		obj.add(e2);
		Iterator<ClassW>it=obj.iterator();
		while (it.hasNext()) {
			/*ClassW emp=it.next();
			System.out.println(emp.age);
			System.out.println(emp.dept);
			System.err.println(emp.id);
			System.out.println(emp.name);
			*/
			System.out.println(it.next());
			
		}
		
	}
		

}
