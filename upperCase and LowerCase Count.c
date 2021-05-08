int main()
{
    int upper=0,lower=0;
    int i;
    char ch[50];
    printf("Enter the string: \n");
    gets(ch);
    i=0;
    while(ch[i]!='\0'){
        if(ch[i]>='A'&&ch[i]<='Z'){
            upper++;
        }
        if(ch[i]>='a'&&ch[i]<='z'){
            lower++;
        }
        i++;
    }
    printf("UpperCase Letter : %d\n",upper);
    printf("LowerCase Letter : %d\n",lower);
    return 0;
}
