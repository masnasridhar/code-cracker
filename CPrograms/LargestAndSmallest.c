#include <limits.h>
#include <stdio.h>
#include <stdlib.h>
//#include <string.h>

void largestAndSmallest(int numbers[]) {
	int largest = INT_MIN;
	int smallest = INT_MAX;
	int length = sizeof(numbers) / sizeof(int);
	for (int i = 0; i < length; i++) {
		int number = numbers[i];
		if (number > largest) {
			largest = number;
		}
		if (number < smallest) {
			smallest = number;
		}
	}
	printf("Largest number in array is :  %ld\n", largest);
	printf("Smallest number in array is :  %ld\n", smallest);
}
void secondLargest(int numbers[]) {
	int largest = INT_MIN;
	int scondLarge = INT_MIN;
	int length = sizeof(numbers) / sizeof(int);
	for (int i = 0; i < length; i++) {
		int number = numbers[i];
		if (number > largest) {
			scondLarge = largest;
			largest = number;
		} else if (scondLarge < number) {
			scondLarge = number;
		}
	}
	printf("Largest number in array is :  %ld\n", largest);
	printf("Second Largest number in array is :  %ld\n", scondLarge);

}
void secondMin(int numbers[]) {
	int min = INT_MAX;
	int secondMin = INT_MAX;
	int length = sizeof(numbers) / sizeof(int);
	for (int i = 0; i < length; i++) {
		int number = numbers[i];
		if (number < min) {
			secondMin = min;
			min = number;
		} else if (secondMin > number) {
			secondMin = number;
		}
	}
	printf("Min number in array is :   %ld\n", min);
	printf("Second Min number in array is :   %ld\n", secondMin);
}

int main(int argc, char *argv[]) {
	int c[10];
	int i, temp, j, greatest;
	j = 0;
	for (i = 1; i < argc; i++) {
		temp = atoi(argv[i]);
		c[j] = temp;
		j++;
	}
	largestAndSmallest(c);
	secondLargest(c);
	secondMin(c);
}

