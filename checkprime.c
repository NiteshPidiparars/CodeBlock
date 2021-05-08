int main()
{
    int n,i;
    printf("Enter the number: \n");
    scanf("%d",&n);
    for(i=2;i<n;i++){
        if(n%i==0){
            printf("%d is not prime.",n);
        break;
        }
    }
    if(i==n)
        printf("%d is prime.",n);
    return 0;
}
