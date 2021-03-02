/*Calculate the profit for a product where marking price is 10rs
and tax is 2rs and selling price is 20rs .What is the profit for 25 products. */
class Program14
{
    public static void main (String [] args)
    {
    int mp = 10;
    int tax =2;
    int sp=20;
    int products =25;
    int profit;
    int a;
    a=sp-(mp+tax);
    profit=products*a;
    System.out.println("The profit for 25 product is " +profit);
    }
}