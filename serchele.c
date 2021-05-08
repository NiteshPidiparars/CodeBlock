int main()
{
    int a[10],i,n,ele;
    printf("\nEnter the value of n: \n");
    scanf("%d",&n);
    printf("Enter %d integer: \n",n);
    for(i=0;i<n;i++)
        scanf("%d",&a[i]);
    printf("\nSearch the elements in the list: \n");
    scanf("%d",&ele);
    i=0;
    if(i<n && ele!=a[i])
    {
        i++;
    }
    if(i<n)
        printf("\nNumber is found at the location: %d\n",i+1);
    else
        printf("\nNumber is not found in the list\n");
    return 0;
}
