int main()
{
    int a[10][10],i,j,r,c,flag=1;
    printf("Enter the dimension of matrix: \n");
    scanf("%d%d",&r,&c);
    printf("Enter the Elements of matrix: \n");
    for(i=0;i<r;i++)
        for(j=0;j<c;j++)
        scanf("%d",&a[i][j]);
    printf("MATRIX IS: \n");
    for(i=0;i<r;i++){
        for(j=0;j<c;j++){
        printf("%d ",a[i][j]);
        }
        printf("\n");
    }
    for(i=0;i<r;i++){
        for(j=0;j<c;j++){
            if(a[i][j]!=1 && a[j][i]!=0){
                flag=0;
                break;
            }
        }
    }
    if(flag==1)
        printf("its a identity matrix.");
    else
        printf("its not identity matrix.");
}
