package puser;

import java.util.Scanner;

public class User
{
    public int user_roll;
    String password;
    String user_name;
    String user_email;
    String user_phone;
    String department;
    int sem;
    int book_issued;

    private String pass = "rachit";
    private int roll = 2147225;

    public int status;
    Scanner myObj = new Scanner(System.in);
    
    public boolean logIn()
    {
        
        System.out.println("\n");
        System.out.print("User ID: ");
        user_roll= myObj.nextInt();

        System.out.print("Password: ");
        password = myObj.next();

       
        if(user_roll == roll && password.equals(pass))
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
        {
            System.out.println("Profile Updated Successfully");
            return true;
        }
        else
            return false;      
    }

    void display()
    {

        user_name = "Rachit Desai";
        user_email="rachit304@gmail.com";
        user_phone = "9586038522";
        department = "Computer Science";
        sem=3;
        book_issued = 37;
        System.out.println();
        System.out.println();
        System.out.println("***** User Details********");
        System.out.println("Name :-" + user_name.trim());
        System.out.println("Email :-" + user_email.trim());
        System.out.println("Roll :-" + user_roll);
        System.out.println("Phone :-" + user_phone);
        System.out.println("Department :-" + user_name.trim());
        System.out.println("Semester :-" + sem);
        System.out.println("Book Issued :-" + book_issued);
        System.out.println();
        System.out.println();
    }

}