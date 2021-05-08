int main()
{
    char s1[50],s2[50];
    printf("Enter the string:\n");
    gets(s2);
    stringCopy(s1,s2);
    printf("Copy string are: %s",s1);
    return 0;
}
int stringCopy(char s1[],char s2[])
{
    int i=0;
    while(s2[i]!='\0'){
        s1[i]=s2[i];
        i++;
    }
    s1[i]='\0';
}
