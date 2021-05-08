int main()
{
    int a[10][10],i,j,m,n,t[10][10];
    printf("Enter the value of matrix: \n");
    scanf("%d%d",&m,&n);
    printf("\nEnter the number: \n");
    for(i=0;i<m;i++)
        for(j=0;j<n;j++)
        scanf("%d",&a[i][j]);
    for(i=0;i<m;i++){
        for(j=0;j<n;j++){
                t[i][j]=a[i][j];
        }
    }
    printf("\nMATRIX IS: \n");
      for(i=0;i<n;i++){
        for(j=0;j<m;j++){
                printf(" %d\t",t[i][j]);
        }
        printf("\n");
      }
        return 0;
}
