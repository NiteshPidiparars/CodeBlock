main()
{
    int i,j;
    printf("Enter the number: ");
    scanf("%d",&i);
    while(i!=0)
    {
        j=i%2;
        printf("%d ",j);
        i=i/2;
    }
  }

