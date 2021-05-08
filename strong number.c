int main()
{
    int i,fact,r,j,n,temp,sum=0;
    printf("Enter the number: \n");
    scanf("%d",&n);
    temp=n;
    while(n>0){
        i=1,fact=1;
        r=n%10;
        while(i<=r){
            fact=fact*i;
            i++;
            }
            sum=sum+fact;
            n=n/10;
        }
        if(sum==temp)
            printf("%d is String number",temp);
        else
            printf("%d is not String number",temp);
}
