class DeletePrimeInArray
{
    public static void main(String[]args)
    {
        int a[]={4,5,6,7,8,5,6,7,8,10};
        int res[]=new int[a.length];
        int i,j,k,nf=0;
        j=0;
        for(i=0;i<a.length;i++){
            nf=0;
            for(k=1;k<=a[i];k++){
                if(a[i]%k==0)
                    nf++;
            }
            if(nf!=2){
                res[j]=a[i];
                j++;
            }
        }
        System.out.println("After Deleting Array is: ");
        for(i=0;i<j;i++){
            System.out.println(res[i]+" ");
        }
    }
}
