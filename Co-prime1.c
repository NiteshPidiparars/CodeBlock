int main()
{
    int a=1,b,max,n,i;
    printf("Enter the number: \n");
    scanf("%d",&n);8
    while(n){
        for(b=2;b<a;b++){
                max=a<b?a:b;
            for(i=2;i<=max;i++){
                if(a%i==0&&b%i==0){
                    break;
                }
            }
            if(i==max+1){
                printf("\n(%d, %d)",a,b);
                n--;
                if(n==0)
                    exit(0);
            }
        }
        a++;
    }
}
