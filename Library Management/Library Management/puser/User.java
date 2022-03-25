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

    public int status;

    
    public void logIn()
    {
        
        System.out.print("username: ");
        Scanner sc = new Scanner(System.in);
        user_roll = sc.nextInt();

        sc.nextLine();
        System.out.print("Password: ");
        password = sc.nextLine();

        if(user_roll == 2147225 && password.equals("rachit"))
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
        status++;
     
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
        System.out.println("Name :-" + user_name);
        System.out.println("Email :-" + user_email);
        System.out.println("Roll :-" + user_roll);
        System.out.println("Phone :-" + user_phone);
        System.out.println("Department :-" + user_name);
        System.out.println("Semester :-" + sem);
        System.out.println("Book Issued :-" + book_issued);
        System.out.println();
        System.out.println();
    }

}