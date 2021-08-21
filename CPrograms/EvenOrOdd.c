#include <stdio.h>

int main(int argc, char *argv[])
{
	int number;
	number = atol(argv[1]);
	if (number % 2 == 0)
		printf("%d is even.", number);
	else
		printf("%d is odd.", number);
	return 0;
}
