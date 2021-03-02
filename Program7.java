/*Declare BLC by name Sample1 with 2 non-static variable with values.
Declare another BLC by name Sample2 with 2 non-static members(dont initialise it) 
From main class initiaise the Sample2 class variable using Sample1 class
variable values using Sample1 class variable values.*/
class Sample1
{
     String name="Sambaa";
     int a = 6;
}
class Sample2
{
     String name1;
     int b;
}
class Program7
{
    public static void main(String[] args)
    {
        Sample1 s1=new Sample1();
        Sample2 s2=new Sample2();

    System.out.println(" Before Initialisation");
    System.out.println("Name : "+s2.name1 );
    System.out.println("Value of b :" +s2.b);
    s2.name1=s1.name;
    s2.b=s1.a;
    System.out.println(" After Initialisation");
    System.out.println("Name : "+s2.name1 );
    System.out.println("Value of b :" +s2.b);
    }
}