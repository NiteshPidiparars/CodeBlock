int main()
{
    char original[20],add[20];
    printf("Enter the first string: \n");
    gets(original);
    printf("Enter the second string: \n");
    gets(add);
    Concate_String(original,add);
    printf("String is After Concating is \"%s\"\n",original);
    return 0;
}
void Concate_String(char original[20],char add[20])
{
    while(*original)
        original++;
    while(*add){
        *original=*add;
        add++;
        original++;
    }
    *original='\0';
}
