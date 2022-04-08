import java.util.*;
import paccount.*;
import puser.*; 
import p_lb.*;
import pbook.*;
import pborrow.Borrow;

public class LibraryManagement {

    public static int n = 0;

    public static void main(String args[])
    {
        Scanner myObj = new Scanner(System.in);

        Book[] bk = new Book[10];
        
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
                        System.out.println("----What U want to  do ?----");
                        System.out.println("1.Add Book");
                        System.out.println("2.Display Books");
                        System.out.println("3.Update Profile");
                        System.out.println("4.View Account");
                        System.out.println("5.Exit");
                        System.out.print("Enter Ur Choice :- ");
                        int ch1 = myObj.nextInt();

                        

                        switch(ch1)
                        {
                            case 1 :System.out.print(getLine());
                                    System.out.print("Enter the No. of Books to Add :- ");
                                    n = myObj.nextInt();
                                    System.out.println();
                                    bk[0] = new Book(); 
                                    for(int i=1;i<=n;i++)
                                    {

                                        System.out.println("*******Enter Ur Book Details*******");
                                    
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

                            case 4 : Account ac = new Account();
                                     ac.display();

                                     System.out.print(getLine());

                            break;
                        
                            case 5 : a = false;
                                     break;

                        default :System.out.println("Invalid Choice");

                        }
                    }    
                break;

            case 2 : User st = new User();
                    st.logIn();         
                    a = true;
                    while(a)
                    {
                        System.out.print(getLine());
                        System.out.println();
                        System.out.println("----What U want to  do ?----");
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