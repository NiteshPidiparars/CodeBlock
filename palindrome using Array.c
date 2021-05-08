int main()
{
    char word[100];
    int length,counter;
    printf("Enter the string: \n");
    gets(word);
    length=strlen(word);
    int flag=1;
    for(counter=0;counter<length/2&&flag;counter++){
        if(word[counter]!=word[length-counter-1]){
            flag=0;
            break;
        }
    }
    if(flag)
        printf("%s is palindrome",word);
    else
        printf("%s is not palindrome");
}
