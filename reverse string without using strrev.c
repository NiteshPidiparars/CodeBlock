char *strrev(char *str)
{
    char *p1,*p2;
    if(!str||!*str)//Check null
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
    char array[100];
    printf("Enter the string: \n");
    gets(array);
    strrev(array);
    printf("Reverse string is: %s\n",array);
    return 0;
}
