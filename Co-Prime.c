int main()
{
    int a,b,max,i;
    printf("Enter the two number: ");
    scanf("%d%d",&a,&b);
    max=a<b?a:b;
    for(i=2;i<=max;i++){
        if(a%i==0&&b%i==0){
            break;
        }
    }
    if(i==max+1)
        printf("%d and %d are Co-prime",a,b);
    else
        printf("%d and %d are Co-prime",a,b);
}
