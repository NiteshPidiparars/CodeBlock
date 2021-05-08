int main()
{
    int n,sq,i,sum=0;
    printf("Enter the number: ");
    scanf("%d",&n);
    sq=n*n;
    for(i=sq;i>0;i=i/10)
        sum=sum+i%10;
        if(sum==n)
            printf("%d is neon number\n",n);
        else
            printf("%d is not neon number\n",n);
        return 0;
}
