/*WAP to initialise local variable using global variable value,
where both the variables must be carrying same name*/
class Program9
{
    static int a=88;
    public static void main(String[] args) 
    {
        int a;
        System.out.println("Global variable value :" +Program9.a);
       //System.out.println("Local variable value :" +a);
        a =Program9.a;
       System.out.println("Global variable value :" +Program9.a);
        System.out.println("Local variable value :" +a);
 
    }
}