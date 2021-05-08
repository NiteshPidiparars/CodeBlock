int main()
{
    float principle_amt,rate,simple_interest;
    int time;
    printf("Enter the value of principle_amt,rate,time: \n");
    scanf("%f %f %d",&principle_amt,&rate,&time);
    simple_interest=(principle_amt*rate*time)/100.0;
    printf("Amount= Rs. %5.2f\n",principle_amt);
    printf("Rate= Rs. %5.2f\n",rate);
    printf("Time= %d Years\n",time);
    printf("Simple interest= %5.2f\n",simple_interest);
    return 0;
}
