/*Program to count number of employee working in a company*/
class Employee
{
    private int ID;
    private String name;
    private int age;
    private static int nextId = 1;
    //it is made static because it is keep common among all and share by all objects
    public Employee(String name, int age)
    {
        this.name = name;
        this.age = age;
        this.ID = nextId++;
    }
    public void show()
    {
        System.out.println("Id = "+ID+"\nName = "+name+"\nAge = "+age);
    }
    public void showNextId()
    {
        System.out.println("Next employee id will be = "+nextId);
    }
    protected void finalize()
    {
        --nextId;
        //In this case, gc will call finalize() for 2 times for 2 objects.
    }
}
//it is closing brace for employee class
public class UseEmployee
{
    public static void main(String[]args)
    {
        Employee e1 = new Employee("GFG1",56);
        Employee e2 = new Employee("GFG2",45);
        Employee e3 = new Employee("GFG3",25);
        e1.show();
        e2.show();
        e3.show();
        e1.showNextId();
        e2.showNextId();
        e3.showNextId();
        {
            //it is sub block to keep all those interns.
            Employee e4 = new Employee("GFG4",23);
            Employee e5 = new Employee("GFG5",21);
            e4.show();
            e5.show();
            e4.showNextId();
            e5.showNextId();
        //After countering this brace, e4 and e5 will be removed. Therefore, now it should show nextId as 4.
            e4 = e5 = null;
            System.gc();
            System.runFinalization();
        }
        e1.showNextId();
    }
}
