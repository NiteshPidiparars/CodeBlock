import java.io.*;
class Demo implements java.io.Serializable
{
    public int a;
    public String b;
    public Demo(int a,String b)
    {
        this.a=a;
        this.b=b;
    }
}
class TextDemo
{
    public static void main(String[]args)
    {
        Demo object=new Demo(1,"geekforgeeks");
        String fileName="file.ser";
        try
        {
            FileOutputStream file=new FileOutputStream(fileName);
            ObjectOutputStream out=new ObjectOutputStream(file);
            out.writeObject(object);
            out.close();
            file.close();
            System.out.println("Object is Serialized");
        }
        catch(IOException e)
        {
            System.out.println("IOException is caught");
        }
        Demo object1=null;
        try
        {
            FileInputStream file=new FileInputStream(fileName);
            ObjectInputStream in=new ObjectInputStream(file);
            object1=(Demo)in.readObject();
            in.close();
            file.close();
            System.out.println("Object has been DeSerialized");
            System.out.println("a= "+object1.a);
            System.out.println("b= "+object1.b);
        }
        catch(IOException e)
        {
            System.out.println("IOException is caught");
        }
        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }
    }
}
