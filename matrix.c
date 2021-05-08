main()
{
    int i,j,a[3][3],b[3][3],mul[3][3],n,sum[3][3];
    printf("Enter the number of matrix:");
    scanf("%d",&n);
    printf("Enter the first matrix: ");
    for(i=0;i<=2;i++)
    for(j=0;j<=2;j++)
     scanf("%d",&a[i][j]);
printf("Enter the second matrix: ");
    for(i=0;i<=2;i++)
       for(j=0;j<=2;j++)
     scanf("%d",&b[i][j]);
    printf("sum of the matrix: ");
    for(i=0;i<=2;i++){
        for(j=0;j<=2;j++){
    {
        sum[i][j]=a[i][j]+b[i][j];
        printf("%d ",sum[i][j]);
    }

}
           printf("\n");
 }
 for(i=0;i<=2;i++){
    for(j=0;j<=2;j++){
        mul[i][j]=a[i][j]*b[i][j];
        printf("%d ",mul[i][j]);
    }
 }
 printf("\n");
}
