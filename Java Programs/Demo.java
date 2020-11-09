import java.util.*;
class Demo {
	public static void main(String args[]) {
	Scanner obj = new Scanner(System.in);
	System.out.println("How many number do you want store\n");
	int n = obj.nextInt();
	int num[]=new int[n];		//like malloc
	System.out.println("Enter the number one by one");
	for(int i=0;i<n;i++) {
		num[i]=obj.nextInt();
	}

	for(int i=0;i<n;i++) {
		if(num[i]>20) {
			num[i]=num[i]-5;
		}else {
			num[i]=num[i]+5;
		}
	}
	for(int i=0;i<n;i++) {
		System.out.println(num[i]);
	}
	}
}