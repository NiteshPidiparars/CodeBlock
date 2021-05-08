struct person
{
    int age;
    char *name;
};
int main()
{
    struct person first;
    struct person *ptr;
    first.age=21;
    char *filename="FullName";
    first.name=filename;
    ptr=&first;
    printf("age= %d, name= %s\n",first.age,ptr->name);
    return 0;
}
