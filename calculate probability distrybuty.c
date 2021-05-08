#include<stdio.h>
#define MAXSIZE 100
int main()
{
    float a[MAXSIZE];
    int i,n;
    float m,v,sd,sum=0,sum1=0;
    printf("How many term that you want to entered: \n");
    scanf("%d",&n);
    printf("Enter %d integer: \n",n);
    for(i=0;i<=n;i++){
        scanf("%f",&a[i]);
    }
    for(i=0;i<=n;i++){
        sum=sum+a[i];
    }
    m=sum/(float)n;
    for(i=0;i<=n;i++)
        sum1=sum1+pow((a[i]-m),2);
        v=sum1/(float)n;
        sd=sqrt(v);
        printf("means of all elements: %.2f\n",m);
        printf("variance of all elements: %.2f\n",v);
        printf("standard deviation of all elements: %.2f\n",sd);
        return 0;
}
