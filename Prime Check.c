int main()
{
    int n,result;
    printf("Enter the value of n: \n");
    scanf("%d",&n);
    result=sumSeries(n);
    if(result==1)
        printf("%d is prime number",n);
    else
        printf("%d is not prime number",n);
}
int sumSeries(int n)
{
    int i;
    for(i=2;i<=n-1;i++){
        if(n%i==0)
            return 0;
    }
    if(i==n)
        return 1;
}
