int main()
{
    int m,n,c,p,q,d,k,sum=0;
    int a[10][10],b[10][10],mul[10][10];
    printf("Enter the no. of row and column of first matrix: \n");
    scanf("%d%d",&m,&n);
    printf("Enter the first matrix: \n");
        for(c=0;c<m;c++)
          for(d=0;d<n;d++)
        scanf("%d",&a[c][d]);
    printf("Enter the nu. of rows and column of second matrix: \n");
     scanf("%d%d",&p,&q);
    if(n!=p)
        printf("Entered with order can't be multiplied with each other \n");
    else{
         printf("Enter the second matrix: \n");
         for(c=0;c<p;c++)
           for(d=0;d<q;d++)
            scanf("%d",&b[c][d]);
            for(c=0;c<m;c++){
                for(d=0;d<q;d++){
                    for(k=0;k<p;k++){
                        sum=sum+a[c][k]*b[k][d];
                    }
                    mul[c][d]=sum;
                    sum=0;
                }
            }
            printf("\nproduct of matrix is:\n");
            for(c=0;c<m;c++){
                for(d=0;d<q;d++)
                    printf(" %d\t",mul[c][d]);
                printf("\n");
            }
    }
    return 0;
}
