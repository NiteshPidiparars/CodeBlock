#include<string.h>
int main()
{
    int a[10][10],b[10][10],temp;
    int i,j,n;
    printf("Enter the value: \n");
    scanf("%d",&n);
    printf("Enter the number: \n");
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);
    strcpy(b[i],a[i]);
    }
    for(i=0;i<n-1;i++){
        for(j=i+1;j<n;j++){
            if(strcmp(a[i],a[j]>0)){
               strcpy(temp,a[i]);
               strcpy(a[i],a[j]);
               strcpy(a[j],temp);
               }
        }
    }
    printf("\n-------------------\n");
    printf("Input name sorted names\n");
    printf("-----------------------\n");
    for(i=0;i<n;i++){
        printf("%s\t\t%s\n",b[i],a[i]);
    }
    printf("-----------------------\n");
    return 0;
}
