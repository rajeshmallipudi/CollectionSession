package sample;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		
		//dynamic memory 
				
				ArrayList sandy=new ArrayList();
				sandy.add(10);
				sandy.add(20);
				System.out.println(sandy.size());
		//o/p:2 it indicates the current size of the arraylist
				sandy.add(40);
				sandy.add(65);
				sandy.add(40);
				sandy.add("ravi");
				//wde can add duplicate values also
				System.out.println(sandy.size());
				//now size is 4
		//inserion order is maintained like 0 1 2 3...
		//not synchronized(malti threading not used)
		//random access 
				System.out.println(sandy.get(3));//get the value from index
				//o/p:65
				
				//if we want to print the all values from ArrayList we use for loop.
				//1.for loop
				//2.iterator
				
				for (int i = 0; i < sandy.size(); i++) {
					System.out.println(sandy.get(i));
					//o/p:10,20,40,65,40
					
		//generics vs non generics
					
					//if we want to strore only int then we need to specify generics
					ArrayList< Integer>pavan=new ArrayList<>();
					pavan .add(12);
					//pavan .add(g); not allowed
					
					//ArrayList<E>abi=new ArrayList<>();
					
					//employee class objects:
					Employee e1=new Employee("pavan", 25, "qa");
					Employee e2=new Employee("ravi", 24, "dev");
					
					//creater array list
					ArrayList<Employee> obj=new ArrayList<Employee>();
					obj.add(e1);
					obj.add(e2);
					
					//iterator to traverse the values:
					Iterator<Employee>it=obj.iterator();
					while(it.hasNext()) {
						Employee emp=it.next();
						System.out.println(emp.name);
						System.out.println(emp.age);
						System.out.println(emp.dept);
					}
					
					
					
					
					
				}
				
				
				
				
			}

		


	}


