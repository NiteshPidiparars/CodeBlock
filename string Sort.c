int main()
{
    char str[20][20],temp[20];
    int i,j,n;
    printf("Enter the number of string to sort: \n");
    scanf("%d",&n);
    printf("Enter the string: \n");
    for(i=0;i<=n;i++)
        gets(str[i]);
    for(i=0;i<=n;i++)
    for(j=i+1;j<=n;j++){
        if(strcmp(str[i],str[j])>0){
            strcpy(temp,str[i]);
            strcpy(str[i],str[j]);
            strcpy(str[j],temp);
        }
    }
    printf("\nSorting String are: \n");
    for(i=0;i<=n;i++){
        puts(str[i]);
    }
    return 0;
}
