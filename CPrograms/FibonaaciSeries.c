#include <stdio.h>

int main(int argc, char *argv[])
{
	int n, first = 0, second = 1, next, c;
	n = atol(argv[1]);
	printf("First %d terms of Fibonacci series are :-\n", n);
	for (c = 0; c < n; c++)
	{
		if (c <= 1)
			next = c;
		else
		{
			next = first + second;
			first = second;
			second = next;
		}
		printf("%d\n", next);
	}
	return 0;
}

//0112358
