#include <stdio.h>

int main(int argc, char *argv[])
{
	int number = atol(argv[1]);
		int result = 0;
		int orig = number;
		while (number != 0) {
			int remainder = number % 10;
			result = result + remainder * remainder * remainder;
			number = number / 10;
		}
		if (orig == result) {
			printf("It is an Amstrong number");
		}
		printf("It is not an Amstrong number");
		//153 is Amstrong number(cubes of digits sum equals to the given number itself)=1^3+5^3+3^3=153
}
