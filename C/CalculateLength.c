/* Without Using Predefine function
int main()
{
    char s[20];
    int i;
    printf("Enter a String : ");
    gets(s); //s == &s[0];
    for(i=0;s[i]!='\0';i++);
        printf("Length is : %d",i);
    getch();
} */

/* With Using Predefine function */
/* int strlen(char*) */
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
