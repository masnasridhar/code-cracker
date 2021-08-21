#include <stdio.h>

int main(int argc, char *argv[]) {
	int num = atol(argv[1]);
	int temp = num;
	int digit,sum=0;
	while (num > 0) {
		digit = num % 10;
		sum = sum + digit;
		num /= 10;
	}
	printf("Sum of the digits %ld = %ld\n", temp, sum);
}
