import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class ImplExample implements Hello {

    @Override
    public List<Student> getStudent() throws RemoteException {
        List<Student> list = new ArrayList<Student>();
        Connection con = null;
        Statement st = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Connecting to a Selected databases......");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","root");
            System.out.println("Connected Databases Successfully........");
            System.out.println("Creating Statement........");
            st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM student_data");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String branch = rs.getString("branch");
                int percent = rs.getInt("percent");
                String email = rs.getString("email");
                Student s = new Student();
                s.setId(id);
                s.setName(name);
                s.setBranch(branch);
                s.setPercent(percent);
                s.setEmail(email);
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
