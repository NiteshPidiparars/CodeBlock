main()
{
    int d,a[10][10],i,j,k;
    printf("Enter the order of determinant:\n");
    scanf("%d",&k);
    if(k>10)
        exit(0);
        printf("Enter the determinant of order:\n");
        for(i=0;i<=k-1;i++)
            for(j=0;j<=k-1;j++)
            scanf("%d",&a[i][j]);
        d=determinant(a,k);
        printf("Determinant is %d",d);
        getch();
}
int determinant(int a[10][10],int k)
{
    int det,b[10][10],s=1,c,i,j,m,n;
    if(k==1)
        return(a[0][0]);
    else{
        det=0;
        for(c=0;c<=k-1;c++){
           m=0;n=0;
            for(i=0;i<=k;i++){
                for(j=0;j<=k;j++){
                     b[i][j]=0;
                     if(i!=0&&j!=c){
                        b[m][n]=a[i][j];
                        if(n<(k-2))
                            n++;
                            else{
                                n=0;
                                m++;
                            }
                        }
                     }
                }
                det=det+s*(a[0][c]*determinant(b,k-1));
                s=-1*s;
            }
        }
        return(det);
}
