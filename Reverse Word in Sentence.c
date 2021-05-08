#include<stdio.h>
int main()
{
    char *text=(char*)malloc(100*sizeof(char));
    char *temp=(char*)malloc(10*sizeof(char));
    printf("Enter the line of text(length<100 and word length<10): \n");
    gets(text);
    int ctr=0;
    int words=1;
    int row=0;
    while(text[ctr]!='\0')
    if(text[ctr]==' '){
        words++;
    }
    char **word=(char**)malloc(words*sizeof(char));
    for(row=0;row<words;row++)
        word[row]=(char*)malloc(10*sizeof(char));
        int len=0;
        row=0;
        while(len<strlen(text)){
            Sscanf(text+len,"%s",temp);
            strcpy(word[row++],temp);
            len=(int)(len+strlen(temp)+1);
        }
        char *swaptemp=(char*)malloc(10*sizeof(char));
        for(row=0;row<words/2;row++){
            strcpy(swaptemp,word[row]);
            strcpy(word[row],word[words-row-1]);
            strcpy(word[words-row-1],swaptemp);
        }
            strcpy(text," ");
            for(row=0;row<words;row++){
                strcat(text,word[row]);
                strcat(text," ");
            }
            printf("%s",text);
}
