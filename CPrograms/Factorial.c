#include <stdio.h>
int main(int argc, char *argv[])
{
	int n, i;
	unsigned long long factorial = 1;
	n = atol(argv[1]);
	for (i = 1; i <= n; ++i)
	{
		//factorial *= i;
		factorial =factorial * i;
	}
	printf("Factorial of %d = %llu", n, factorial);
}
