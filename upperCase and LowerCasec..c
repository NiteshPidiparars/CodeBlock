int main()
{
    char str[50];
    int i;
    printf("Enter the string: \n");
    gets(str);
    for(i=0;i<=strlen(str);i++){
            if(str[i]>65&&str[i]<90){
                str[i]=(char)(str[i]+32);
            }
    }
    printf("String in lowerCase is: %s",str);
    return 0;
}
