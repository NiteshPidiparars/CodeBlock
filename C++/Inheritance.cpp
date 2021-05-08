#include<iostream>
#include<string.h>
using namespace std;
class Person
{
private:
    char name[20];
    int age;
protected:
    void setName(char *n)
    {
        strcpy(name,n);
    }
    void setAge(int a)
    {
        age=a;
    }
public:
    char* getName()
    {
        return(name);
    }
    int getAge()
    {
        return(age);
    }
};
class Employee:public Person
{
private:
    float salary;
protected:
    void setSalary(float s)
    {
        salary=s;
    }
    float getSalary()
    {
        return(salary);
    }
public:
    void setEmployee(char *n, int a, float s)
    {
        setName(n);
        setAge(a);
        setSalary(s);
    }
    void showEmployee()
    {
        cout<<"\n"<<getName()<<" "<<getAge()<<" "<<getSalary();
    }
};
int main()
{
    Employee emp;
    emp.setEmployee("Rahul",34,45000.0);
    emp.showEmployee();
}
