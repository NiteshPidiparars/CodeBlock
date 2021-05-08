int main()
{
    int i,j,n;
    char str[10][10],temp[10];
    printf("Enter the number to be sort: \n");
    scanf("%d",&n);
    printf("Enter the String: \n");
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
        printf("\nSorted string is: ");
        for(i=0;i<=n;i++){
            puts(str[i]);
        }
        return 0;
}
