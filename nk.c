int main()
{
    int n;
    printf("Enter the number: ");
    scanf("%d",&n);
    snumber(n);
    return 0;
}
int snumber(int n)
{
    int temp;
    for(temp=n;temp<n+5;temp++)
        printf("%d ",temp);
}
