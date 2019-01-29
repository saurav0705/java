import java.util.*;
class generic<T>{
    private T data;
    generic(T dat)
    {
        data=dat;
    }
    public void showData()
    {
        System.out.println("Data Stored in generic class object : "+data);
    }
    public static<E> void printArray(E array[])
    {
        System.out.println("\n\ngeneric print function :::: ");
        for(E el: array)
            {
                System.out.println(el);
            }
    }
    public static void main(String[] args)
    {
         generic<String> g1=new generic<String>("hello");
         generic<Integer> g2=new generic<Integer>(55);
         generic<Double> g3=new generic<Double>(54.24);
         g1.showData();
         g2.showData();
         g3.showData();
         Integer s[]=new Integer[5];
         for(int i=0;i<5;i++)
            {
                s[i]=i;
            }
        Double d[]=new Double[5];
        Double dt=new Double(45.2);
        for(int i=0;i<5;i++)
            {
                d[i]=dt;
                dt++;
            }
            printArray(s);
            printArray(d);
    }
}