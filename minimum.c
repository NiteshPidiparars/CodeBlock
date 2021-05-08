int main()
{
    int min,a[10],i,n,loc=1;
    printf("Enter the value of n:\n");
    scanf("%d",&n);
    printf("Enter %d integer: \n",n);
    for(i=0;i<n;i++)
        scanf("%d",&a[i]);
    min=a[0];
    for(i=0;i<n;i++){
        if(a[i]<min){
            min=a[i];
            loc=loc+1;
        }
    }
    printf("minimum element is present at the location %d is the value %d\n ",loc,min);
    return 0;
}

