int main()
{
    int a[10],i,min,max,n;
    printf("Enter the value of n: \n");
    scanf("%d",&n);
    printf("Enter the number: \n");
    for(i=0;i<=n;i++)
        scanf("%d",&a[i]);
    min=a[0];
    for(i=0;i<=n;i++){
        if(min>a[i]){
            min=a[i];
        }
    }
    printf("Minimum value is:- %d\n",min);
    max=a[0];
     for(i=0;i<=n;i++){
         if(max<a[i]){
            max=a[i];
        }
     }
     printf("Maximum value is:- %d ",max);
     return 0;
}
