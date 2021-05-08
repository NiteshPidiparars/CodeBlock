import java.io.*;
class Employee implements java.io.Serializable
{
    public String name;
    public String address;
    public transient long id;
    public long number;
}
public class SerializeDemo
{
    public static void main(String[]args)throws IOException
    {
        Employee e=new Employee();
        e.name="Nitesh nk";
        e.address="28/4 Dabri Pitha Ujjain(M,p)";
        e.id=0714161040;
        e.number=8109;
        try{
        FileOutputStream fout=new FileOutputStream("employee.txt");
        ObjectOutputStream bout=new ObjectOutputStream(fout);
        bout.writeObject(e);
        bout.close();
        fout.close();
        System.out.println("Serialize data is saved in/employee.ser");
        }catch(IOException i){
        i.printStackTrace();
        }
    }
}
