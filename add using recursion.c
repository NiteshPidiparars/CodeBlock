int y;
int add(int m,int n)
{
    if(n==0)
        return m;
    y=add(m,n-1)+1;
    return y;
}
int main()
{
    int a,b,x;
    printf("Enter the number: ");
    scanf("%d%d",&a,&b);
    x=add(a,b);
    printf("Sum of number are %d+ %d= %d\n ",a,b,x);
    return 0;
}
