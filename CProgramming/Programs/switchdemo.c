#include<stdio.h>
#include<stdlib.h>
void main() {
	int ch;
	printf("Plese enter the nubmer between 1 to 4\n");
	scanf("%d",&ch);
	switch(ch) {
	
	case 1:printf("1st block");
		break;

	default:printf("Wrong choice");
		
	case 2:printf("2nd block");
		break;
		
	case 3:printf("3rd block");
		break;

		}
	printf("\nFinish");
}