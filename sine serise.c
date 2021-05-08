int main()
{
    int i,n;
    float x,val,sum,t;
    printf("Enter the value of x: ");
    scanf("%f",&x);
    printf("Enter the value of n: ");
    scanf("%d",&n);
    val=x;
    x=x*3.14159/180;
    t=x;
    sum=x;
    for(i=1;i<n+1;i++){
        t=(t*pow((double)(-1),(double)(2*i-1))*x*x)/(2*i*(2*i+1));
        sum=sum+t;
    }
    printf("sine value is %f is: %8.4f",val,sum);
    return 0;
}
