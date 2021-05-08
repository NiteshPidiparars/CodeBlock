class Jumble
{
    public static void main(String[]args)
    {
        String s="HOPE";
        int i,j,k,l;
        char a,b,c,d;
        for(i=0;i<4;i++){
            for(j=0;j<4;j++){
                for(k=0;k<4;k++){
                    for(l=0;l<4;l++){
                        a=s.charAt(i);
                        b=s.charAt(j);
                        c=s.charAt(k);
                        d=s.charAt(l);
                        if(a!=b && a!=c && a!=d && b!=c && b!=d && c!=d){
                            System.out.println(""+a+b+c+d);
                        }
                    }
                }
            }
        }
    }
}
