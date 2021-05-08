int main()
{
    char str[50];
    int i;
    printf("Enter the string: \n");
    gets(str);
    for(i=0;i<strlen(str);i++){
        if(str[i]>='A'&&str[i]<='Z'){
            str[i]=(char)(str[i]+32);
        }
    }
    printf("Converted into LowerCase is: %s",str);
    return 0;
}
