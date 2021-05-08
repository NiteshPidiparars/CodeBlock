int main()
{
    int num,a;
    printf("Enter the number: \n");
    scanf("%d",&num);
    a=getSum(num);
    printf("Sum of n number is: %d\n",a);
    return 0;
}
int getSum(int n)
{
    static int sum=0;
    if(n>0){
        sum=sum+n;
        getSum(n-1);
    }
    return sum;
}
