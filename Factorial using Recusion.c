int main()
{
    int num,f;
    printf("Enter the number: ");
    scanf("%d",&num);
    f=fact(num);
    printf("factorial of %d is %d\n",num,f);
    return 0;
}
int fact(int n)
{
    if(n==1)
        return 1;
    else
        return(n*fact(n-1));
}
