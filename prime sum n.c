int main()
{
    int i=3,c,count,n,sum=0;
    printf("Enter the prime number: \n");
    scanf("%d",&n);
    if(n>=1){
        printf("first %d prime number are: \n",n);
        printf("2\n");
    }
    for(count=2;count<=n;){
        for(c=2;c<=i-1;c++){
            if(i%c==0)
            break;
        }
        if(c==i){
            sum=sum+i;
            printf("%d\n",i);
            printf("");
            count++;
        }
        i++;
    }
    printf("\n");
    printf("Sum is: %d",sum);
    return 0;
}
