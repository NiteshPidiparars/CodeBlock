#include<stdio.h>
struct node
{
    int data;
    struct node *next;
};
struct node *createList(struct node *last);
void display(struct node *last);
struct node *addtoempty(struct node *last,int value);
struct node *addatbeg(struct node *last,int value);
struct node *addatend(struct node *last,int value);
struct node *addafter(struct node *last,int value,int item);
struct node *del(struct node *last,int value);

void display(struct node *last)
{
    struct node*t;
    if(last==NULL)
        printf("List is Empty");
    else{
        t=last->next;
        do{
            printf("%d",t->data);
            t=t->next;
        }while(t!=last->next);
    }
}
struct node *addatbeg(struct node *last,int value)
{
    struct node *n;
    n=malloc(sizeof(struct node));
    n->data=value;
    n->next=last->next;
    last->next=n;
    return(last);
}
struct node *addtoempty(struct node *last,int value)
{
    struct node *n;
    n=malloc(sizeof(struct node));
    n->data=value;
    last=n;
    last->next=last;
    return(last);
}
struct node *addatend(struct node *last,int value)
{
     struct node *n;
    n=malloc(sizeof(struct node));
    n->data=value;
    n->next=last->next;
    last->next=n;
    last=n;
    return(last);
}
struct node *addafter(struct node *last,int value,int item)
{
    struct node *t,*n;
    t=last->next;
    do{
        if(t->data=item)
        {
              struct node *n;
              n=malloc(sizeof(struct node));
              n->data=value;
              n->next=t->next;
              t->next=n;
              if(t==last)
                last=n;
              return(last);
        }
        t=t->next;
    }while(t!=last->next);
    printf("%d is not in the list",item);
    return(last);
}
struct node *del(struct node *last,int value)
{
  struct node *t,*p;
  if(last==NULL){
    printf("list is empty");
    return(last);
  }
  if(last==last->next && last->data==value){
    t=last;
    last=NULL;
    free(t);
    return(last);
  }
  if(last->next->data==value){
    t=last->next;
    last->next=t->next;
    free(t);
    return(last);
  }
  p=last->next;
  while(p->next!=last){
    if(p->next->data==value){
        t=p->next;
        p->next=t->next;
    }
    p=p->next;
  }
  if(last->data==value){
    t=last;
    p->next=last->next;
    last=p;
    free(t);
    return(last);
  }
  printf("%d is not found");
  return(last);
}
struct node *createList(struct node *last)
{
    int n,value,i;
    printf("how many value you want to entered: \n");
    scanf("%d",&n);
    printf("Enter first data for the list: \n");
    scanf("%d",&value);
    last=addtoempty(last,value);
    for(i=2;i<n;i++){
        printf("Enter data for the list: \n");
        scanf("%d",&value);
        last=addatend(last,value);
    }
    return(last);
}
main()
{
    int choice,value,item;
    struct node *last=NULL;
    while(1){
        printf("\n1.createList");
        printf("\n2.Display");
        printf("\n3.add to empty list");
        printf("\n4.add at the beginning");
        printf("\n5.add at end");
        printf("\n6.add at after");
        printf("\n7.delete");
        printf("\n8.Exit");
        printf("\n\nEnter your choice: ");
        scanf("%d",&choice);
        switch(choice){
    case 1:
        last=createlist(last);
        break;
    case 2:
        display(last);
        break;
    case 3:
        printf("\nEnter the number of the list: ");
        scanf("%d",&value);
        last=addtoempty(last,value);
        break;
    case 4:
        printf("\nEnter the number of the list: ");
        scanf("%d",&value);
        last=addatbeg(last,value);
        break;
    case 5:
        printf("\nEnter the number of the list: ");
        scanf("%d",&value);
        last=addatend(last,value);
        break;
    case 6:
        printf("\nEnter the number of the list: ");
        scanf("%d",&value);
        printf("\nEnter item value after new value to be inserted: ");
        scanf("%d",&item);
        last=addafter(last,value,item);
        break;
    case 7:
        printf("\nEnter the number of the list: ");
        scanf("%d",&value);
        last=del(last,value);
        break;
    case 8:
        exit(0);
    default:
        printf("\nInvalid choice");
        }//end of switch
        getch();
    }//end of while
}//end of main





