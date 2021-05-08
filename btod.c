int main()
{
    int n,k,i;
    printf("Enter the integer: \n");
    scanf("%d",&n);
    printf("%d is binary number is\n",n);
    for(i=31;i>=0;i--){
        k=n>>i;
        if(k&1)
            printf("1");
        else
            printf("0");
    }
    printf("\n");
}
