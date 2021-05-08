int main()
{
    int a[10],n,i,pos;
    printf("Enter the value of n: \n");
    scanf("%d",&n);
    printf("Enter the elements in Array: \n");
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    printf("Enter the location you want to delete: \n");
    scanf("%d",&pos);
    if(pos>=n+1){
        printf("Delete not Found.");
    }
    else
    {
        for(i=pos-1;i<n-1;i++)
            a[i]=a[i+1];
        printf("Resultant Array is: \n");
        for(i=0;i<n-1;i++)
            printf("%d ",a[i]);
    }
    return 0;
}
