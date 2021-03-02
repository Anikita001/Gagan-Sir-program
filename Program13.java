/*WAP to calculate monthly salary of an employee where yearly CTC
 is 400000 with tax of deduction 10% */
 class Program13
 {
     public static void main(String [] args)
     {
         double CTC = 400000;
         double deduction=0.1;
         double monthlySalary,c;
         c=CTC*deduction;
         monthlySalary=(CTC-c)/12;
         System.out.println("Monthly Salary of Employee is :" +monthlySalary);
     }
 }
