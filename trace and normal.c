int main()
{
    static int a[10][10];
    int i,j,m,n,s=0,s1=0,b=0,norm;
    printf("Enter the number of matrix: \n");
    scanf("%d%d",&m,&n);
    printf("Enter the co-efficient of matrix: \n");
    for(i=0;i<m;i++){
        for(j=0;j<n;j++){
        scanf("%d",&a[i][j]);
    b=a[i][j]*a[i][j];
    s1=s1+b;
        }
    }
    norm=sqrt((double)s1);
    printf("the normal of given matrix= %d\n",norm);
    for(i=0;i<m;i++){
        s=s+a[i][i];
    }
    printf("the trace of matrix= %d\n",s);
    return 0;
}
