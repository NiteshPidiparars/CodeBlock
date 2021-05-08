int main()
{
    int i,k;
    printf("Enter two integer: ");
    scanf("%d%d",&i,&k);
    i=i^k;
    k=i^k;
    i=i^k;
    printf("Swapping is i=%d and k=%d ",i,k);
    return 0;
}
