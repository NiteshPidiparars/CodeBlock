#include<stdio.h>
int main()
{
    int a_size,i;
    printf("Enter the Array size: ");
    scanf("%d",&a_size);
    int a[a_size];
    printf("Enter the %d array elements\n",a_size);
    for(i=0;i<a_size;i++)
        scanf("%d ",&a[i]);
    printf("Distinct or Unique array elements are: ");
    int n=sizeof(a)/sizeof(a[0]);
    printStates(a,n);
    return 0;
}
int printStates(int a[],int n)
{
    int i;
    for(i=0;i<n;i++){
        int j;
        for(j=0;j<n;j++)
            if(a[i]==a[j])
            break;
        if(i==j)
            printf("%d ",a[i]);
    }
}
