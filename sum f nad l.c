main()
{
    int n,f,l;
    printf("Enter the number: ");
    scanf("%d",&n);
    l=n%10;
    f=n;
    while(f>=10)
        f=f/10;
    printf("sum of first and last %d+%d= %d\n",f,l,f+l);
}

