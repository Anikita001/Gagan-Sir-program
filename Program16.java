/* WAP to declare 2 static global variable and 2 local variable.
Swap global variable value into local variable and local to global */
class Program16
{
    static int a=11;
    static int b=22;

    public static void main( String[] args)
    {
        int x=33;
        int y=44;
        int c,z;
        System.out.println("Before Swapping");
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        System.out.println("x : "+x);
        System.out.println("y : "+y);
        System.out.println("------------");
        c=a;
        a=x;
        x=c;
        z=b;
        b=y;
        y=z;
        System.out.println("After Swapping");
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        System.out.println("x : "+x);
        System.out.println("y : "+y);


    }
}