int main()
{
    char str[50],v[]={"aeiouAEIOU"};
    int i,j,count=0;
    printf("Enter the string: \n");
    gets(str);
    for(i=0;str[i]!='\0';i++){
        for(j=0;v[j]!='\0';j++){
            if(str[i]==v[j]){
                count++;
                break;
            }
        }
    }
    printf("Total vowel is %s count are %d",str,count);
    return 0;
}
