struct st
{
    int a;
    char c;
};
int main()
{
    struct st st_arr[3];//declaration of structure in array

    struct st st_obj0;//first structure of object
    st_obj0.a=0;
    st_obj0.c='a';
    struct st st_obj1;//second structure of object
    st_obj1.a=1;
    st_obj1.c='b';
    struct st st_obj2;//three structure of object
    st_obj2.a=2;
    st_obj2.c='c';

    st_arr[0]=st_obj0;//first element of array with first element of structure
    st_arr[1]=st_obj1;//second element of array with second element of structure
    st_arr[2]=st_obj2;//three element of array with thee element of structure
    printf("\nfirst element of array has value of a=[%d] and c=[%c]\n",st_arr[0].a,st_obj0.c);
    printf("\nsecond element of array has value of a=[%d] and c=[%c]\n",st_arr[1].a,st_obj1.c);
    printf("\nthree element of array has value of a=[%d] and c=[%c]\n",st_arr[2].a,st_obj2.c);
    getch();
}
