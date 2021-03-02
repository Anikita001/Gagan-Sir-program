/*Declare BLC by name Sample1 with 2 static variable with values.
Declare another BLC by name Sample2 with 2 non-static members(dont initialise it) 
From main class initiaise the Sample2 class variable using Sample1 class
variable values using Sample1 class variable values.*/
class Sample1
{
    static String name="Dinga";
    static int a = 60;
}
class Sample2
{
     String name1;
     int b;
}
class Program8
{
    public static void main(String[] args)
    {
      
        Sample2 s2=new Sample2();

    System.out.println(" Before Initialisation");
    System.out.println("Name : "+s2.name1 );
    System.out.println("Value of b :" +s2.b);
    s2.name1=Sample1.name;
    s2.b=Sample1.a;
    System.out.println(" After Initialisation");
    System.out.println("Name : "+s2.name1 );
    System.out.println("Value of b :" +s2.b);
    }
}