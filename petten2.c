int main()
{
    int i,j,k,d;
        for(i=1,d=4;i<=5;i++,d=d+1){
            for(j=1,k=i;j<=5;j++,k+=d+1-2){
                if(j<=i){
                    printf(" %d",k);
                }
                else
                    printf(" ");
            }
            printf("\n");
    }
}
