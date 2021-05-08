int main()
{
    char a[50],b[50];
    printf("Enter the string: ");
    gets(a);
    printf("Enter the string: ");
    gets(b);
    strcat(a,b);
    printf("string obtained on Concatenation is %s\n",a);
    return 0;
}
