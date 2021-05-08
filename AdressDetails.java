class AdressDetails
{
    int flatno;
    String blgd;
    String city;
    AdressDetails(int flatno,String blgd)
    {
        this.flatno=flatno;
        this.blgd=blgd;
    }
    AdressDetails(int flatno,String blgd,String city)
    {
        this(flatno,blgd);
        this.city=city;
    }
    void display()
    {
        System.out.println(flatno+""+blgd+""+city);
    }
    public static void main(String[]args)
    {
        AdressDetails c1=new AdressDetails(01," abc ");
        AdressDetails c2=new AdressDetails(02," bld"," mumbai");
        c1.display();
        c2.display();
    }
}
