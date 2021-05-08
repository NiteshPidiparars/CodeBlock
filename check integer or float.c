int main()
{
    int flag=0,length;
    char num[10];
    printf("Enter the number: \n");
    scanf("%s",&num);
    length=strlen(num);
    while(length--){
        if(num[length]=='.'){
            flag=1;
            break;
        }
    }
    if(flag){
        printf("Entered number is float\n");
        }else{
            printf("Entered number is integer\n");
    }
    return 0;
}
