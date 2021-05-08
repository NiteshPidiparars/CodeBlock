#include<stdio.h>
double SumSeries(double);
int main()
{
    double num,sum;
    printf("Enter the number: ");
    scanf("%lf",&num);
    sum=SumSeries(num);
    printf("\nSum of series: %lf\n",sum);
    return 0;
}
double SumSeries(double m)
{
    double f=1,i,sum1=0;
    for(i=1;i<=m;i++){
        f=f*i;
        sum1=sum1+(i/f);
        if(i==m){
            printf("%.2lf/%.2lf= %lf",i,f,sum1);
        }else{
            printf("%.2lf/%.2lf+\n",i,f);
        }
    }
    return(sum1);
}
