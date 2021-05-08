public class BoxExample
{
    private int length;
    private int breath;
    private int height;
    public void setDimension(int l,int b,int h)
    {
        length=l; breath=b; height=h;
    }
    public void showDimension()
    {
        System.out.println("Length : "+length);
        System.out.println("Breath : "+breath);
        System.out.println("Height : "+height);
    }
    public static void main(String[]args)
    {
        Box b = new Box();
        b.setDimension(15,10,5);
        b.showDimension();
    }
}
