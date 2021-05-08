import java.rmi.*;
interface FactInterface extends Remote
{
    public int fact(int a)throws Exception;
}
