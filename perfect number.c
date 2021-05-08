int main()
{
    int n,i=1,sum=0;
    printf("Enter the number: \n");
    scanf("%d",&n);
    while(i<n){
        if(n%i==0){
            sum=sum+i;
            }
            i++;
    }
    if(sum==n)
        printf("its perfect number");
    else
        printf("its not perfect number.");
}
