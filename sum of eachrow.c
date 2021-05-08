int main()
{
    int a[10][10],i,j,m,n,sum=0;
    printf("Enter the number of row and column: \n");
    scanf("%d%d",&m,&n);
    printf("Enter the matrix:\n");
    for(i=0;i<m;i++)
        for(j=0;j<n;j++)
        scanf("%d",&a[i][j]);
    for(i=0;i<m;i++){
            for(j=0;j<n;j++){
        sum=sum+a[i][j];
            }
    printf("\nSum of %d row : %d\n",i+1,sum);
    sum=0;
    }
    return 0;
}
