#include<stdio.h>
int main()
{
    float a[10],b[10],f[10],sum,p,temp=1;
    int i,j,n,k=0,c;
    printf("How many record you will be enter: ");
    scanf("%d",&n);
    for(i=0;i<n;i++){
        printf("\n\nEnter the range of a%d",i);
        scanf("%f",&a[i]);
        printf("\n\nEnter the range of f(a%d)",i);
        scanf("%f",&b[i]);
    }
    printf("\n\nEnter for finding record: ");
    scanf("%d",&p);
    for(i=0;i<n;i++){
        temp=1;
        k=i;
        for(j=0;j<n;j++){
            if(k==j){
                continue;
        }
        else{
            temp=temp*((p-a[j])/a[k]-a[j]);
        }
    }
    f[i]=p[i]*temp;
    }
    for(i=0;i<n;i++){
        sum=sum+f[i];
    }
    printf("\n\n(%.1f)= %f",p,sum);
    return 0;

}
