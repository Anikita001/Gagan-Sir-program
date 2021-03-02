//WAP to declare types of variable and reinitialise it and access it again
class Program5
{
   static int x=40;        //global variable
 public static void main(String [] args)
 {
    int a=10;//local variable
    System.out.println(" local variable is : "+a);
    System.out.println(" Global variable is : "+x);
    x=55;    //reinitialisation
    a=22;    //reinitialisation
    System.out.println(" local variable is : "+a);
    System.out.println(" Global variable is : "+x);

 }
}