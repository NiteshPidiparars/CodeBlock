int main()
{
    char alphabet;
    printf("Enter an alphabet: \n");
    alphabet=getchar();
    printf("Reverse case: ");
    if(islower(alphabet))
        putchar(toupper(alphabet));
    else
        putchar(tolower(alphabet));
    return 0;
}
