int main()
{
    int num,i,n,ele,a[10];
    printf("Enter the number of n: \n");
    scanf("%d",&n);
    printf("Enter the %d elements in array: \n",n);
    for(i=0;i<n;i++)
        scanf("%d",&a[i]);
    printf("Enter the elements to be search: \n");
    scanf("%d",&ele);
    i=0;
    while(i<num && ele!=a[i]){
        i++;
    }
    if(i<num)
        printf("number found at the location %d",i+1);
    else
        printf("number is not found at the location %d",i+1);
    return 0;
}
