main()
{
    int n,N,s,i,sum=0;
    printf("Enter the number: \n");
    scanf("%d",&n);
    for(n=1;n<=N;n++){
        s=0;
        for(i=1;i<=n;i++)
            s=s+i;
            sum=sum+s;
        }
        printf("sum is %d: ",sum);
}
