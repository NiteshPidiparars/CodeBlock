char *strrev(char *str)
{
    char *p1,*p2;
    if(!str||!*str)
        return str;
    for(p1=str,p2=str+strlen(str)-1;p2>p1;++p1,--p2){
        *p1^=*p2;
        *p2^=*p1;
        *p1^=*p2;
    }
    return str;
}
int main()
{
    char a[100];
    printf("Enter the string to reverse: ");
    gets(a);
    strrev(a);
    printf("Reverse of Entered string is\n%s\n",a);
    return 0;
}
