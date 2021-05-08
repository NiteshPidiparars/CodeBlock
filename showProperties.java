class showProperties
{
    public static void main(String[]args)
    {
        //System.getProperties().list(System.out);
        //System.getProperty("os.version");
         Properties pro = System.getProperties();
         for(Object obj : pro.keySet()){
         System.out.println(" System  "+(String)obj+"     :  "+System.getProperty((String)obj));
         }
    }
}
