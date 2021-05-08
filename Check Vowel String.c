int count_Vowel(char a[]);
int check_Vowel(char a);
int main()
{
    char array[1000];
    int c;
    printf("Enter the string: \n");
    gets(array);
    c=count_Vowel(array);
    printf("Number of Vowel is %s: %d\n",array,c);
    return 0;
}
int count_Vowel(char a[])
{
    int count=0,c=0,flag;
    char d;
    do{
        d=a[c];
        flag=check_Vowel(d);
        if(flag==1)
            count++;
        c++;
    }while(d!='\0');
    return count;
}
int check_Vowel(char a)
{
    if(a>='A'&&a<='Z'){
        a=a+'a'-'A';//convert into lower case
    }
    if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
        return 1;
    return 0;
}
