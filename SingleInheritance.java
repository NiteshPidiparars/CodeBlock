import java.io.*;
class Student
{
    private int roll_no;
    private String name;
    void get_data(int roll_no,String name)
    {
        this.roll_no=roll_no;
        this.name=name;
    }
    void display()
    {
        System.out.println("\nThe Student Details are: ");
        System.out.println("RollNo: "+roll_no);
        System.out.println("Name: "+name);
    }
}
class Marks extends Student
{
    private int mark1,mark2;
    Marks(int mark1,int mark2)
    {
        this.mark1=mark1;
        this.mark2=mark2;
    }
    void display_marks()
    {
        System.out.println("The Student Marks are: ");
        System.out.println("Marks1: "+mark1);
        System.out.println("Marks2: "+mark2);
        float avg;
        avg=(mark1+mark2)/2;
        System.out.println("Average of marks: "+avg);
    }
}
class SingleInheritance
{
    public static void main(String[]args)throws IOException
    {
        int roll_no,mark1,mark2;
        String name;
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the RollNo,number: ");
        roll_no=Integer.parseInt(bf.readLine());
        System.out.println("Enter the name: ");
        name=bf.readLine();
        System.out.println("Enter the Mark1: ");
        mark1=Integer.parseInt(bf.readLine());
        System.out.println("Enter the Mark2: ");
        mark2=Integer.parseInt(bf.readLine());
        Marks m=new Marks(mark1,mark2);
        m.get_data(roll_no,name);
        m.display();
        m.display_marks();
    }
}
