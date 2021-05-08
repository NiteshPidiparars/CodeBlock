int main()
{
    float a,b,c,det,r1,r2,realpart,imeginarypart;
    printf("Enter the coefficient of a,b and c: \n");
    scanf("%f%f%f",&a,&b,&c);
    det=b*b-4*a*c;
    if(det>0){
        r1=(-b+sqrt(det))/(2*a);
        r2=(-b-sqrt(det))/(2*a);
        printf("Roots are: %.2f and %.2f",r1,r2);
    }
    else if(det==0){
        r1=r2=-b/(2*a);
        printf("Roots are: %.2f and %.2f",r1,r2);
    }else{
        realpart=-b/(2*a);
        imeginarypart=sqrt(-det)/(2*a);
        printf("Roots are: %.2f+%.2fi and %.2f-%.2fi",realpart,imeginarypart,realpart,imeginarypart);
    }
    return 0;
}
