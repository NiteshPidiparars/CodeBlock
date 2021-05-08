/*With Using Predefine function*/
int main()
{
    char s[20];
    int i;
    printf("Enter a String : ");
    gets(s); //s == &s[0];
    i = strlen(s);
    printf("Length is : %d",i);
    getch();
}

