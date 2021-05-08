import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;
public class Client {
    public Client(){}
    public static void main(String[]args){/*
        if(System.getSecurityManager() == null){
            System.setSecurityManager(new SecurityManager());
        }*/
        try{
            Registry registry = LocateRegistry.getRegistry("DESKTOP-N9QLGBV");
            Hello stub = (Hello) registry.lookup("Hello");
            List<Student> list = stub.getStudent();
            for(Student s : list){
                System.out.println("ID : "+s.getId());
                System.out.println("Name : "+s.getName());
                System.out.println("Branch : "+s.getBranch());
                System.out.println("Percentage : "+s.getPercent());
                System.out.println("Email : "+s.getEmail());
        }
        }catch(Exception e){
            System.out.println("Client Exception : "+e.toString());
        }
    }
}
