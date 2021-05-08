int main()
{
    char str1[50],str2[50];
    int compare;
    printf("Enter the first string: \n");
    gets(str1);
    printf("Enter the second string: \n");
    gets(str2);
    compare=StringCompare(str1,str2);
    if(compare==1)
        printf("String are equals");
    else
        printf("String are not equals");
    return 0;
}
int StringCompare(char str1[],char str2[])
{
    int i=0,flag=0;
    while(str1[i]!='\0'&&str2[i]!='\0'){
        if(str1[i]!=str2[i]){
            flag=1;
            break;
        }
        i++;
    }
    if(flag==0&&str1[i]==0&&str2[i]==0)
        return 1;
    else
        return 0;
}
