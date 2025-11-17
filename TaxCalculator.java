import java.util.Scanner;
public class TaxCalculator{
    public static void calculateTax(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Monthly Salary(0 to exit):");
        double monthlySalary=input.nextDouble();
        while(monthlySalary!=0){
            double annualIncome=monthlySalary*12;
            double totalTax=0,monthlyTax=0,netMonthlySalary=0;
            if(annualIncome<=600000)
                totalTax=0;
            else if(annualIncome<=1200000)
                totalTax=(annualIncome-600000)*0.01;
            else if(annualIncome<=2200000)
                totalTax=6000+(annualIncome-1200000)*0.11;
            else if(annualIncome<=3200000)
                totalTax=116000+(annualIncome-2200000)*0.23;
            else if(annualIncome<=4100000)
                totalTax=346000+(annualIncome-3200000)*0.30;
            else
                totalTax=616000+(annualIncome-4100000)*0.35;
            monthlyTax=totalTax/12;
            netMonthlySalary=monthlySalary-monthlyTax;
            System.out.println("Annual Income: "+annualIncome);
            System.out.println("Total Annual Tax Payable: "+totalTax);
            System.out.println("Monthly Tax Deduction: "+monthlyTax);
            System.out.println("Net Monthly Salary After Tax: "+netMonthlySalary);
            System.out.println("Do you want to continue the program(1(yes)/0(no))?");
            int choice=input.nextInt();
            if(choice==1){
                System.out.println("Enter Monthly Salary(0 to exit):");
                monthlySalary=input.nextDouble();
            }
            else
                monthlySalary=0;
        }
        System.out.println("Program terminated.");
        input.close();
    }
    public static void main(String[] args){
        calculateTax();
    }
}

