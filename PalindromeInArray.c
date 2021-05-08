int main()
{
    char word[50];
    int length,counter;
    printf("Enter the string: \n");
    gets(word);
    length=strlen(word);
    int flag=1;
    for(counter=0;counter<length/2;counter++){
        if(word[counter]!=word[length-counter-1]){
            flag=0;
            break;
        }
    }
    if(flag)
        printf("%s is Palindrome.\n",word);
    else
        printf("%s is not Palindrome.\n",word);
}
