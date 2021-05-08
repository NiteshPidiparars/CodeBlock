int main()
{
    int a[2][2],i,j,det;
    printf("Enter the matrix: \n");
    for(i=0;i<2;i++)
        for(j=0;j<2;j++)
        scanf("%d",&a[i][j]);
    printf("\nThe matrix is\n");
      for(i=0;i<2;i++){
        for(j=0;j<2;j++)
        printf("%d\t",a[i][j]);
      }
      det=a[0][0]*a[1][1]-a[1][0]*a[0][1];
      printf("\nDeterminant of 2*2 is %d",det);
      return 0;
}
