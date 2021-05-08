int main()
{
    int i,j,k,d;
    for(i=1;i<=9;i+=2){
        for(j=1,k=i;j<=9;j+=2,k+=2){
                if(j>=1||j<=5){
                    printf("%d ",k);

            }
                else
                {
                    printf(" ");

                }
        }
        printf("\n");

    }
}
