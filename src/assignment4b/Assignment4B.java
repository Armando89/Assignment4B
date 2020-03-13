//Armando Galan-Cedeño  Assignment4B
//CS121 Spring 2020
//March 12, 2020
//Purpose: Modification of Assignment4A: using JOptionPane dialog box and a switch/case.

package assignment4b;
import javax.swing.JOptionPane;

public class Assignment4B 
{

    public static void main(String[] args) 
    {
        double BASE_PAY = 200;
        double COMMISSION = .10;
        double yrSal, annBonus, wPaycheck, hrRate, otPay, regularPay, priceItems,
                totalAmount, totalComm;
        int answer, hrs, otHours, soldItems; 
        String fName, lName;
        
        JOptionPane.showMessageDialog(null,"Welcome to the HR payroll program");
             
        do 
        {
            answer = Integer.parseInt(JOptionPane.showInputDialog("Enter a 1 if "
                    + "the employee is salary, enter a 2 if the employee is hourly, "
                    + "enter a 3 if the employee is commission, or enter a 4 to "
                    + "exit the program."));
            
            while (answer < 1 || answer > 4)
            {
                answer = Integer.parseInt(JOptionPane.showInputDialog("Please "
                        + "provide a number between 1 and 4."));
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
                        /*if 
                        {
                            how can I do the step above using an if-else statement
                        }
                        else
                        {
                            
                        }*/
                    annBonus = Double.parseDouble(JOptionPane.showInputDialog("Please "
                            + "provide the annual profit bonus percent:"));
                    
                    wPaycheck = (yrSal * (1 + annBonus)) / 52;
                    
                    String message = String.format("This summary is for employee: "
                            + "%s %s. The employee's yearly salary is $%.2f, which "
                            + "doesn't include the annual profit bonus of %.2f "
                            + "percent, and its weekly paycheck amount is $%.2f.", 
                            fName, lName, yrSal, annBonus, wPaycheck);
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
                        
                        while (hrs <= 0)
                        {
                            hrs = Integer.parseInt(JOptionPane.showInputDialog
                                ("Invalid input: The number of hours must be greater "
                                + "than 0."));
                        }
                        
                        //what if worked < 40 hrs                        
                        
                        if (hrs > 40)
                        {
                            otHours = Integer.parseInt(JOptionPane.showInputDialog
                                ("Please provide the number of overtime hours worked:"));

                            otPay = ((hrRate * 1.5) * otHours);
                        }
                        else
                        {
                            otPay = 0;
                        }
                    
                    regularPay = hrRate * 40;
                    wPaycheck = regularPay + otPay;
                    
                    String message2 = String.format("This summary is for employee: "
                            + "%s %s. The employee's regular pay amount is $%.2f "
                            + "and its overtime pay amount is $%.2f. Overall, "
                            + "the employee's weekly paycheck amount equals to "
                            + "$%.2f.", fName, lName, regularPay, otPay, wPaycheck);
                    JOptionPane.showMessageDialog(null, message2);
                    break;
                    
                case 3:
                    fName = JOptionPane.showInputDialog("Please enter the employee's "
                            + "first name:");
                    lName = JOptionPane.showInputDialog("Please enter the employee's "
                            + "last name:");
                    soldItems = Integer.parseInt(JOptionPane.showInputDialog("Please "
                            + "enter the number of items sold:"));
                    
                        while (soldItems < 0 || soldItems > 500)
                        {
                            soldItems = Integer.parseInt(JOptionPane.showInputDialog
                                ("Invalid input: The number of items sold must be "
                                + "a positive number and should not exceed the "
                                + "quantity of 500."));
                        }
                        
                    priceItems = Double.parseDouble(JOptionPane.showInputDialog
                            ("Please enter the price of the item(s):"));
                    
                    totalAmount = (double)soldItems * priceItems;
                    totalComm = totalAmount * COMMISSION;
                    wPaycheck = totalComm + BASE_PAY;
                    
                    String message3 = String.format("This summary is for employee: "
                            + "%s %s. The total amount for the items sold is $%.2f. "
                            + "The employee's commission amount is $%.2f and its "
                            + "total paycheck amount equals to $%.2f.", fName, lName, 
                            totalAmount, totalComm, wPaycheck);
                    JOptionPane.showMessageDialog(null, message3);
                    break;
            }     
        } while (answer != 4);
    }
}

