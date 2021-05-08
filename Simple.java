import java.util.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.io.*;
import java.util.Iterator;
import java.util.Collection;
class Student
{
    String name;
    int age,rollno;
    Student(int rollno,String name,int age)
    {
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }
}
class AgeComparator implements Comparator
{
    public int compare(Object o1,Object o2)
    {
        Student s1=(Student)o1;
        Student s2=(Student)o2;
        if(s1.age==s2.age)
            return 0;
        else if(s1.age>s2.age)
            return 1;
        else
            return -1;
    }
}
class NameComparator implements Comparator
{
    public int compare(Object o1,Object o2)
    {
        Student s1=(Student)o1;
        Student s2=(Student)o2;
        return s1.name.compareTo(s2.name);
    }
}
class Simple
{
    public static void main(String[]args)
    {
        ArrayList<Student> al=new ArrayList<Student>();
        al.add(new Student(111,"Raj",23));
        al.add(new Student(131,"Ajay",21));
        al.add(new Student(121,"Ni",20));
        System.out.println("Sorting by Name: ");
        Collections.sort(al,new NameComparator());
        Iterator it=al.iterator();
        while(it.hasNext()){
            Student s=(Student)it.next();
            System.out.println(s.rollno+" "+s.name+" "+s.age);
        }
        System.out.println("Sorting by Age: ");
        Collections.sort(al,new AgeComparator());
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            Student str=(Student)itr.next();
            System.out.println(str.rollno+" "+str.name+" "+str.age);
        }
    }
}
