int main()
{
    char str[20];
    int l,i;
    printf("Enter the string: \n");
    gets(str);
    l=strlen(str);
    for(i=0;i<l;i++){
        if(str[i]>=65 && str[i]<=90){
            str[i]=(char)(str[i]+32);
        }
    }
    printf("String is LowerCase: %s\n",str);
    return 0;
}
