/* WAP to declare 2 non-static global variable and 2 local variable.
Swap global variable value into local variable and local to global */
class Program16
{
     int a=11;
    int b=22;

    public static void main( String[] args)
    {
        Program16 p=new Program16();
        int x=33;
        int y=44;
        int c,z;
        System.out.println("Before Swapping");
        System.out.println("a : "+p.a);
        System.out.println("b : "+p.b);
        System.out.println("x : "+x);
        System.out.println("y : "+y);
        System.out.println("------------");
        c=p.a;
        p.a=x;
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