public class FibonacciSeries{

    public static void fibonacciSeries()
    {
        int a=0;
        int b=1;
        int c;

        System.out.print(" "+a+" "+b);

        for(int i=0; i<=9; i++)
        {
            c=a+b;
            System.out.print(" "+c);

            a=b;
            b=c;
            //hi

        }
    }
    public static void main(String[] args) {
        FibonacciSeries.fibonacciSeries();
    }
}