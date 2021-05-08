#include<stdio.h>
#include<conio.h>
#include<string.h>
char* remove_extra_spaces(char *s);
int count_words(char *s);
struct Word
{
    char word[20];
};
char* reverse(struct Word *ptr,char *s);
int main()
{
    char str[100];
    int no_of_words;
    struct Word *ptr;
    printf("Enter the string: \n");
    gets(str);
    strcpy(str,remove_extra_spaces(str));
    no_of_words=count_words(str);
    ptr=(struct Word*)calloc(no_of_words,sizeof(struct Word));
    strcpy(str,reverse(ptr,str));
    printf("\nString reverse is: \n %s",str);
    getch();
}
char* reverse(struct Word *ptr,char *s)
{
    char temp[20],*q;
    int j,i=0,k=0;
    while(*(s+i)){
        j=0;
        while(*(s+i)!=' '&&*(s+i)!='\0'){
            temp[j]=*(s+i);
            i++; j++;
        }
        if(*(s+i)==' ')
            i++;
        temp[j]='\0';
        strcpy(ptr[k].word,temp);
        k++;
    }
    q=(char*)malloc(strlen(s)+1);
    *(q+0)='\0';
    k--;
    while(k){
        strcat(q,ptr[k].word);
        strcat(q," ");
        k--;
    }
    strcat(q,ptr[0].word);
    return (q);
}
int count_words(char *s)
{
    int i=0,count=0;
    while(*(s+i)){
        if(*(s+i)==' ')
            count++;
        i++;
    }
    return(count+1);
}
char*remove_extra_spaces(char *s)
{
    char *p;
    int i=0,j=0;
    p=malloc(strlen(s)+1);
    while(*(s+i)){
        while(*(s+i)==' ')
            i++;
        while(*(s+i)!=' '&&*(s+i)!='\0'){
            *(p+j)=*(s+i);
            i++;j++;
        }
        if(*(s+i)=='\0'&&*(p+j-1)==' ')
            j--;
        *(p+j)=*(s+i);
        j++;
    }
    return(p);
}
