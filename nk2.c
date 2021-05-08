#include<stdio.h>
float f(float x)
{
    return (1/(1+x));
}
int main()
{
    int i,n;
    float x0,xn,h,x[20],y[20],so,se,ans;
    printf("Enter the value of x0,xn and h: \n");
    scanf("%f%f%f",&x0,&xn,&h);
    n=(xn-x0)/h;
    if(n%2==1){
        n=n+1;
    }
    h=(xn-x0)/n;
    printf("\nRequired value of n and h are: %d and %f\n",n,h);
    printf("\nY value\n");
    for(i=0;i<=n;i++){
        x[i]=x0+i*h;
        y[i]=f(x[i]);
        printf("\n %f\n",y[i]);
    }
    so=0;
    se=0;
    for(i=1;i<n;i++){
        if(i%2==0){
            so=so+y[i];
        }
        else{
            se=se+y[i];
        }
    }
    ans=h/3*(y[0]+y[n]+4*so+2*se);
    printf("final integration is: %f",ans);
    return 0;
}
