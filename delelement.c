int main()
{
    int a[100],i,n,pos;
    printf("Enter the value of n: ");
    scanf("%d",&n);
    printf("Enter the elements: ");
    for(i=0;i<n;i++)
        scanf("%d",&a[i]);
    printf("Enter the location that you want to delete: ");
    scanf("%d",&pos);
    if(pos>=n+1)
        printf("elements is not deleted");
    else{
        for(i=pos-1;i<n-1;i++)
            a[i]=a[i+1];
            printf("Resultant array is\n");
            for(i=0;i<n-1;i++)
                printf("%d\n",a[i]);
        return 0;
    }
}
