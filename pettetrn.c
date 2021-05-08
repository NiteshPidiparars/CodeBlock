int main()
{
    int i,j,a,b,c,d;
    a=0;
    b=0;
    c=1;
    d=a+b+c;
    for(i=1;i<=4;i++){
        for(j=1;j<=4;j++){
            if(j<=i)
            {
                printf(" %d",a);
                a=b;
                b=c;
                c=d;
                d=a+b+c;
            }
            else
            {
                printf(" ");
            }
        }
        printf("\n");
    }
}
