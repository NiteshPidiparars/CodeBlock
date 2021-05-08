int main()
{
    int a[10][10],b[10][10],i,j,m,n;
    printf("Enter the number of row and column: \n");
    scanf("%d%d",&m,&n);
    printf("Enter the matrix: \n");
    for(i=0;i<m;i++)
        for(j=0;j<n;j++)
        scanf("%d",&a[i][j]);
     for(i=0;i<m;i++)
        for(j=0;j<n;j++){
            b[j][i]=a[i][j];
        }
        printf("Transpose matrix: \n");
        for(i=0;i<m;i++){
          for(j=0;j<n;j++){
            printf("%d\t",b[i][j]);
          }
          printf("\n");
        }
         for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                    if(a[i][j]!=b[i][j]){
                        printf("\nMatrix is not a Symmetric\n");
                        exit(0);
                    }
            }
    }
    printf("\nMatrix is a Symmetric\n");
}
