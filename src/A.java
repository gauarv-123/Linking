

public class A {
	A(){
		System.err.println("A is created");
	}
	
	
	

	
}


class Student3{
	int id;
	String name;
	void display(){
		System.err.println("id"+""+name);
	}
	public static void main(String args[]){
		Student3 stu=new Student3();
		Student3 stud=new Student3();
		stu.display();
		stud.display();
	
	}
}
	


