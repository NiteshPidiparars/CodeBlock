int main()
{
    char str[50];
    int big,end,mid,len=0;
    printf("Enter the string: \n");
    gets(str);
    while(str[len]!='\0'){
        len++;
    }
    mid=len/2;
    end=len-1;
    for(big=0;big<mid;big++){
        if(str[big]!=str[end]){
            printf("Not Palindrome.\n");
            break;
        }
        end--;
    }
    if(big==mid)
        printf("Palindrome.\n");
    return 0;
}
