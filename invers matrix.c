#include<stdio.h>
void reduction(float a[][6],int n,int p,int c);
void reduction(float a[][6],int n,int p,int c)
{
    int i,j;
    float f;
    f=a[p][c];
    for(i=0;i<2*n;i++){
        a[p][i]/=f;
    }
    for(i=0;i<n;i++){
        if(i!=p){
            f=a[i][c];
            for(j=0;j<2*n;j++){
                a[i][j]=a[i][j]-a[p][j]*f;
            }
        }
    }
}

int main()
{
    float m[3][6];
    int i,j;
    for(i=0;i<3;i++){
        for(j=0;j<6;j++){
            if(j==i+3){
                m[i][j]=1;
            }
            else{
                m[i][j]=0;
            }
        }
    }
    printf("\nEnter the 3*3 matrix: \n");
    for(i=0;i<3;i++){
        for(j=0;j<3;j++){
            scanf("%f",&m[i][j]);
        }
    }
    for(i=0;i<3;i++){
        reduction(m,3,i,i);
    }
     printf("inverse matrix is: \n");
    for(i=0;i<3;i++){
        for(j=0;j<3;j++){
            printf("%8.3f",m[i][j+3]);
        }
        printf("\n");
    }

}
