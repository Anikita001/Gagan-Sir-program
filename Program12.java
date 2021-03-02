//WAP to Demonstrate referenced object and Deref. object
class Program
{
 int a=10;
}
class Demo
{
    int b=55;
}
 public class Program12
{
     public static void main(String[] args)
    {
        //Reference object
        Program p1 =new Program();
        System.out.println("Reference object value :"+p1.a);
       //Dereference object

        System.out.println("Dereference object value :"+ new Demo().b);


    }
}