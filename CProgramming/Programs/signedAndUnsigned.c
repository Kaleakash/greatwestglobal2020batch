#include<stdio.h>
#include<stdlib.h>
void main() {
	int a=100;
	short b=200;
	long int c=300;
	long long int d=400;
	int e = -100;
	printf("The value of a is =%d\n",a);
	printf("The size  of a is =%d\n",sizeof(a));
	printf("The value of b is =%d\n",b);
	printf("The size  of b is =%d\n",sizeof(b));
	printf("The value of c is =%d\n",c);
	printf("The size  of c is =%d\n",sizeof(c));
		printf("The value of d is =%d\n",d);
	printf("The size  of d is =%ld\n",sizeof(d));
	printf("The value of e is =%d\n",e);
}
