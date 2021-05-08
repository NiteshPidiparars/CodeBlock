int main()
{
    char s[50];
    int i;
    printf("Enter the string: \n");
    gets(s);
    for(i=0;s[i]!='\0';i++)
        printf("Length of String %d\n",i);
    return 0;
}
