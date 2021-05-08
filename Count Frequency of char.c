int main()
{
    char s[50];
    int c=0,count[26]={0};
    printf("Enter the string: \n");
    gets(s);
    while(s[c]!='\0'){
        if(s[c]>='a'&&s[c]<='z')
            count[s[c]-'a']++;
        c++;
    }
    for(c=0;c<26;c++){
        if(count[c]!=0)
            printf("%c occur %d time in the string\n",c+'a',count[c]);
    }
    return 0;
}
