/*int main()
{
    int a[10],n,i,j,k;
    printf("Enter the number of n : ");
    scanf("%d",&n);
    printf("Enter the array : ");
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    printf("Enter the value of k : ");
    scanf("%d",&k);
    k = a[0];
    for(i=0;i<n;i++){
        for(j=i-1;j>=0;j--){
            if(a[j] == a[i])
                break;
            else if(a[j] > k)
                k = a[j];
            }
        }
        printf("Smallest Element in the Array is : %d",k);
        return 0;
}*/
/*
int main()
{
    int a[30],i,n,k;
    printf("Enter Number of Elements in Array :");
    scanf("%d",&n);
    printf("Enter the Elements of Arrays : ");
    for(i=0 ; i < n ; i++){
        scanf("%d",&a[i]);
    }
    printf("Enter the Value of k : ");
    scanf("%d",&k);
    k = a[0];
    for(i=0;i<n;i++){
        if ( a[i] > k )
            k = a[i];
    }
    printf(" Smallest Element in the Array is : %d",k);
    return 0;
}*//*
int main()
{
    int a[10],i,n,k=0;
    printf("Enter the number of array : ");
    scanf("%d",&n);
    printf("Enter the Arrays : ");
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    printf("Enter the Value of k : ");
    scanf("%d",&k);
    for(i=0;i<n;i++){
        if(a[i] < k)
            k = a[i];
    }
    printf("Smallest Value is : %d",k);
    return 0;
}
*//*
int main()
{
    int i, j, a, n,k, arr[30];
    printf("Enter the value of N : ");
    scanf("%d", &n);
    printf("Enter the Arrays : ");
    for (i = 0; i < n; ++i)
        scanf("%d", &arr[i]);
    printf("Enter the Value of k : ");
    scanf("%d",&k);
    for (i = 0; i < n; ++i)
    {
        for (j = i + 1; j < n; ++j)
        {
            if (arr[i] > arr[j])
            {
                a =  arr[i];
                arr[i] = arr[j];
                arr[j] = a;
            }
        }
    }
    if(n == k)
        printf("Smallest Value of k : %d",k);
    return 0;
}*/
/*Given an array arr[] and a number K(smaller than size of array) find the Kth smallest element in the given array.
all array elements are distinct.*/
int main()
{
    int a[100], n, i, j, temp, k;
    printf("Enter the size of array : ");
    scanf("%d", &n);
    printf("Enter the array elements : ");
    for (i = 0; i < n; i++)
    {
        scanf("%d", &a[i]);
    }
    for(i=0;i<n;i++){
        for(j = i + 1; j < n; ++j){
            if(a[i] > a[j]){
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }
    printf("Descending Order of Array : ");
    for(i=0;i<n;i++){
        printf("%d ",a[i]);
    }
    printf("\nEnter Which kth Number You want : ");
    scanf("%d", &k);
    printf("The %dth kth number is: %d", k, a[k - 1]);
    printf("\n");
    return 0;
}























