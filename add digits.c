int main()
{
    int remainder,sum=0,n;
    printf("Enter the number: \n");
    scanf("%d",&n);
    while(n!=0){
        remainder=n%10;;
        sum=sum+remainder;
        n=n/10;
    }
    printf("Sum of digits is %d",sum);
    return 0;
}
