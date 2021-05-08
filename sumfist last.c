int main()
{
    int n,f,l;
    printf("Enter the number: \n");
    scanf("%d",&n);
    l=n%10;
    f=n;
    while(f>=10)
        f=f/10;
    printf("sum of fist and last number is: %d + %d= %d\n",f,l,f+l);
    return 0;
}
