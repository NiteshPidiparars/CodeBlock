int main()
{
    int i,n,f=1;
    float sum=0;
    printf("Enter the number: \n");
    scanf("%d",&n);
    for(i=1;i<=n;i++){
        f=f*i;
        sum=sum+i/f;
    }
    printf("Series is: %f",sum);
}
