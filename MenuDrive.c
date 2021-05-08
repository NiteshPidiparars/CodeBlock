int main()
{
    int n,i,ch;
    long int fact;
    while(1)
    {
        printf("\nMAIN MENU\n");
        printf("1.factorial\n");
        printf("2.prime\n");
        printf("3.Even-Odd\n");
        printf("4.Exit\n");
        printf("Enter the choice: \n");
        scanf("%d",&ch);
        switch(ch)
        {
        case 1:
            printf("\nEnter the number: \n");
            scanf("%d",&n);
            fact=1;
            for(i=1;i<=n;i++){
                fact=fact*i;
            }
            printf("factorial number is: %d\n",fact);
            break;
        case 2:
            printf("\nEnter the number: \n");
            scanf("%d",&n);
            for(i=2;i<=n;i++){
            if(i%n==0){
                printf("%d number is not a prime\n",n);
               exit(0);
              }
            }
            if(i==n){
                printf("%d number is a prime\n",n);
            }
            break;
        case 3:
            printf("\nEnter the number: \n");
            scanf("%d",&n);
            if(i%2==0)
                printf("Even\n");
            else
                printf("Odd\n");
            break;
        case 4:
            exit(0);
        }
    }
    return 0;
}
