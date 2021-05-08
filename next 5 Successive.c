int main()
{
    int n;
    printf("Enter the number: ");
    scanf("%d",&n);
    successiveNum(n);
    return 0;
}
void successiveNum(int n)
{
    int temp;
    printf("Successive number from %d\n",n);
    for(temp=5;temp<n+5;temp++)
    printf("%d\n",temp);
}
