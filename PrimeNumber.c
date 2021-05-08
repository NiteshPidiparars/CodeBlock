int main()
{
    int n,i,x=3,count;
    printf("Enter the number: \n");
    scanf("%d",&n);
    if(n>=1){
        printf("Enter %d the prime number are: \n",n);
        printf("2\n");
    }
    for(count=2;count<=n;){
        for(i=2;i<=x-1;i++){
            if(x%i==0)
                break;
        }
        if(i==x){
            printf("%d\n",x);
            count++;
        }
        x++;
    }
    return 0;
}
