#include <stdio.h>
int main(int argc, char *argv[]) {
	int num = atol(argv[1]);
	int temp=num;
	int rev_num = 0;
	    while (num > 0)
	    {
	    	int m=num%10;
	        rev_num = rev_num*10 +m ;
	        num = num/10;
	    }
	    return rev_num;
	printf("reverse of the Number %ld = %ld\n", temp, rev_num);
}
