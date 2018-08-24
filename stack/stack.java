class stack{
    private int Stack[]=new int[9];
    private int top=-1;
    private int maximum=9;
    public void push(int n)
    {
        if(top<maximum-1)
            {
                top=top+1;
                Stack[top]=n;
            }
        else{
            System.out.println("Overflow");
        }
    }
    public void pop()
    {
        if(top==-1)
            {
                System.out.println("Underflow");
            
        }
        else
            {
                top=top-1;
            }
    }
    public void peek()
    {
        System.out.println(Stack[top]);
    }
    public void remain()
    {
        System.out.println(maximum-top-1);
    }
    public void clear()
    {
        top=-1;
    }
}
class test{
    public static void main(String[] args)
    {
        stack s = new stack();
        for(int i=0;i<11;i++)
            {
                s.push(i);
            }
        for(int i=0;i<11;i++)
            {
                s.pop();
            }
            s.remain();
            for(int i=0;i<5;i++)
                {
                    s.push(i);
                }
                s.remain();
    }
}