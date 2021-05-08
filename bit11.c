main()
{
    int i,j,n;
    printf("Enter the number: ");
    scanf("%d",&n);
    for(i=2;n;i=i*2){
        for(j=1;j<i;j=j*2){
            printf("%d ",i+j);
            n--;
            if(n==0)
                break;
        }
    }
}
