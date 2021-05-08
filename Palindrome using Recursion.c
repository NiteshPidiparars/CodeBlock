int main()
{
    int num,sum;
    printf("Enter the number: \n");
    scanf("%d",&num);
    sum=isPalindrome(num);
    if(num==sum)
        printf("%d is palindrome",num);
    else
        printf("%d is not palindrome",num);
    return 0;
}
int isPalindrome(int num)
{
    static int r,sum=0;
    if(num>0){
        r=num%10;
        sum=sum*10+r;
        isPalindrome(num/10);
    }
    return sum;
}
