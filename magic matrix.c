#include <stdio.h>
int main()
{
    int i,j=1,l,n;
    int mm[50][50],x,y,z;
    int c=0;
    label:
        printf("Enter the order of magic matrix(ODD): ");
        scanf("%d",&n);
        printf("\n");
        if(n%2==0){
            printf("Enter odd number only\n\n");
            goto label;
        }
        l=(n+1)/2;
        //  set all the elements use to 0
        for(x=1;x<=n;x++){
            for(y=1;y<=n;y++){
                mm[x][y]=NULL;
            }
        }
        for(i=1;i<=(n*n);i++){
            if(mm[j][l]==NULL){
                mm[j][l]=i;
            }
            else{
                j=j+2;
                l--;
                if(j==n+2)
                    j=2;
                if(l==0)
                    l=n;
                if(j==0)
                    j=n;
                if(l==n+1)
                    l=1;
                mm[j][l]=i;
            }
            j--;
            l++;
            if(j==0)
                j=n;
            if(l==n+1)
                l=1;
        }
        for(x=1;x<=n;x++){
            for(y=1;y<=n;y++){
                z=mm[x][y];
                while(z>0){
                    z=z/10;
                    c++;
                }
                if(c==1)
                    printf("0%d ",mm[x][y]);
                else
                    printf("%d ",mm[x][y]);
                if(y%n==0)
                    printf("\n");
                c=0;
            }
        }
        return 0;
}
