#include<stdio.h>
#include<stdlib.h>
void main() {

	int a=10;
	int b;
	b = a;
	printf("The value of b is = %d\n",b);
	b=++a;				//increment and store 
	printf("The value of b is = %d\n",b);
	b=a++;				//store and increment 
	printf("The value of b is = %d\n",b);


	/*
	int a=10;
	printf("The value of a is = %d\n",a);
	++a;				//pre-increment or pre-decrement
	printf("The value of a is = %d\n",a);
	a++;				//post increment or post-decrement
	printf("The value of a is = %d\n",a);
	
	*/



	/*int a=4;			
	int b=3;				
	int result1;
	result1 = a>b?a:b;		//exp1?exp2:exp3;
	printf("Result is %d\n",result1);
	*/
	
	/*int a=2;			//0010
	int b=3;			//0011	
	int result1,result2;
	result1 = a&b;		// 0010 + 0011 = 0010
	result2 = a|b;		// 0010 + 0011 = 0011	
	printf("Bitwise & =%d\n",result1);
	printf("Bitwise | =%d\n",result2);*/
	
}
