int main()
{
    int a[10],b[10],c=0,i,j,n;
    printf("Enter the array: \n");
    scanf("%d",&n);
    printf("Enter the elements of array: \n");
    for(i=0;i<n;i++)
        scanf("%d",&a[i]);
    for(i=0;i<n;i++){
            for(j=0;j<c;j++){
                if(a[i]==a[j]){
                    break;
                }
            }
            if(j==c){
                b[c]=a[i];
                c++;
        }
    }
    printf("Array Elements are: ");
    for(i=0;i<c;i++)
        printf("%d ",b[i]);
}
