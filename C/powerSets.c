#include <stdio.h>
#include <conio.h>
#include <dos.h>
#include <math.h>

void bin_prnt_byte(int num, int x);

int main () {
	char a[4] = {'a','b','c','d'};

	int k=0;
	int z = 1;
	int index=1;

	while(k<pow(2,sizeof(a))) {
		printf("%d. {",k+1);
		z=1;
		for(int j=0;j<sizeof(a);j++)
		{
			if((k&z) != 0) {
				printf("%c", a[j]);
				if(j < sizeof(a)-1)
					printf(", ");
			}
			z=z<<1;

		}
		printf("}\n");
		k++;
		
	}
	return 0;
}

void bin_prnt_byte(int num, int x)
{
   int n;
   for(n=0; n<num; n++)
   {
      if((x & 0x40) !=0)
      {
         printf("1");
      }
      else
      {
         printf("0");
      }
      if (n==3)
      {
         printf(" "); /* insert a space between nybbles */
      }
      x = x<<1;
   }
}