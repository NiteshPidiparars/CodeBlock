struct Student_Collage_detail
{
    int collage_id;
    char collage_name[50];
};
struct Student_detail
{
    int id;
    char name[50];
    int percentage;
    struct Student_Collage_detail clg_data;
}stu_data,*stu_data_ptr;
int main()
{
    struct Student_detail stu_data={1,"sam",90.5,74154,"Ana University"};
    stu_data_ptr=&stu_data;
    printf("Id is= %d\n",stu_data_ptr->id);
    printf("Name is=%s\n",stu_data_ptr->name);
    printf("Percentage is= %d\n",stu_data_ptr->percentage);
    printf("Collage Id is= %d\n",stu_data_ptr->clg_data.collage_id);
    printf("Collage name is= %s\n",stu_data_ptr->clg_data.collage_name);
}
