int anagram(char a[],char b[]);
int main()
{
    char a[20],b[20];
    int flag;
    printf("Enter the first string : ");
    gets(a);
    printf("Enter the second string: ");
    gets(b);
    flag=anagram(a,b);
    if(flag==1)
        printf("\n%s and %s are anagram: ",a,b);
    else
       printf("\n%s and %s are not anagram: ",a,b);
}
int anagram(char a[],char b[])
{
    int f[26],s[26],c=0;
    while(a[c]!='\0')
    {
        f[a[c]-'a']++;
        c++;
    }
    c=0;
    while(b[c]!='\0')
    {
         s[b[c]-'a']++;
        c++;
    }
    for(c=0;c<26;c++)
    {
        if(f[c]!=s[c])
            return 0;
    }
    return 1;
}
