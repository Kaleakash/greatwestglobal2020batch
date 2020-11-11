
class ExpDemo {
	public static void main(String args[]){
	String name1 = "Raj";		//literal style 
	String name2 = "Raj";
				// one object two reference 
	String name3 = new String("Raj");	
	String name4 = new String("Raj");
	if(name1.equals(name3)) {
		System.out.println("Equal");
	}else {
		System.out.println("Not Equal");
	}
	}
}