class Box
{
    double width;
    double height;
    double depth;
    Box(){ }
    Box(double w,double h,double d)
    {
        width=w;
        height=h;
        depth=d;
    }
    void getVolume()
    {
        System.out.println("Volume is: "+width*height*depth);
    }
}
class MatchBox extends Box
{
    double weight;
    MatchBox(){ }
    MatchBox(double w,double h,double d,double m)
    {
        super(w,h,d);
        weight=m;
    }
    public static void main(String[]args)
    {
        MatchBox m1=new MatchBox(10,20,30,40);
        m1.getVolume();
        System.out.println("width of MatchBox is: "+m1.width);
        System.out.println("height of MatchBox is: "+m1.height);
        System.out.println("depth of MatchBox is: "+m1.depth);
        System.out.println("weight of MatchBox is: "+m1.weight);
    }
}
