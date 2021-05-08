int main()
{
    int a,n,d,sum=0;
    printf("Enter the number: \n");
    scanf("%d",&n);
    a=n;
    while(a>0){
        d=a%10;
        sum=sum+d;
        a=a/10;
    }
    if(n%sum==0)
        printf("Niven number\n");
    else
        printf("Not Niven number\n");
    return 0;
}
