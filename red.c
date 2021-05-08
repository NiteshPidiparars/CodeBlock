main()
{
  int red;
  float PI=3.14,ci,area;
  printf("Enter the number: ");
  scanf("%d",&red);
  area=PI*red*red;
  printf("\nArea of circle is %f:",area);

  ci=2*PI*red;
  printf("\nCircumference is %f :",ci);
  getch();
}

