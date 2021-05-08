#include<stdio.h>
#include<conio.h>
int main()
{
    char str[50],v[]="a,e,i,o,u";
    int i,j,count=0;
    printf("Enter a string : ");
    gets(str);
    for(i=0;str[i];i++){
        for(j=0;v[j];j++){
            if(str[i]==v[j]){
                count++;
                break;
            }
        }
    }
    printf("Total Vowel in %s is %d",str,count);
    getch();
}

