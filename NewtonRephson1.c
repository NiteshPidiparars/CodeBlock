#include<stdio.h>
#include<math.h>
int user_power,i=0,cnt=0,flag=0;
int coef[10]={0};
float x1=0,x2=0,t=0;
float fx1=0,fdx1=0;

int main()
{
    printf("------PROGRAM FOR NEWTON REPHSON GENREL------ ");
    printf("\nEnter the total number of power: ");
    scanf("%d",&user_power);
    for(i=0;i<=user_power;i++){
        printf("\nx^%d : ",i);
        scanf("%d",&coef[i]);
    }
    printf("\n\nTHE POLYNOMIAL IS: ");
    for(i=user_power;i>=0;i--)
    {
        printf("%dx^%d",coef[i],i);
    }
    printf("\n\nInitial x1->");
    scanf("%f",&x1);
    printf("Iteration\tX1\tFX1\tF'X1");
    do{
        cnt++;
        fx1=fdx1=0;
        for(i=user_power;i>=1;i--){
            fx1+=coef[i]*(pow(x1,i));
         }
         fx1+=coef[0];
         for(i=user_power;i>=0;i--){
            fdx1+=coef[i]*(i*pow(x1,(i-1)));
         }
         t=x2;
         x2=(x1-(fx1/fdx1));
         x1=x2;
         printf("\n\t%d\t%.3f\t%.3f\t%.3f",cnt,x2,fx1,fdx1);
    }
    while((fabs(t-x1))>=0.0001);//Absolute value of floating - pint number
    printf("\n\nRoot of the equation is %f",x2);
    return 0;
}
