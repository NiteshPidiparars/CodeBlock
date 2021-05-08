int main()//Military Time
{
    int milhour,milmin,hour;
    char afternoon;
    printf("Enter the hour in military time: \n");
    scanf("%d",&milhour);
    printf("Enter the minutes in military time: \n");
    scanf("%d",&milmin);
    if(milhour<12){
        hour=milhour;
        afternoon='A';
    }
    if(milhour>=13){
        hour=milhour-12;
        afternoon='P';
    }
    printf("The time in 12 hour formate in is: ");
    printf("%d",hour);
    printf(":");
    printf("%d",milmin);
    printf("%c\n",afternoon);
    return 0;
}
