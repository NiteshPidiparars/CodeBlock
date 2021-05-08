import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Comparator;
import java.lang.*;
import java.io.*;
import java.util.Collections;
class Student
{
    int Age;
    String Name;
    public Student(int Age,String Name)
    {
        this.Age=Age;
        this.Name=Name;
    }
    public String getName()
    {
        return Name;
    }
    public void setName(String Name)
    {
        this.Name=Name;
    }
    public int getAge()
    {
        return Age;
    }
    public void setAge(Integer Age)
    {
        this.Age=Age;
    }
    public String toString()
    {
        return "Customer{ "+" Name= "+Name+" Age= "+Age+"}";
    }
     static class CustomerSortingComparator implements Comparator
    {
        public int compare(Student customer1,Student customer2)
        {
            int NameCompare=customer1.getName().compareTo(customer2.getName());
            int AgeCompare=customer1.getAge().compareTo(customer2.getAge());
            if(NameCompare==0)
            {
              return ((AgeCompare==0)?NameCompare:AgeCompare);
            }
            else{
                return NameCompare;
            }
        }
    }
    public static void main(String[]args)
    {
        List<Student>al=new ArrayList<>();
        Student s1=new Student("Ajay",23);
        Student s2=new Student("Sneha",28);
        Student s3=new Student("Simran",21);
        Student s4=new Student("Ajay",20);
        Student s5=new Student("Ajay",27);
        Student s6=new Student("Sneha",19);
        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.add(s4);
        al.add(s5);
        al.add(s6);
        Iterator<Student> it=al.iterator();
        System.out.println("Before sorting: ");
        while(it.hasNext()){
            System.out.println(it.next());
        }
        Collections.sort(al,new CustomerSortingComparator());
        System.out.println("After Sorting: ");
        for(Student customer: al){
            System.out.println(customer);
        }
    }
}

