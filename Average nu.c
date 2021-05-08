int main()
{
    int n,count;
    float sum=0,x,avg;
    printf("Enter how many number: \n");
    scanf("%d",&n);
    for(count=1;count<=n;count++){
        printf("x= ");
        scanf("%f",&x);
        sum+=x;
    }
    avg=sum/n;
    printf("Average number is: %0.2f\n",avg);
    return 0;
}
