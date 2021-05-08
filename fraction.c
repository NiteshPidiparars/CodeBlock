int main()
{
     double s=0,i,n;
    printf("Enter the number: \n");
    scanf("%lf",&n);
    for(i=1;i<=n;i++){
        s=s+(1/i);
        if(i==1){
            printf("1+ ");
        }
        else if(i==n)
        {
            printf("(1/%1f)",i);
        }else{
            printf("(1/%1f)+ ",i);
        }
    }
    printf("\nSum of series is : %.2lf\n",s);
    return 0;
}
