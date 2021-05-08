#include<iostream>
using namespace std;
class TwoWayStack
{
private:
    int capacity;
    int top_left;
    int top_right;
    int *ptr;
public:
    TwoWayStack(int cap)
    {
        capacity=cap;
        top_left=-1;
        top_right=capacity;
        ptr=new int[capacity];
    }
    ~TwoWayStack()
    {
        delete []ptr;
    }
    void pushLeft(int val);
    void pushRight(int val);
    int popLeft();
    int popRight();
    int peekLeft();
    int peekRight();
    int isEmptyLeft();
    int isEmptyRight();
    int isFull();
};
void TwoWayStack::pushLeft(int val)
{
    if(isFull()){
        cout<<"\nStack is Overflow";
    }else{
        top_left--;
        ptr[top_left]=val;
    }
}
void TwoWayStack::pushRight(int val)
{
    if(isFull()){
        cout<<"\nStack is Overflow";
    }else{
        top_right--;
        ptr[top_right]=val;
    }
}
int TwoWayStack::popLeft()
{
    int val;
    if(isEmptyLeft()){
        cout<<"\nStack is Underflow";
        return(-1);
    }else{
        val=ptr[top_left];
        top_left--;
        return(val);
    }
}
int TwoWayStack::popRight()
{
    int val;
    if(isEmptyRight()){
        cout<<"\nStack is Underflow";
        return(-1);
    }else{
        val=ptr[top_right];
        top_right++;
        return(val);
    }
}
int TwoWayStack::peekLeft()
{
    if(isEmptyLeft()){
        cout<<"\nStack is Empty";
        return(-1);
    }else
        return(ptr[top_left]);
}
int TwoWayStack::peekRight()
{
    if(isEmptyRight()){
        cout<<"\nStack is Empty";
        return(-1);
    }else
        return(ptr[top_right]);
}
int TwoWayStack::isEmptyLeft()
{
    if(top_left==-1)
        return(1);
    else
        return(0);
}
int TwoWayStack::isEmptyRight()
{
    if(top_right==capacity)
        return(1);
    else
        return(0);
}
int TwoWayStack::isFull()
{
    if(top_left+1 == top_right)
        return(1);
    else
        return(0);
}
int main()
{
    TwoWayStack s(11);
    s.pushRight(50);
    s.pushLeft(10);
    s.pushLeft(20);
    s.pushLeft(30);
    s.pushRight(40);
    cout<<"\nPeek from Stack 1 : "<<s.peekLeft();
    cout<<"\nPeek from Stack 2 : "<<s.peekRight();
}
