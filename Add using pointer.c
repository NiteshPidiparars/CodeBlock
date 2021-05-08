int main()
{
    int a,b,*p,*q,sum;
    printf("Enter the number: \n");
    scanf("%d %d",&a,&b);
    p=&a;
    q=&b;
    sum=*p+*q;
    printf("Sum is: %d",sum);
    return 0;
}
