int main()
{
    int n,i,k;
    printf("Enter the integer: \n");
    scanf("%d",&n);
    printf("%d is binary number\n",n);
    for(i=32;i>=0;i--){
        k=n>>i;
        if(k&1)
            printf("1");
        else
            printf("0");
    }
    printf("\n");
    return 0;
}
