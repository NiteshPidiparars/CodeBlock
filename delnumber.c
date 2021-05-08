int main()
{
    int a[100],i,n,pos,ele,found=1;
    printf("Enter the value: ");
    scanf("%d",&n);
    printf("Enter the elements: ");
    for(i=0;i<n;i++)
        scanf("%d",&a[i]);
    printf("input array is: ");
    for(i=0;i<n;i++)
        printf(" %d",a[i]);
    printf("\nEnter the elements to be deleted is\n");
    scanf("%d",&ele);
    for(i=0;i<n;i++){
    if(a[i]==ele){
        found=1;
        pos=i;
        break;
    }
  }
  if(found==1){
    for(i=pos;i<n-1;i++){
        a[i]=a[i+1];
    }
        printf("Resultant array is\n");
        for(i=0;i<n-1;i++)
            printf(" %d",a[i]);
  }
  else{
    printf("Elements %d is not found at the location",ele);
  }
}
