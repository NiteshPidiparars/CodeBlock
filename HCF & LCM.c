int main()
{
    int x,y,a,b,t,gcd,lcm;
    printf("Enter the numbers: ");
    scanf("%d%d",&x,&y);
    a=x;
    b=y;
    while(b!=0){
        t=b;
        b=a%b;
        a=t;
    }
    gcd=a;
    lcm=(x*y)/gcd;
    printf("Great common divisor is: "+gcd);
    printf("Least common multiple is: "+lcm);
}
