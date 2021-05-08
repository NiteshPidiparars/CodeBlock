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
