int main()
{
    int i,n,max,num;
    printf("Enter the n: ");
    scanf("%d",&n);
    printf("Number %d: ",1);
    scanf("%d",&max);
    for(i=2;i<=n;i++){
    printf("Number %d: ",i);
    scanf("%d",&num);
        if(max<num)
            max=num;
    }
    printf("Largest number is %d",max);
    return 0;
}
