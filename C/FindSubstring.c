#include<stdio.h>
#include<conio.h>
int indexOfSubstring(char str[], char s[]);
int main()
{
    int index;
    index = indexOfSubstring("abababbbaabbababbbaa","aabb");
    if(index == -1)
        printf("Substring not found");
    else
        printf("Substring found at index %d",index);
    getch();
}
int indexOfSubstring(char str[], char s[])
{
    int i,j,k,l;
    l = strlen(s);
    for(i=0;str[i+l-1];i++){
        k = i;
        for(j=0;j<=l-1;j++){
            if(str[k] != s[j])
                break;
            k++;
        }
        if(j==l)
            return(i);
    }
    return(-1);
}
