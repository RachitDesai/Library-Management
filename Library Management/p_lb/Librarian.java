package p_lb;

import java.util.Scanner;

public class Librarian {
        
        int lb_id;
        String password;
        String lb_name;
        String lb_email;
        String lb_phone;
        Double salary;
        int working_hr;
        String ar_of_work;
        Scanner myObj = new Scanner(System.in);

        private String pass = "rachit";
        private int roll = 2147225;

        public boolean logIn()
        {
            
            System.out.println("\n");
            System.out.print("User ID: ");
            lb_id= myObj.nextInt();
    
            System.out.print("Password: ");
            password = myObj.next();
    
           
            if(lb_id == roll && password.equals(pass))
            {
                display();
                return true;
            }
            else
                return false;
        }


        public void update_pofile(int roll)
        {
            System.out.println("\n");
            System.out.print("New ID: ");
            roll= myObj.nextInt();  
            System.out.println();
            System.out.println("Profile Updated Successfully");      
        }
    
        public boolean update_pofile(String pass)
        {
            String  pass1;
            System.out.println("\n");
            System.out.print("New Password : ");
            pass1= myObj.next();

            System.out.print("Confirm Password : ");
            pass= myObj.next();

            if(pass.equals(pass1))
                return true;
            else
                return false;      
    }

    
        void display()
        {
            System.out.println();
            System.out.println();
            System.out.println("*****  Details  ******");
            lb_name = "Rachit Desai";
            lb_email="rachit304@gmail.com";
            lb_phone = "9586038522";
            working_hr = 8;
            ar_of_work = "Fiction";
    
            System.out.println("Name :-" + lb_name);
            System.out.println("Email :-" + lb_email);
            System.out.println("Phone :-" + lb_phone);
            System.out.println("working Hours  :-" + working_hr);
            System.out.println("Area of Work :-" + ar_of_work);
            System.out.println();
            System.out.println();
           
        }
    
    }