//WAP to fetch fully qualified address of referenced object and Dref. object
class Program
{
 int a=10;
}
class Demo
{
    int b;
}
 public class Program11
{
     public static void main(String[] args)
    {
        //Reference object
        Program p1 =new Program();
        System.out.println("Reference object value :"+p1);
       //Dereference object

        System.out.println("Dereference object value :"+ new Demo());


    }
}