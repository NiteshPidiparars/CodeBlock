int main()
{
    int n,r=0,temp;
    printf("Enter the number: \n");
    scanf("%d",&n);
    temp=n;
    while(temp!=0){
        r=r*10;
        r=r+temp%10;
        r=r/10;
    }
    if(n==r)
        printf("number is palindrome number\n");
    else
        printf("number is not palindrome number\n");
    return 0;
}
