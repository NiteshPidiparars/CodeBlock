int main()
{
    int n,sum=0,i;
    printf("Enter the number: \n");
    scanf("%d",&n);
    for(i=1;i<=n;i++){
        sum=sum+i;
    }
    printf("sum is %d\n ",sum);
    return 0;
}
