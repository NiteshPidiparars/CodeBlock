import java.util.*;
import java.util.ArrayList;
import java.lang.*;
import java.io.*;
class Student implements Comparable<Student>
{
    String name;
    int age,rollno;
    public Student(int rollno,String name,int age)
    {
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }
    public int compareTo(Student s)
    {
        if(age==s.age)
            return 0;
        else if(age>s.age)
            return 1;
        else
            return -1;
    }
}
class TextSort3
{
    public static void main(String[]args)
    {
        ArrayList<Student> al=new ArrayList<Student>();
        al.add(new Student(111,"Ajay",22));
        al.add(new Student(131,"Nil",21));
        al.add(new Student(121,"Hill",20));
        System.out.println("\nSorting by Age: ");
        Collections.sort(al);
        for(Student s: al){
            System.out.println(s.rollno+" "+s.name+" "+s.age);
        }
    }
}
