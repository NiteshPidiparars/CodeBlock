#include<stdio.h>
int main()
{
    int n,i,*ptr,sum=0;
    printf("Enter the number: \n");
    scanf("%d",&n);
    ptr=(int)malloc(n*sizeof(int));
    if(ptr==NULL){
        printf("Error,memory not allocate");
        return 0;
    }
    printf("Enter the array: \n");
    for(i=0;i<n;i++){
        scanf("%d",ptr+i);
        sum=sum+*(ptr+i);
    }
    printf("Array is: \n");
    for(i=0;i<n;i++){
        printf("%d ",ptr[i]);
    }
    free(i);
}
