int main()
{
    int n1,n2;
    printf("Enter the two number: \n");
    scanf("%d %d",&n1,&n2);
    printf("GCD number of %d and %d is %d\n",n1,n2,gcd(n1,n2));
    return 0;
}
int gcd(int x,int y)
{
    while(x!=y)
    {
        if(x>y)
            return gcd(x-y,y);
        else
            return gcd(x,y-x);
    }
    return x;
}
