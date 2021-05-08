int main()
{
    int a,b;
    int *ptra,*ptrb;
    int *temp;
    printf("Enter two pointer: ");
    scanf("%d%d",&a,&b);
    ptra=&a;
    ptrb=&b;
    temp=*ptra;
    *ptra=*ptrb;
    *ptrb=temp;
    printf("Swapping is a=%d and b=%d ",a,b);
    return 0;
}
