int main()
{
    int a[20],t;
    int i,n,j;
    printf("Enter the number of n: \n");
    scanf("%d",&n);
    printf("Enter the array: \n");
    for(i=0;i<n;i++)
        scanf("%d",&a[i]);
    for(i=0;i<n;i++){
        for(j=i+1;j<n;j++){
            if(a[i]>a[j])
            {
                t=a[i];
                a[i]=a[j];
                a[j]=t;
            }
        }
    }
    for(i=0;i<n;i++)
        printf("%d ",a[i]);
}
