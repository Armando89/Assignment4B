//Armando Galan-Cedeño  Assignment4B
//CS121 Spring 2020
//March 12, 2020
//Purpose: Modification of Assignment4A: using JOptionPane dialog box and a switch/case.

package assignment4b;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Assignment4B 
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        //String name = JOptionPane.showInputDialog("What is your name?");
        //String message = String.format("Welcome, %s, to Java Programming", name);
        //JOptionPane.showMessageDialog(null, message);
        //JOptionPane.showMessageDialog(null,"Welcome to the HR payroll program");
        
        //double ANN_BONUS = .05;
        //double annBonus;
        //double YR_SALARY = 50000;
        //double yrSal;
        
        //double hrRate;
        
        //double BASE_PAY = 200;
        //double COMMISSION = .10;
        double yrSal, annBonus, wPaycheck, hrRate;
        //otPay, regularPay, totalPay, totalAmount, comm, priceItem;
        int answer, hrs, otHours; 
        //soldItems;
        String fName, lName;
             
        do 
        {
            //String message = String.format("Welcome to the HR payroll program");
            JOptionPane.showMessageDialog(null,"Welcome to the HR payroll program");
            //System.out.println("Welcome to the HR payroll program.");
            //System.out.println("Enter a 1 if the employee is salary, "
            //        + "enter a 2 if the employee is hourly, enter a 3 if the "
            //        + "employee is commission, or enter a 4 to exit the program.");
            answer = Integer.parseInt(JOptionPane.showInputDialog("Enter a 1 if "
                    + "the employee is salary, enter a 2 if the employee is hourly, "
                    + "enter a 3 if the employee is commission, or enter a 4 to "
                    + "exit the program."));
            
            //ans = Integer.parseInt(JOptionPane.showInputDialog("Enter a \"1\" to continue or a \"2\" to quit"));
            
            while (answer < 1 || answer > 4)
            {
                answer = Integer.parseInt(JOptionPane.showInputDialog("Please "
                        + "provide a number between 1 and 4."));
                //System.out.println("Invalid input. Please provide a number between "
                //        + "1 and 4.");            
                //answer = input.nextInt();
            }
            
            switch (answer)
            {
                case 1:
                    fName = JOptionPane.showInputDialog("Please enter the employee's "
                            + "first name:");
                    lName = JOptionPane.showInputDialog("Please enter the employee's "
                            + "last name:");
                    yrSal = Double.parseDouble(JOptionPane.showInputDialog("Please "
                            + "provide the employee's yearly salary:"));
                        while (yrSal < 30000 || yrSal > 65000)
                        {
                            yrSal = Double.parseDouble(JOptionPane.showInputDialog
                                ("Invalid input: The amount must be between $30,000 "
                                        + "and $65,000."));
                        }
                        /*if (yrSal >= 30000 && yrSal <= 65000)
                        {
                                
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Invalid "
                                    + "input: The amount must be between $30000 "
                                    + "and $65000");
                            continue;
                        }*/
                    annBonus = Double.parseDouble(JOptionPane.showInputDialog("Please "
                            + "provide the annual profit bonus percent:"));
                    
                    wPaycheck = (yrSal * (1 + annBonus)) / 52;
                    
                    //String message = String.format("Welcome to the payroll calculator %s %s.  Your salary is %d and your bonus is %.2f", fName, lName, yearlySal, yearlyBonus);
                    String message = String.format("This summary is for employee: "
                            + "%s %s. The employee's weekly paycheck amount is "
                            + "$%.2f and its yearly salary is $%.2f, which "
                            + "doesn't include the annual profit bonus of %.2f "
                            + "percent.", fName, lName, wPaycheck, yrSal, annBonus);
                    JOptionPane.showMessageDialog(null, message);
                    break;
                    
                case 2:
                    fName = JOptionPane.showInputDialog("Please enter the employee's "
                            + "first name:");
                    lName = JOptionPane.showInputDialog("Please enter the employee's "
                            + "last name:");
                    hrRate = Double.parseDouble(JOptionPane.showInputDialog("Please "
                            + "provide the employee's hourly rate:"));
                        while (hrRate < 10 || hrRate > 25)
                        {
                            hrRate = Double.parseDouble(JOptionPane.showInputDialog
                                ("Invalid input: The amount must be between $10.00 "
                                    + "and $25.00."));
                        }
                    hrs = Integer.parseInt(JOptionPane.showInputDialog("Please "
                            + "provide the total number of hours worked:"));
                        while (hrs < 0)
                        {
                            hrs = Integer.parseInt(JOptionPane.showInputDialog
                                ("Invalid input: The number of hours must be greater "
                                    + "than 0."));
                        }
                         if (hrs > 40)
                        {
                            otHours = Integer.parseInt(JOptionPane.showInputDialog("Please "
                                + "provide the number of overtime hours worked:"));
                            //System.out.print("Please provide the number of overtime "
                                //+ "hours worked: ");
                            //otHours = input.nextInt();                        
                            otPay = ((hrRate * 1.5) * otHours);
                        }
                        else
                        {
                            otPay = 0;
                        }
            }     
            /*while (answer == 2)
            {
                System.out.print("Please enter the employee's first name: ");
                fName = input.next(); 
                System.out.print("Please enter the employee's last name: ");
                lName = input.next();
                System.out.println("Please provide the employee's hourly pay "
                        + "rate: $" + HR_RATE); 
                System.out.print("Please provide the total number of hours "
                        + "worked: ");
                hrs = input.nextInt();
                    
                    if (hrs > 40)
                    {
                        System.out.print("Please provide the number of overtime "
                                + "hours worked: ");
                        otHours = input.nextInt();
                        
                        otPay = ((HR_RATE * 1.5) * otHours);
                        
                    }
                    else
                    {
                        otPay = 0;
                    }
                    
                regularPay = HR_RATE * 40;
                totalPay = regularPay + otPay; 
                
                System.out.printf("%s%s%s%s%.2f%s%.2f%s%.2f%n%n", fName, " ", 
                        lName, "'s regular pay is $", regularPay, " and its "
                        + "overtime pay amount is $", otPay, ". The "
                        + "employee's total paycheck amount is $", 
                        totalPay);
                break;
            }*/
            
            /*while (answer == 3)
            {
                System.out.print("Please enter the employee's first name: ");
                fName = input.next(); 
                System.out.print("Please enter the employee's last name: ");
                lName = input.next();
                System.out.print("Please enter the number of items sold: ");
                soldItems = input.nextInt();
                System.out.print("Please enter the price of the item(s): $");
                priceItem = input.nextDouble();
                
                totalAmount = (double)soldItems * priceItem;
                comm = totalAmount * COMMISSION;
                wPaycheck = comm + BASE_PAY;
                
                System.out.printf("%s%s%s%s%s%.2f%s%.2f%s%.2f%n%n", "The total "
                        + "amount for items sold by ", fName, " ", lName, " is "
                        + "$", totalAmount, ". The employee's commission "
                        + "amount is $", comm, " and its total "
                        + "paycheck amount is $", wPaycheck);
                break;
            }*/
        } while (answer != 4);
    }
}

