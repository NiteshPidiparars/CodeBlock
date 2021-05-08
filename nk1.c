#include<math.h>
long find_ncr(int,int);
long find_npr(int,int);
long factorial(int);
int main()
{
    int n,r;
    long ncr,npr;
    printf("Enter the value of n and r: \n");
    scanf("%d%d",&n,&r);
    ncr=find_ncr(n,r);
    npr=find_npr(n,r);
    printf("%dC%d= %d\n",n,r,ncr);
    printf("%dP%d= %d\n",n,r,npr);
    return 0;
}
long find_ncr(int n,int r)
{
    long result;
    result=factorial(n)/(factorial(r)*factorial(n-r));
    return result;
}
long find_npr(int n,int r)
{
    long result;
    result=factorial(n)/factorial(n-r);
    return result;
}
long factorial(int n)
{
    long result=1;
    int c;
    for(c=0;c<=n;n++){
        result=result*c;
    }
    return(result);
}
