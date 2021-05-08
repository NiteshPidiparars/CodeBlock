class AmazingPattern
{
    public static void main(String args[])
    {
        int pattern[][]={
            {0,0,0,0,0,0,0,0,0,0},
            {0,1,1,1,0,0,1,1,1,0},
            {1,1,1,1,1,1,1,1,1,1},
            {1,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,1},
            {1,1,0,0,0,0,0,0,1,1},
            {0,1,0,0,0,0,0,1,1,0},
            {0,0,1,1,0,0,1,1,0,0},
            {0,0,0,1,1,1,1,0,0,0},
            {0,0,0,0,1,1,0,0,0,0}
        };

        int i,j;
        for(i=0;i<10;i++)
        {
            for(j=0;j<10;j++)
            {
                if(pattern[i][j]==1)
                {
                    System.out.print("# ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
