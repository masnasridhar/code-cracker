#include <stdio.h>
int main(int argc, char *argv[])
{
int base, height;
float area;
base = atol(argv[1]);
height = atol(argv[2]);
area = base*height/2;
printf("%f",area);
}
