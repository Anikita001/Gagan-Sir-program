//WAP to demonstrate difference between instance variable and class variables
class Program10
{
    static int a=10;    //class variables
    int b=50;          //instance variable
    public static void main (String [] args)
    {
        Program10 p1 =new Program10();
        System.out.println("a : " +a);
        System.out.println("b : " +p1.b);

    }
}