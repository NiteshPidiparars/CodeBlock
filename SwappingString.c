int main()
{
    char str1[20],str2[20],*temp;
    printf("Enter first string: \n");
    gets(str1);
    printf("Enter second string: \n");
    gets(str2);
    printf("\nBefore Swapping String are \n");
    printf("First string : %s\n",str1);
    printf("Second string : %s\n",str2);
    temp=(char*)malloc(100);
    strcpy(temp,str1);
    strcpy(str1,str2);
    strcpy(str2,temp);
    printf("\nAfter Swapping String are \n");
    printf("First string : %s\n",str1);
    printf("Second string : %s\n",str2);
}
