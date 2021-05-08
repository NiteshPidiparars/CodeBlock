int main()
{
    int i,n;
    printf("Enter the number: \n");
    scanf("%d",&n);
    for(i=0;i<=n;i++){
        if(n==i*i){
            printf("Entered number is a perfect number\n");
            return 0;
        }
    }
        printf("Entered number is not perfect number\n");
}
