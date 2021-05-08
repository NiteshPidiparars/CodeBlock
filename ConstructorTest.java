class Student
{
    String Student_name;
    public Student(String Student_name)
    {
        this.Student_name=Student_name;
    }
    public String getStudentName()
    {
        return Student_name;
    }
}
class ConstructorTest
{
    public static void main(String[]args)
    {
        Student t=new Student("Jonny Deep");
        System.out.println(t.Student_name);
        System.out.println(t.getStudentName());
    }
}
