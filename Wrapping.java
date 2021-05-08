class Wrapping
{
    public static void main(String[]args)
    {
        byte b=3;
        int i=10;
        float f=4.5f;
        double d=90.7;
        //Data type to object Wrapping
        Byte b_obj=new Byte(b);
        Integer i_obj=new Integer(i);
        Float f_obj=new Float(f);
        Double d_obj=new Double(d);
        //printing the value of object
        System.out.println("Value of Wrapping Object: ");
        System.out.println("Byte object: "+b_obj);
        System.out.println("Integer object: "+i_obj);
        System.out.println("Float object: "+f_obj);
        System.out.println("Double object: "+d_obj);
        //object to data types(retriving data type from objects)-unwrapping
        byte bv=b_obj.byteValue();
        int iv=i_obj.intValue();
        float fv=f_obj.floatValue();
        double dv=d_obj.doubleValue();
        //printing the unwrapping value
        System.out.println("\nUnwrapping Values: ");
        System.out.println("byte value: "+bv);
        System.out.println("Int value: "+iv);
        System.out.println("float value: "+fv);
        System.out.println("double value: "+dv);
    }
}
