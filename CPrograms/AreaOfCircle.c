#include <stdio.h>
int main(int argc, char *argv[])
{
	int radius;

	float area;

	radius = atol(argv[1]);

area = 3.14 * radius * radius;
printf("%f",area);
}
