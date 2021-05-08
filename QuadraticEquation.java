class QuadraticEquation
{
    public static void main(String[]args)
    {
        int a=2,b=6,c=4;
        double temp1=Math.sqrt(b*b-4*a*c);
        double r1=(-b+temp1)/(2*a);
        double r2=(-b-temp1)/(2*a);
        System.out.println("The Root of Quadratic Equation\"2x^2+6x+4=0\" are "+r1+" and "+r2);
    }
}
