int main()
{
    char str[30];
    int i;
    printf("Enter the string: \n");
    gets(str);
    for(i=0;str[i]!='\0';i++){
        printf("String length is: %d\n",i);
    }
    return 0;
}
