#include <stdio.h>

int main(int argc, char *argv[])
{
	double firstNumber, secondNumber, temporaryVariable;
	firstNumber = atol(argv[1]);
	secondNumber = atol(argv[2]);
	temporaryVariable = firstNumber;
	firstNumber = secondNumber;
	secondNumber = temporaryVariable;
	//a=a+b;b=a-b;a=a-b;
	printf("\nAfter swapping, firstNumber = %.2lf\n", firstNumber);
	printf("After swapping, secondNumber = %.2lf", secondNumber);
	return 0;
}
/*a=10 b=5
a=a+b=15
b=a-b=15-5=10
a=a-b=15-10=5*/
