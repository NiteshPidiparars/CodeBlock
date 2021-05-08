int main()
{
    int x,i,fact=1,n;
    float sum=0;
    printf("Enter the value of x in Series: \n");
    scanf("%d",&x);
    printf("Enter the number of n in terms: \n");
    scanf("%d",&n);
    for(i=1;i<n;i++)
    {
        fact=fact*i;
        sum=sum+(pow(x,i)/fact);
    }
    sum=sum+1;
    printf("The Sum of the Taylor Series is: %f\n",sum);
    return 0;
}
