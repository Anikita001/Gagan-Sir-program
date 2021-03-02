//WAP to access local and global variables from same class
class Program4
{
   static int m=55;        //global variable
 public static void main(String [] args)
 {
    int z=99;//local variable
    System.out.println(" local variable is : "+m);
    System.out.println(" Global variable is : "+z);

 }
}