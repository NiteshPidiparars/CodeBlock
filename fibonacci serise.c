int main()
{
    int n,k;
    printf("Enter the number: ");
    scanf("%d",&n);
    n=n-2;
    printf("fibonacci serice: ");
    printf("%d %d ",0,1);
    fib(n);
    return 0;
}
void fib(int n)
{
    static int f=0,s=1,sum;
    if(n>0){
        sum=f+s;
        f=s;
        s=sum;
        printf("%d ",sum);
        fib(n-1);
    }
}
