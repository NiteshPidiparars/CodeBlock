int main()
{
    int i,j,k=1,row;
    printf("Enter the number : ");
    scanf("%d",&row);
    for(i=1; i<=row; i++)
    {
        for(j=1; j<=row; j++)
        {
            if(j<=i)
                printf("%3d",k++);
            else
                printf("  ");
        }
        printf("\n");
    }
}
