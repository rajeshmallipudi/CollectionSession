package sample;

public class ClassKK {
String name;

	public static void main(String[] args) {
		ClassKK obj=new ClassKK();
		obj.sum("rajesh");

	}
public void sum( String name) {
	this.name=name;
	
	System.out.println(name);
}
}
