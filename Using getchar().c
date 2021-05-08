#include<stdio.h>
int main()
{
    int f,c;
    char line[4096];
    printf("Do you have a fever?y/n\n");
    f=get_answer();
    printf("Do you have a running nose or cough?y/n\n");
    c=get_answer();
    printf("Here are the result you input: \n");
    printf("Do you have a fever? %c\n",f);
    prntf("Do you have a nose or cough? %c\n",c);
    getch();
}
 int get_answer()
{
    int c;
    int answer=0;
    while((c=getchar())!=EOF && c!='\n')
        {
        if(answer==0 && (c=='y'|| c=='n'))
            answer=c;
    }
    return answer;
}
