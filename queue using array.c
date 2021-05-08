#include<stdio.h>
#include<conio.h>
#define MAX 50
int queue_array[MAX];
int rear=-1;
int front=-1;
main()
{
    int choice;
    while(1){
        printf("------MAIN MENU------");
        printf("\n1.insert element in queue");
        printf("\n2.delete element from queue");
        printf("\n3.display all the element from queue");
        printf("\n4.Exit");
        printf("\nEnter the choice: ");
        scanf("%d",&choice);
        switch(choice){
        case 1:
            insert();
            break;
        case 2:
            delete();
            break;
        case 3:
            display();
            break;
        case 4:
            Exit(1);
        default:
            printf("your choice is wrong\n");
    getch();
        }
    }
}
insert()
{
    int add_item;
    if(rear==MAX-1)
    {
        printf("Queue overflow\n");
    }else{
        if(front==-1){
            front=0;
        }
        printf("\nInsert the element in queue: ");
        scanf("%d",&add_item);
        rear=rear+1;
        queue_array[rear]=add_item;
    }
}
delete()
{
    if(front==-1||front>rear){
        printf("queue is underflow\n");
        return;
    }else{
        printf("\nElement delete from queue is %d\n",queue_array[front]);
        front=front+1;
    }
}
display()
{
    int i;
    if(front==-1){
        printf("Queue is empty\n");
    }else{
      printf("Queue is: \n");
       for(i=front;i<=rear;i++){
        printf("%d",queue_array[i]);
      }
      printf("\n");
    }
}

