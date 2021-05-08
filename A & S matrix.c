int main()
{
    int a[10][10],b[10][10],sum[10][10],mul[10][10],i,j,m,n;
    printf("Enter the number of matrix: ");
    scanf("%d%d",&m,&n);
    printf("Enter the first matrix: ");
    for(i=0;i<m;i++)
        for(j=0;j<n;j++)
        scanf("%d",&a[i][j]);
    printf("Enter the second matrix: ");
    for(i=0;i<m;i++)
        for(j=0;j<n;j++)
        scanf("%d",&b[i][j]);
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                     sum[i][j]=a[i][j]+b[i][j];
           printf("sum of matrix: %d",sum[i][j]);
        printf("\n");
            }
        }
         for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                    mul[i][j]=a[i][j]-b[i][j];
            printf("mul of matrix is: %d",&mul[i][j]);
            printf("\n");
            }
        }
}
