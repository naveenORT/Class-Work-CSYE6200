package lanbda;

public class A {

	public A() {
		System.out.println("A OBJECT CREATED");
	}

	public class B {
		
		public B() {
			System.out.println("B OBJECT CREATED");
		}
	}

	public static void main(String args[])	
	{
		A a = new A();
		A.B b = a.new B();
	}
}
