int main()
{
    int a,b,r;
    printf("Enter two number: \n");
    scanf("%d%d",&a,&b);
    r=add(a,b);
    printf("Sum is: %d",r);
}
int add(int m,int n)
{
    int y;
    if(n==0)
        return m;
    y=add(m,n-1)+1;
    return y;
}
