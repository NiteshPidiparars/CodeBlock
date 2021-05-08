#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node *next;
};
struct node * createList(struct node *last);
void display(struct node *last);
struct node * addtoempty(struct node *last, int value);
struct node * addatbeg(struct node *last, int value);
struct node * addatend(struct node *last, int value);
struct node * addafter(struct node *last, int value, int item);
struct node * del(struct node *last, int value);
struct node * createList(struct node *last)
{
    int n,value,i;
    printf("How many values you want to enter : ");
    scanf("%d",&n);
    printf("Enter first data for the list : ");
    scanf("%d",&value);
    last = addtoempty(last, value);
    for(i=2;i<=n;i++){
        printf("Enter data for the list : ");
        scanf("%d",&value);
        last = addatend(last, value);
    }
    return(last);
}
void display(struct node *last)
{
    struct node *t;
    if(last == NULL)
        printf("List is Empty");
    else{
        t = last->next;
        do{
            printf("%d ",t->data);
            t = t->next;
        }while(t != last->next);
    }
}
struct node * addtoempty(struct node *last, int value)
{
    struct node *n;
    n = malloc(sizeof(struct node));
    n->data = value;
    last = n;
    last->next = last;
    return(last);
}
struct node * addatbeg(struct node *last, int value)
{
    struct node *n;
    n = malloc(sizeof(struct node));
    n->data = value;
    n->next = last->next;
    last->next = n;
    return(last);
}
struct node * addatend(struct node *last, int value)
{
    struct node *n;
    n = malloc(sizeof(struct node));
    n->data = value;
    n->next = last->next;
    last->next = n;
    last = n;
    return(last);
}
struct node * addafter(struct node *last, int value, int item)
{
    struct node *t,*n;
    t = last->next;
    do{
        if(t->data == item){
            n = malloc(sizeof(struct node));
            n->data = value;
            n->next = t->next;
            t->next = n;
            if(t == last)
                last = n;
            return(last);
        }
        t = t->next;
    }while(t != last->next);
    printf("%d is not in the list", item);
    return(last);
}
struct node * del(struct node *last, int value)
{
    struct node *t,*p;
    if(last == NULL){
        printf("List is Empty");
        return(last);
    }
    if(last == last->next && last->data == value){
        t = last;
        last = NULL;
        free(t);
        return(last);
    }
    if(last->next->data == value){
        t = last->next;
        last->next = t->next;
        free(t);
        return(last);
    }
    p = last->next;
    while(p->next != last){
        if(p->next->data == value){
            t = p->next;
            p->next = t->next;
            free(t);
            return(last);
        }
        p = p->next;
    }
    if(last->data == value){
        t = last;
        p->next = last->next;
        last = p;
        free(t);
        return(last);
    }
    printf("%d is not found");
    return(last);
}

main()
{
    int choice, value, item;
    struct node *last = NULL;
    while(1){
        system("cls");
        printf("\n1. Create List");
        printf("\n2. Display List");
        printf("\n3. Add to Empty List");
        printf("\n4. Add at Beginning");
        printf("\n5. Add at End");
        printf("\n6. Add After");
        printf("\n7. Delete");
        printf("\n8. Exit");
        printf("\n\nEnter Your Choice : ");
        scanf("%d",&choice);
        switch(choice)
        {
            case 1:
                last = createList(last);
                break;
            case 2:
                display(last);
                break;
            case 3:
                printf("Enter a number for the list : ");
                scanf("%d",&value);
                last = addtoempty(last, value);
                break;
            case 4:
                printf("Enter a number for the list : ");
                scanf("%d",&value);
                last = addatbeg(last, value);
                break;
            case 5:
                printf("Enter a number for the list : ");
                scanf("%d",&value);
                last = addatend(last, value);
                break;
            case 6:
                printf("Enter a number for the list : ");
                scanf("%d",&value);
                printf("Enter item value After new value to be inserted : ");
                scanf("%d",&item);
                last = addafter(last, value, item);
                break;
            case 7:
                printf("Enter value of element to be deleted : ");
                scanf("%d",&value);
                last = del(last, value);
                break;
            case 8:
                exit(0);
            default:
                printf("Invalid Choice");
        } // end of switch
        getch();
    } // end of while
} // end of main

