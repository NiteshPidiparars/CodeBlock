int main()
{
    char a[50],b[50],flag;
    printf("Enter the string: ");
    gets(a);
    printf("Enter the string: ");
    gets(b);
    flag=check_Anagram(a,b);
    if(flag==1)
        printf("\"%s\" and \"%s\" are anagram\n",a,b);
    else
        printf("\"%s\" and \"%s\" are not anagram\n",a,b);
    return 0;
}
int check_Anagram(char a[],char b[])
{
    int first[26]={0},second[26]={0},c=0;
    while(a[c]!='\0'){
        first[a[c]-'a']++;
        c++;
    }
    c=0;
    while(b[c]!='\0'){
        second[b[c]-'a']++;
        c++;
    }
    for(c=0;c<26;c++){
        if(first[c]!=second[c])
            return 0;
    }
    return 1;
}
