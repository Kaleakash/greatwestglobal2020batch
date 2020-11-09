class A {
	void dis1() {
	System.out.println("A class method");
	}
}
class B extends A{
	void dis2() {	
	System.out.println("B class method");
	}
}

class Test {
	public static void main(String args[]) {
	A obj1 = new A();
	B obj2 = new B();
	obj1.dis1();
	obj2.dis2();	
	obj2.dis1();
	}
}
