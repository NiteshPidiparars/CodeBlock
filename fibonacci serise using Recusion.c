int main()
{
    int n;
    printf("Enter the number: \n");
    scanf("%d",&n);
    printf("Fibonacci Series are: \n");
    printf(" %d %d",0,1);
    fib(n);
    return 0;
}
int fib(int n)
{
    static int f=0,s=1,sum;
    if(n>0){
        sum=f+s;
        f=s;
        s=sum;
        printf(" %d",sum);
        fib(n-1);
    }
}
