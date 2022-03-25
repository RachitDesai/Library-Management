import java.util.*;
import paccount.Account;
import puser.*; 
import p_lb.*;
import pbook.*;
import pborrow.borrow;

public class LibraryManagement {

    public static void main(String args[])
    {
        
        Scanner myObj = new Scanner(System.in);
        
        Book book1 = new Book();
        User st = new User();

        
        System.out.println("---Enter Your User type---");
        System.out.println("1.Librarian");
        System.out.println("2.Student");
        System.out.print("Enter Ur Choice : ");
        int ch = myObj.nextInt();
        
        switch(ch)
        {
            case 1: librarian lb = new librarian();

                    lb.logIn();
                    boolean a = true;
                    while(a)
                    {
                        System.out.println("1.Add Book");
                        System.out.println("2.View Acccount");
                        System.out.println("3.Exit");
                        System.out.print("Enter Ur Choice : - ");
                        int ch1 = myObj.nextInt();

                        switch(ch1)
                        {
                            case 1 :System.out.print("Enter the Number of Books to add : - ");
                                    int n = myObj.nextInt(); 
                        
                                    Book bk[] = new Book[n];
                                    for(int i=0;i<n;i++)
                                    {
                                        System.out.println("*******Enter Ur Book Details*******");
                                        System.out.print("ISBN :- ");
                                        int ISBN = myObj.nextInt();
                                        System.out.println();
        
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

                                        bk[i] = new Book(ISBN,title,p_year,Lang,Category);
                                        bk[i].addBook();
                                    }

                                    for(int i=0;i<n;i++)
                                        bk[i].display();
                                
                                break;

                        case 2 : Account ac = new Account();
                                 ac.display();
                                 System.out.println("Staus :- "+ac.book_status());
                                 System.out.println("Total Fine :- "+ac.fine());
                        case 3 : a = false;
                                 break;

                        default :System.out.println("Invalid Choice");

                        }
                    }    
                    break;

            case 2 :st.logIn();

                    System.out.println("1.Borrow Book");
                    System.out.println("2.View Book");
                    System.out.print("Enter Ur Choice : - ");
                    int ch1 = myObj.nextInt();
                
                    switch(ch1)
                    {
                        case 1 :  borrow br = new borrow();
                                  br.display(book1.ISBN, st.user_roll);
                                  break;
                        case 2 :  break;

                        default :System.out.println("Invalid Choice");
                    }
                    break;

            default :System.out.println("Invalid Choice");
        }

        Book bk = new Book();
        System.out.print("Enter Name to Search :- ");
        String type = myObj.next();
        
        if (bk.book_search(type))
        {
            System.out.println("Book Available...!");
            
        }
        else
            System.out.println("Book Not Available");
        
        System.out.print("Try with ISBN number : ");
        int isbn = myObj.nextInt();
        
        if(bk.book_search(type,isbn))
            System.out.println("Book Available...!");
        else
            System.out.println("Book Not Available");

        //label : System.out.println();

    //obj1.close();
    myObj.close();
    }
}