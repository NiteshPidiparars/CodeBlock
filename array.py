try:
    a=int(input("Enter the number"))
    l=[[a,a+14,a+13,a+3],
       [a+11,a+5,a+6,a+8],
       [a+7,a+9,a+10,a+4],
       [a+12,a+2,a+1,a+15]]
       for row in l:
       for e in row:
           print("%3d"%e,end= ")
           print()
