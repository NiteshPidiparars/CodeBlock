int main()
{
    char str[50],rev[50];
    char *sptr=str;
    char *rptr=rev;
    int i=-1;
    printf("Enter the String: \n");
    scanf("%s",&str);
    while(*sptr)
    {
        sptr++;
        i++;
    }
    while(i>=0){
        sptr--;
        *rptr=*sptr;
        rptr++;
        --i;
    }
    *rptr='\0';
    printf("Reverse of String is: %s\n",rev);
    return 0;
}
