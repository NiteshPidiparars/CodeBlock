int main()
{
    int x,y,m,i;
    printf("Enter the numbers: ");
    scanf("%d%d",&x,&y);
    if(x>y)
        m=y;
    else
        m=x;
        for(i=m;i>=0;i--){
            if(x%i==0 && y%i==0){
                printf("GCD number is: %d",i);
                break;
        }
    }
    return 0;
}
