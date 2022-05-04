import java.util.*;
import paccount.*;

import pbook.*;
import pborrow.Borrow;

public class LibraryManagement {

    public static int n = 0;

    public static void main(String args[])
    {
        Scanner myObj = new Scanner(System.in);

        Book[] bk = new Book[10];

        if(Integer.parseInt(args[0]) >= 2147001 && Integer.parseInt(args[0]) <= 2147260)
            System.out.println("\n********Welocome 3MCA-B Student********\n");
        
        System.out.println("**********Welcome to My Libreary**********");
        System.out.println();
        System.out.println("---Enter Your User type---");
        System.out.println("1.Librarian");
        System.out.println("2.Student");
        System.out.print("Enter Ur Choice : ");
        int ch = myObj.nextInt();

        System.out.print(getLine());
        

        switch(ch)
        {
            case 1: Librarian lb = new Librarian();
                    
                    if(lb.logIn())
                        System.out.println("\nLogin Successful\n");
                    else 
                    {
                        System.out.println("\nInvalid Details");
                        System.exit(0);
                    }
                    boolean a = true;
                    while(a)
                    {
                        System.out.print(getLine());
                        System.out.println("\n----What U want to  do ?----");
                        System.out.println("1.Add Book");
                        System.out.println("2.Display Books");
                        System.out.println("3.Update Profile");
                        System.out.println("4.View Account Details");
                        System.out.println("5.Exit");
                        System.out.print("Enter Ur Choice :- ");
                        int ch1 = myObj.nextInt();

                        

                        switch(ch1)
                        {
                            case 1 :System.out.print(getLine());
                                    System.out.println("\nEnter the No. of Books to Add :- ");
                                    n = myObj.nextInt();
                                    System.out.println();
                                    bk[0] = new Book(); 
                                    for(int i=1;i<=n;i++)
                                    {

                                        System.out.println("\n*******Enter Ur Book Details*******");
                                    
                                        System.out.print("Title :- ");
                                        String title =myObj.next();
                                        System.out.println();

                                        System.out.print("Publication Year :- ");
                                        int p_year = myObj.nextInt();
                                        System.out.println();
        
                                        System.out.print("Language :- ");
                                        String Lang = myObj.next();
                                        System.out.println();

                                        System.out.print("Category :- ");
                                        String Category = myObj.next();
                                        System.out.println();
                                        System.out.print(getLine());
                                        bk[i] = new Book(title,p_year,Lang,Category);
                                        
                                        System.out.print(getLine());
                                    }
                            break;

                            case 2 : for(int i=0;i<n;i++)
                                     {
                                         bk[i] = new Book();
                                         bk[i].display();
                                     }
                            break;

                            case 3 : System.out.println("1.Update ID");
                                     System.out.println("2.Update Password");
                                     System.out.print("Enter ur choice :- ");
                                     int ch2 = myObj.nextInt();

                                     System.out.print(getLine());
                                     
                                     if(ch2 == 1)
                                     {
                                         int id = myObj.nextInt();
                                         lb.update_pofile(id);
                                         System.out.println();
                                         lb.logIn();

                                         System.out.print(getLine());
                                     }
                                     else if(ch2 == 2)
                                     {
                                        String pass = myObj.next();
                                        if(lb.update_pofile(pass))
                                        {
                                            System.out.println("Password Updated Successfully");
                                            System.out.println();
                                            lb.logIn();
                                        }
                                        else
                                            System.out.println("Incorrect Password");

                                            System.out.print(getLine());
                                     }
                            
                            break;

                            case 4 :System.out.println("1.Manage Employees ");
                                    System.out.println("2.Manage Books ");
                                    System.out.print("Enter ur choice :- ");
                                    ch2 = myObj.nextInt();
                            
                                    switch(ch2)
                                    {
                                        case 1: empManagement empmanage = new empManagement();
                                                empmanage.details();
                                                break;
                                                
                                        case 2: bookManagement bookmanage = new bookManagement();
                                                bookmanage.details();
                                                bookmanage.book_status();                                    }
                                    

                                     System.out.print(getLine());

                            break;
                        
                            case 5 : a = false;
                                     break;

                        default :System.out.println("Invalid Choice");

                        }
                    }    
                break;

            case 2 : Student st = new Student();
                    st.logIn();         
                    a = true;
                    while(a)
                    {
                        System.out.print(getLine());
                        System.out.println();
                        System.out.println("\n----What U want to  do ?----");
                        System.out.println("1.View Book");
                        System.out.println("2.Borrow Books");
                        System.out.println("3.Search Book");
                        System.out.println("3.update profile");
                        System.out.println("4.Exit");
                        System.out.print("Enter Ur Choice :- ");
                        int ch1 = myObj.nextInt();

                        System.out.print(getLine());

                        switch(ch1)
                        {
                            case 1 : for(int i=0;i<n;i++)
                            {

                                bk[i] = new Book();
                                bk[i].display();

                                System.out.print(getLine());
                            }
                            
                            break;
                    
                            case 2 : Borrow  br = new Borrow();
                                    br.display(Book.ISBN, st.user_roll);
                                    System.out.print(getLine());
                            break;

                            case 3 : break;

                            case 4 : System.out.println("1.Update ID");
                                    System.out.println("2.Update Password");
                                    System.out.print("Enter ur choice :- ");
                                    int ch2 = myObj.nextInt();

                                    System.out.print(getLine());

                                    if(ch2 == 1)
                                    {
                                        int id = myObj.nextInt();
                                        st.update_pofile(id);
                                        System.out.println();
                                        st.logIn();
                                        System.out.print(getLine());
                                    }
                                    else if(ch2 == 2)
                                    {
                                        String pass = myObj.next();
                                        if(st.update_pofile(pass))
                                        {
                                            System.out.println("Password Updated Successfully");
                                            System.out.println();
                                            st.logIn();
                                            System.out.print(getLine());
                                        }
                                        else
                                            System.out.println("Incorrect Password");
                            }
                            break;
             
                            case 5 : a = false;
                                     break;

                            default :System.out.println("Invalid Choice");
                        }
                    }    
            break;

            default :System.out.println("Invalid Choice");

        }
        myObj.close();
    }

    static StringBuffer getLine()
    {
        StringBuffer str = new StringBuffer("_");

        for(int i = 0;i<30;i++)
            str.append("_");
        System.out.println();

        return str;
    }
}



interface User
{
    
    abstract public boolean logIn();

    abstract public void update_pofile(int roll);

    abstract public boolean update_pofile(String pass);

    abstract public void display();

}


class Student implements User
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

        if(password.isEmpty())
        {
            System.out.println("Please Enter ur Passsword !!");
            return false;
        }
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

    public void display()
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

class Librarian implements User{
        
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


    public void display()
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