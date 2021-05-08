int main()
{
    int *p,*q,a,b,sum;
    printf("Enter two number: \n");
    scanf("%d%d",&a,&b);
    p=&a;
    q=&b;
    sum=*p+*q;
    printf("sum of pointer is %d + %d= %d\n",a,b,sum);
}
