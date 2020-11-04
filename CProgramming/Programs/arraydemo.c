#include<stdio.h>
void main() {
	int num[10];	//using index postion we can retrieve the value. 
	int num1[5]={100,200,300,400,500};
	int i;
	int num2[10];
	int n;
	printf("The value of num is %d\n",num[0]);
	printf("First value of num1 is = %d\n",num1[0]);
	printf("Display the array elements using loop\n");
	for(i=0;i<5;i++) {
		printf("%d\n",num1[i]);
	}
	printf("how many number do you want to store max-10\n");
	scanf("%d",&n);
	printf("Enter the number one by one\n");
	for(i=0;i<n;i++) {
		scanf("%d",&num2[i]);
	}
	printf("All elements are \n");
	for(i=0;i<n;i++) {
		printf("%d\n",num2[i]);
	}
}