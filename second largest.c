int main()
{
    int a,b,c;
    printf("Enter the three numbers: \n");
    scanf("%d%d%d",&a,&b,&c);
    if(a>b&&a>c)
        if(b>c)
        printf("b is Second largest no.: %d",b);
    else
        printf("c is Second largest no.: %d",c);
    if(b>a&&b>c)
        if(a>c)
        printf("a is Second largest no.: %d",a);
    else
        printf("c is Second largest no.: %d",c);
    if(c>a&&c>b)
        if(b>a)
        printf("a is Second largest no.: %d",a);
    else
        printf("b is Second largest no.: %d",b);
    return 0;
}
