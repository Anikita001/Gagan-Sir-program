/*Declare BLC by name Sample1 with 2 static variable with values.
Declare another BLC by name Sample2 with 2 static members(dont initialise it) 
From main class initiaise the Sample2 class variable using Sample1 class
variable values using Sample1 class variable values.*/
class Sample1
{
    static String name="Sambaa";
    static int a = 6;
}
class Sample2
{
    static String name1;
    static int b;
}
class Program6
{
    public static void main(String[] args)
    {
    System.out.println(" Before Initialisation");
    System.out.println("Name : "+Sample2.name1 );
    System.out.println("Value of b :" +Sample2.b);
    Sample2.name1=Sample1.name;
    Sample2.b=Sample1.a;
    System.out.println(" After Initialisation");
    System.out.println("Name : "+Sample2.name1 );
    System.out.println("Value of b :" +Sample2.b);
    }
}