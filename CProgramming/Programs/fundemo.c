#include<stdio.h>
void info() {
	printf("info function - no passing parameter no return type");
}
void addNumber(int x, int y) {
	int sum = x+y;
	printf("\nSum of two number is = %d\n",sum);
}

int add(int x, int y) {
	int sum = x+y;
	return sum;
}
char sayHello() {
	return 'A';
}
void main() {
	int result;
	char ch;
	printf("Welcome to User defined function\n");
	info();
	addNumber(10,20);
	result = add(1,2);
	printf("Sum is in main function = %d\n",result);
	ch = sayHello();
	printf("Say Message is in main function = %c\n",ch);
	
}