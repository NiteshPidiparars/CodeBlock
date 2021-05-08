int main()
{
    int n,result;
    printf("Enter the number: \n");
    scanf("%d",&n);
    result=add_digits(n);
    printf("Sum of digits is %d\n",result);
    return 0;
}
int add_digits(int n)
{
  int sum=0;
  if(n==0)
  {
      return 0;
  }
  sum=n%10+add_digits(n/10);
  return sum;
}
