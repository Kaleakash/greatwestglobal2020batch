class Test {
	public static void main(String args[]) {	
	System.out.println("Hi");
	int a=10;
	int b=1;
	int abc[]={1,2,3,4,5};
		try{
		int res = a/b;		//new ArithmeticException();
		System.out.println("Result is "+res);
		int res1 = 10/abc[4];
		System.out.println("Result is "+res1);
		}catch(ArithmeticException e) {
		System.out.println(e.toString());
		}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e.toString());
		}catch(Exception e){
		System.out.println(e.toString());
		}
	System.out.println("Bye..");
	System.out.println("Bye..");
	System.out.println("Bye..");
	}
}