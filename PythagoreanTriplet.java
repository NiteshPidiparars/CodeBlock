class PythagoreanTriplet
{
    public static void main(String[]args)
    {
        int a,b;
        for(a=1;a<=50;a++){
            for(b=1;b<=50;b++){
                int cSquare=a*a+b*b;
                double croot=Math.sqrt(cSquare);
                if(croot==Math.ceil(croot))
                    System.out.println(a+" "+b+" "+(int)croot);
            }
        }
    }
}
