int main()
{
    int a[10][10],i,j,n,m,count=0;
    printf("Enter the order of matrix: \n");
    scanf("%d%d",&m,&n);
    printf("Enter the %d and %d Co-efficient are: \n",m,n);
    for(i=0;i<m;i++){
        for(j=0;j<n;j++){
        scanf("%d ",&a[i][j]);
    if(a[i][j]==0){
        count++;
       }
    }
}
    if(count>((m*n)/2)){
        printf("The given matrix is sparse matrix\n");
    }
    else
        printf("The given matrix is not sparse matrix\n");
    printf("There are %d number of Zero\n",count);
    return 0;
}
