int main()
{
    int i,j,a[36],b,n;
    printf("Enter the number of value: ");
    scanf("%d",&n);
    printf("Enter the element: ");
    for(i=0;i<=n;i++)
       scanf("%d",&a[i]);
    for(i=0;i<=n;i++){
        for(j=i+1;j<=n;j++){
            if(a[i]>a[j]){
                b=a[i];
                a[i]=a[j];
                a[j]=b;
            }
        }
    }
    printf("you have entered number in assending order\n");
    for(i=0;i<=n;i++)
        printf("%d\t",a[i]);
    printf("\n");
}
