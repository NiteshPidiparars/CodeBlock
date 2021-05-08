int main()
{
    int a[10],n,i,pos,value;
    printf("Enter the number of n: \n");
    scanf("%d",&n);
    printf("Enter the elements of Array: \n");
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    printf("Enter the elements to insert at the location: \n");
    scanf("%d",&pos);
    printf("Enter the insert elements: \n");
    scanf("%d",&value);
    for(i=n-1;i>=pos-1;i--){
        a[i+1]=a[i];
    }
        a[pos-1]=value;
        printf("Resultant Array is: \n");
        for(i=0;i<=n;i++)
            printf("%d ",a[i]);
}
