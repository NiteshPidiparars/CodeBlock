int main()
{
    int i,num,a[10],ele;
    printf("Enter the value of n: \n");
    scanf("%d",&num);
    printf("Enter the elements in Array: \n");
    for(i=0;i<num;i++){
        scanf("%d",&a[i]);
    }
    printf("Enter the elements to be searched: \n");
    scanf("%d",&ele);
    i=0;
    if(i<num && ele!=a[i]){
        i++;
    }
    if(i<num)
        printf("Number is found at the location %d",i+1);
    else
        printf("Number is not found");
}
