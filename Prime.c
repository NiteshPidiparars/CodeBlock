int main()
{
    int x,i;
    printf("Enter the number: \n");
    scanf("%d",&x);
    for(i=2;i<=x;i++)
        if(x%i==0)
        break;
    if(i==x)
        printf("%d is prime number",x);
    else
        printf("%d is not prime number",x);
}
