/*
File name - payroll
Name - Sai Rangineeni
Date - 1/20/2023
*/
public class Payroll{
    public static void main(String[] args) {
        double hrlyWage, hrsWorked, salary;
        hrlyWage = 15.5;
        hrsWorked = 20;    //Bug here (fixed)
        salary = hrlyWage * hrsWorked; // Bug  (fixed)
        System.out.print("Salary: $" + salary);
    }
}

/*
Salary: $310.0
Process finished with exit code 0
 */