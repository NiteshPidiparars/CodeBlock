#define MAX 100
int getMaxElements(int a[]);
int size;
int main()
{
    int a[MAX],max,i;
    printf("Enter the number of size: \n");
    scanf("%d",&size);
    printf("Enter the array: \n");
    for(i=0;i<size;i++)
        scanf("%d",&a[i]);
    max=getMaxElements(a);
    printf("Largest number of array is %d",max);
    return 0;
}
int getMaxElements(int a[])
{
    static int i=0,max=-9999;
    if(i<size){
        if(max<a[i])
            max=a[i];
            i++;
            getMaxElements(a);
        }
        return max;
}
