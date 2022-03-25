package p_lb;

import java.util.Scanner;

public class librarian {
        
        int lb_id;
        String password;
        String lb_name;
        String lb_email;
        String lb_phone;
        Double salary;
        int working_hr;
        String ar_of_work;
    
        public void logIn()
        {
            
            System.out.print("Staff ID: ");
            Scanner myObj = new Scanner(System.in);
            lb_id= myObj.nextInt();
    
            myObj.nextLine();
            System.out.print("Password: ");
            password = myObj.nextLine();
    
            if(lb_id == 2147225 && password.equals("rachit"))
            {
                 display();
                System.out.println("Login Successfull");
            }
            else
            {   
                System.out.println("Unable to Login ");
                System.exit(0);
            }
         
            //sc.close();
        }
    
        void display()
        {
            System.out.println();
            System.out.println();
            System.out.println("***** Staff Details********");
            lb_name = "Rachit Desai";
            lb_email="rachit304@gmail.com";
            lb_phone = "9586038522";
            salary = 10000.00;
            working_hr = 8;
            ar_of_work = "Fiction";
    
            System.out.println("Name :-" + lb_name);
            System.out.println("Email :-" + lb_email);
            System.out.println("Phone :-" + lb_phone);
            System.out.println("Salary :-" + salary);
            System.out.println("working Hours  :-" + working_hr);
            System.out.println("Area of Work :-" + ar_of_work);
            System.out.println();
            System.out.println();
           
        }
    
    }

