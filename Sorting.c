int main()
{
    int a[]={100,90,80,70,40,50,60,10,20,30};
    int size=10,i;
    sort(a,size);
    for(i=0;i<size;i++)
        printf("%d ",a[i]);
}
void sort(int a[],int size)
{
    int maxIndex,t;
    if(size>1){
        maxIndex=getMaxIndex(size,a);
        t=a[size-1];
        a[size-1]=a[maxIndex];
        a[maxIndex]=t;
        sort(a,size-1);
    }
}
int getMaxIndex(int size,int a[])
{
    int max,maxIndex,i;
    max=a[0];
    maxIndex=0;
    for(i=0;i<size;i++)
        if(max<a[i]){
            max=a[i];
            maxIndex=i;
        }
        return (maxIndex);
}
