#include<stdio.h>
#include<conio.h>
struct student
{
    int rollno;
    char name[20];
    int age;
};
struct student inputStudentData();
void showStudentData(struct student s);
main()
{
    struct student s1;
    s1 = inputStudentData();
    showStudentData(s1);
    getch();
}
struct student inputStudentData()
{
    struct student s;
    printf("Enter RollNo, Name and Age of Student : ");
    scanf("%d",&s.rollno);
    fflush(stdin);
    gets(s.name);
    scanf("%d",&s.age);
    return(s);
}
void showStudentData(struct student s)
{
    printf("\n----STUDENT DATA----\n");
    printf("RollNo : %d",s.rollno);
    printf("\nName : %s",s.name);
    printf("\nAge : %d",s.age);
}
