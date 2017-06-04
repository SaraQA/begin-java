// Sum of odd and even value in the array. Initialize , print , calculate 

#include<stdio.h>
void initialize(int *p , int *num )
{
int i ;
printf("Enter value of n\n") ;
scanf("%d",&(*num)) ;
for(i=0 ; i<*num ; i++)
{
printf("Enter the element\n") ;
scanf("%d",&p[i]) ;
}
}

void print(int *b , int number)
{
int i ;
for(i=0 ; i<number ; i++)
{
printf("%d",b[i]) ;
}
}

void calculate(int *x , int number)
{
int sum_even, sum_odd ;
for(i=0 ; i<number ; i++)
{
if(b[i]%2 == 0)
sum_even += b[i] ;
else
sum_odd += b[i] ;
}
printf("EVEN : %d , ODD : %d",sum_even,sum_odd) ;
}

int main()
{
int a[100] , n ;
initialize( a, &n) ;
print(a , n) ;
calculate(a,n)
return 0;
}