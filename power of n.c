int main()
{
    int base,exp;
    printf("Enter the base: \n");
    scanf("%d",&base);
    printf("Enter the number of power(positive number): \n");
    scanf("%d",&exp);
    printf("%d * %d= %d\n",base,exp,power(base,exp));
    return 0;
}
int power(int base,int exp)
{
    if(exp!=1)
    {
        return (base * power(base,exp-1));
    }
}
