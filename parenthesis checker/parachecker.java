class holes{
    public static int maxholes(int arr[])
    {
        int max=0;
        for(int i=0;i<5;i++)
            {
                if(arr[i]==8)
                    {max=2;
                        break;}
                else if(arr[i]==4 ||arr[i]==6 ||arr[i]==9)
                    max=1;
            }
            return max;
    }
    public static void main(String[] args) {
        int array[]= new int[5];
        array[0]=1;
        array[1]=1;
        array[2]=1;
        array[3]=4;
        array[4]=1;
        System.out.println("Max Holes:: "+maxholes(array));
    }
}