import java.util.*;
class AreaCalculator
{
    float l,b,h,ba,r,s,c;
    float result=0f;
    float PI=3.14f;
    int var;
    public static void main(String[]args)
    {
        AreaCalculator cal=new AreaCalculator();
        cal.options();
    }
    public void options()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter the object of which area to be calculate: \n1: Square\n2: Rectangle\n3: Triangle\n4: Circle\n5: Trapezoid\n6: Repeat\n7: Exit\n");
        var=sc.nextInt();
        Area al=new Area();
        if(var==1){
            System.out.println("\nEnter the Side of Square: ");
            s=sc.nextFloat();
            al.square(s);
            options();
        }
        else if(var==2){
            System.out.println("Enter the length of rectangle: ");
            l=sc.nextFloat();
            System.out.println("Enter the width of rectangle: ");
            b=sc.nextFloat();
            al.rectangle(l,b);
            options();
        }
        else if(var==3){
            System.out.println("Enter the height of triangle: ");
            h=sc.nextFloat();
            System.out.println("Enter the base of triangle: ");
            ba=sc.nextFloat();
            al.triangle(h,ba);
            options();
        }
        else if(var==4){
            System.out.println("Enter the radius of circle: ");
            r=sc.nextFloat();
            al.circle(r);
            options();
        }
        else if(var==5){
            System.out.println("Enter the A Side of trapezoid: ");
            b=sc.nextFloat();
            System.out.println("Enter the B Side of trapezoid: ");
            c=sc.nextFloat();
            System.out.println("Enter the Height of trapezoid: ");
            h=sc.nextFloat();
            al.trapezoid(b,c,h);
            options();
        }
    }
}
class Area
{
    public void square(float s)
    {
        float result=0f;
              result=s*s;
              System.out.println("The Area of Square is: "+result);
    }
    public void rectangle(float l,float b)
    {
        float result=0f;
              result=l*b;
              System.out.println("The Area of Rectangle is: "+result);
    }
    public void triangle(float h,float ba)
    {
        float result=0f;
              result=0.5f*h*ba;
              System.out.println("The Area of Triangle is: "+result);
    }
    public void circle(float r)
    {
        float result=0f;
              result=3014f*r*r;
              System.out.println("The Area of Circle is: "+result);
    }
    public void trapezoid(float h,float b,float c)
    {
        float result=0f;
              result=(((b+c)/2)*h);
              System.out.println("The Area of Trapezoid is: "+result);
    }
};
