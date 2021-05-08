/*int main()
{
    char a[100], b[100];
    printf("Enter two String : ");
    gets(a);
    gets(b);
    if(check_anagram(a,b))
        printf("Strings are Anagram\n");
    else
        printf("Strings are not Anagram\n");
    return 0;
}
int check_anagram(char a[], char b[])
{
    char first[100] = {0}, second[100] = {0}, c=0;
    while(a[c] != '\0'){
        first[a[c]-'a']++;
        c++;
    }
    c=0;
    while(b[c] != '\0'){
        second[a[c]- 'a']++;
        c++;
    }
    for(c=0;c<26;c++){
        if(first[c] != second[c])
            return 0;
    }
    return 1;
}*/
/*int main()
{
    char a[100], b[100];
    printf("Enter two String : ");
    gets(a);
    gets(b);
    if(check_anagram(a,b))
        printf("Strings are Anagram\n");
    else
        printf("Strings are not Anagram\n");
    return 0;
}
int check_anagram(char a[], char b[])
{
    char first[100] = {0}, second[100] = {0}, c=0;
    while(a[c] != '\0'){
        first[a[c]-'a']++;
        c++;
    }
    c=0;
    while(b[c] != '\0'){
        second[a[c]- 'a']++;
        c++;
    }
    for(c=0;c<26;c++){
        if(first[c] != second[c])
            return 0;
    }
    return 1;
}*/

int main()
{
    //char str[] = {"cat","dog","tac","god","act"};
    char str[50];
    printf("Enter the String : " );
    gets(str);
    int begin,middle,end,length=0;
    int c=0,i,l;
    l = strlen(str);
    for(i=0; i<l; i++){
        if(str != ' '){
            c=1;
            ch = str.tochar();
            end=l-1;
            middle=l/2;
            for(begin=0; begin<middle; begin++){
                if(str[begin]!=str[end]){
                    break;
                }
                end--;
            }
            if(begin==middle){
            printf("String pair of Anagram : %s", str);
            }
            c++;
        }
    }
    printf("Number of pair of anagram String are : %d\n", (c+1));
    return 0;
}
