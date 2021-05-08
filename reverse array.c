int main()
{
    int i,n,a[10],b[10],j;
    printf("Enter the value of n: \n");
    scanf("%d",&n);
    printf("Enter the elements in Array: \n");
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    for(i=n-1,j=0;i>=0;i--,j++)
        b[j]=a[i];
    for(i=0;i<n;i++)
        a[i]=b[i];
    printf("Resultant array is: \n");
    for(i=0;i<n;i++)
        printf("%d ",a[i]);
}
