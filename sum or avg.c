int main()
{
    int a[10],n,i,pn=0,nn=0;
    float total=0.0,average;
    printf("Enter the value of n: \n");
    scanf("%d",&n);
    printf("Enter the number: \n");
    for(i=0;i<n;i++)
        scanf("%d",&a[i]);
    printf("Numbers is: \n");
    for(i=0;i<n;i++){
        printf(" %d\t",a[i]);
    }
    for(i=0;i<n;i++){
        if(a[i]<0){
            nn=nn+a[i];
        }
            else if(a[i]>0){
              pn=pn+a[i];
            }
              else if(a[i]==0){;}
              total= total+a[i];
            }
            average=total/n;
            printf("\nSum of negative numbers: %d",nn);
            printf("\nSum of positive number: %d",pn);
            printf("\nSum of average number: %d\n",average);
            return 0;
}
