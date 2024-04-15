class Demo{
	String name;
	int age;
	public Demo(String name, int age) {
		super();
		this.name=name;
		this.age=age;
	}
	public String getname() {
		return name;
	}
	public int getage() {
		return age;
	}
}

public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo p1=new Demo("Ramesh",30);
		System.out.println(p1.getname());
		System.out.println(p1.getage());
		
	}

}
