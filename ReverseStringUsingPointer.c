int main()
{
    char str_array[100],*ptr;
    int i,len;
    printf("Enter the string: \n");
    gets(str_array);
    len=strlen(str_array);
    for(i=0;i<100;i++){
        if(*ptr=='\0')
            break;
        ptr++;
    }
    len=i;
    ptr--;
    printf("Reverse string is: ");
    for(i=len;i>0;i--){
        printf("%c\n",*ptr--);
    }
    return 0;
}
