#include<stdio.h>
#include<conio.h>
#define MAX 5
int top,status;
void push(int stack[],int item)
{
    if(top==(MAX-1))
        status=0;
    else{
        status=1;
        ++top;
        stack[top]=item;
    }
}
int pop(int stack[])
{
    int ret;
    if(top==-1){
        status=0;
        ret=0;
    }else{
     status=1;
     ret=stack[top];
     --top;
    }
    return ret;
}
void display(int stack[])
{
    int i;
    printf("\n stack is: ");
    if(top==-1)
        printf("Empty");
    else{
        for(i=top;i>=0;--i)
            printf("\n--------\n|%3d   |\n--------",stack[i]);
    }
    printf("\n");
}
void main()
{
    int stack[MAX],item;
    int ch;
    top=-1;
    do{
        do{
            printf("\n MAIN MANU ");
            printf("\n1.push(insert)in stack");
            printf("\n2.pop(delete)from the stack");
            printf("\n3.Exit(end of execution");
            printf("\nEnter your choice: ");
            scanf("%d",&ch);
            if(ch<1||ch>3)
                printf("\n Invalid choice,please try again");
        }while(ch<1||ch>3);
        switch(ch){
    case 1:
        printf("\nEnter the number to be pushed: ");
        scanf("%d",&item);
        printf("%d",item);
        push(stack,item);
        if(status){
            printf("\nAfter pushing");
            display(stack);
            if(top==(MAX-1))
                printf("\nStack is full");
        }else
        printf("\nstack overflow on push");
        break;
    case 2:
        item=pop(stack);
        if(status){
            printf("\nthe popped item is %d After popping",item);
            display(stack);
        }else
        printf("Stack underflow on pop\n");
        break;
    default:
        printf("End of Execution\n");
    }
}while(ch!=3);
getch();
}













