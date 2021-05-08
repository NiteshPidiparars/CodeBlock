const int MAX=4;
int main()
{
    char *name[]={"Google","Amazon","Apple","Sony"};
    int i;
    for(i=0;i<MAX;i++){
        printf("Values of name[%d]= %s\n",i,name[i]);
    }
    return 0;
}
