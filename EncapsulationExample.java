class EncapsulationExample
{
    private String manufacture;
    private String Operating_System;
    public String model;
    private int cost;
    EncapsulationExample(String manufac,String OperatingSys,String mod,int cst)
    {
        this.manufacture=manufac;
        this.Operating_System=OperatingSys;
        this.model=mod;
        this.cost=cst;
    }
    public String getmodel()
    {
        return this.model;
    }
    public String getmanufacture()
    {
        return this.manufacture;
    }
    public String getOperating_System()
    {
        return this.Operating_System;
    }
    public int getcost()
    {
        return this.cost;
    }
    public static void main(String[]args)
    {
        EncapsulationExample en=new EncapsulationExample("Microsoft","Windows","2007",5000);
        System.out.println("Manufacture: "+en.getmanufacture());
        System.out.println("OS: "+en.getOperating_System());
        System.out.println("Model: "+en.getmodel());
        System.out.println("Cost: "+en.getcost());
    }
}
