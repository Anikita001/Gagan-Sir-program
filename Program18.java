//WAP to swap 2 variable values without using 3rd variable
class Program18
{
    public static void main(String [] args)
    {
    int a=10;
    int y=55;
    
     System.out.println("Before swapping");
     System.out.println("a: "+a);
     System.out.println("y :"+y);
     System.out.println("--------------");
     a=a+y;
     y=a-y;
     a=a-y;
     System.out.println("After swapping");
     System.out.println("a: "+a);
     System.out.println("y :"+y);


    }

}