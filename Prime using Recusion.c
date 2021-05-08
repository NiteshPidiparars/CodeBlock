int main()
{
    int prime,num;
    printf("Enter the number: \n");
    scanf("%d",&num);
    prime=isPrime(num,num/2);
    if(prime==1)
        printf("%d number is prime ",num);
    else
        printf("%d number is not prime ",num);
    return 0;
}
int isPrime(int num,int i)
{
    if(i==1)
    {
        return 1;
    }else{
       if(num%i==0)
        return 0;
     else
        return(num,i-1);
    }
}
