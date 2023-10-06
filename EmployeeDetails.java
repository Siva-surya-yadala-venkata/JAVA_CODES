//Assignment 2

import java.util.Scanner;

class Employee{
    String name;
    String Empid;
    double basicSalary;
    int allowancePercentage;
    boolean loanEligibilty;
    float noOfLeaves;
    double totalSalary;

    public String setName(String name){
        this.name=name;
        return this.name;
    }
    public void getName(){
        System.out.println("The Name of The Employee is "+this.name);
    }


    public String setEmpid(String Empid){
        this.Empid=Empid;
        return this.Empid;
    }
    public void getEmpid(){
        System.out.println("The Employee Id is "+this.Empid);
    }


    public double setBasicsSalary(double BasicsSalary){
        this.basicSalary=BasicsSalary;
        return this.basicSalary;
    }
    public void getBasicsSalary(){
        System.out.println("The Employee Salary is "+this.basicSalary);
    }


    public int setAllowancePercentage(){
        if(basicSalary > 25000.00){
            System.out.println("The Allowance percentage is accepted ");
            this.allowancePercentage=2;
            return this.allowancePercentage;
        }
        else{
            System.out.println("The Allowance Percentage is not accepted ");
            this.allowancePercentage=1;
            return this.allowancePercentage;
        }
    }
    public void getAllowancePercentage(){
        System.out.println("The Allowance percentage of the Employee is "+this.allowancePercentage);
    }


    public boolean setLoanEligibility(){
         if(basicSalary >27000.00){
            System.out.println("The Loan is Granted ");
            this.loanEligibilty=true;
            return this.loanEligibilty;
         }
         else{
            System.out.println("The Loan is Not Granted ");
            this.loanEligibilty=false;
            return this.loanEligibilty;
         }
    }
    public void getLoanEligibility(){
        System.out.println("The Loan Eliglibity is of the Employee  "+this.loanEligibilty);
    }


    public float setNoOfLeaves(float noOfLeaves1){
         this.noOfLeaves=noOfLeaves1;
         return this.noOfLeaves;
    }
    public void ShowNoOfLeaves(){
        System.out.println("The Number of the leaves of the Employee is "+this.noOfLeaves);
    }


    public double setCalculateSalary(){
        totalSalary=basicSalary+(basicSalary*allowancePercentage);
        return totalSalary;
    }
    public void getCalculateSalary(){
        System.out.println("The Employee Total Salary is "+totalSalary);
    }

    public void listOfEmployees(){
     System.out.println("The Employee id is "+Empid+" The Employee Name is "+name);
    }
}

public class EmployeeDetails{
    public static void main(String args[]){

         Scanner sc=new Scanner(System.in);
        //Creating Object
        Employee obj=new Employee();
        

        for(int i=0;i<2;i++){
            
            String name=sc.nextLine();
            String Empid=sc.nextLine();
            double basicSalary=sc.nextDouble();
            //int allowancePercentage=sc.nextInt();
            //boolean loanEligibilty=sc.nextBoolean();
            float noOfLeaves=sc.nextFloat();

            String result_name=obj.setName(name);
            System.out.println("The Employee Name is "+result_name);
            obj.getName();

            String result_Empid=obj.setEmpid(Empid);
            System.out.println("The Employee Id is "+result_Empid);
            obj.getEmpid();

            double result_basicsSalary=obj.setBasicsSalary(basicSalary);
            System.out.println("The Employee Basic Salry is "+result_basicsSalary);
            obj.getBasicsSalary();

            int result_allowancePercentage=obj.setAllowancePercentage();
            System.out.println("The Allowance Percentage of tHe Employee is "+result_allowancePercentage);
            obj.getAllowancePercentage();

            boolean result_LoanEliglibity=obj.setLoanEligibility();
            System.out.println("The Employee Loan Eligilibity is "+result_LoanEliglibity);
            obj.getLoanEligibility();

            float result_noOfLeaves=obj.setNoOfLeaves(noOfLeaves);
            System.out.println("The Employee No of Leaves are "+result_noOfLeaves);
            obj.ShowNoOfLeaves();

            double result_Calculate_Salary=obj.setCalculateSalary();
            System.out.println("The Employee Total Salary is "+result_Calculate_Salary);
            obj.getCalculateSalary();

            obj.listOfEmployees();

            sc.nextLine();
           
        }
    }
}