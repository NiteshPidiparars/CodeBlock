int func(int a,int b)
{
    printf("a= %d\n",a);
    printf("b= %d\n",b);
    return 0;
}
int main()
{
    int (*fptr)(int,int);
    fptr=func;
    func(2,3);
    fptr(2,3);
}
