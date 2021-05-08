int main()
{
    int a[10],i,n;
    printf("Enter the number: \n");
    scanf("%d",&n);
    printf("Enter %d integer: \n",n);
    for(i=0;i<=n;i++)
    scanf("%d",&a[i]);
    printf("matrix of Alternate is: \n");
    for(i=0;i<=n;i=i+2)
        printf(" %d\n",a[i]);
        return 0;
}
