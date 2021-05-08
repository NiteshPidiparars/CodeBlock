int main()
{
    int result,n;
    printf("Enter the prime number: ");
    scanf("%d",&n);
    result=check_prime(n);
    if(result==1)
        printf("prime number");
    else
        printf("not prime number");
    return 0;
}
int check_prime(int n)
{
    int i;
    for(i=2;i<=n-1;i++){
        if(n%2==0)
            return 0;
    }
    if(i==n)
        return 1;
}
