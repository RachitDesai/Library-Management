package paccount;

public class Account
{
    int tot_book;
    int book_br;
    int book_rt;
    int book_lost;
    Double fine;
    int tot_user;
    int tot_staff;
    int book_borrowed = 56;
    private static double salary;
    
    private static double getSal(double salary)
    {
        return salary;
    }

    public static class Salary
    {
        static double final_sal()
        {
            if(Account.getSal(salary) >= 20000)
                return  Account.salary - (Account.salary*0.1);
            else
                return Account.salary;
        }
    }
    
    public void display()
    {
        tot_book = 4000;
        book_br = 1500;
        book_rt = 500;
        book_lost = 120;
        fine = 2300.00;
        tot_user = 56;
        tot_staff = 9;
    

        System.out.println("*****Account Details********");
        System.out.println("Total Books :- " + tot_book);
        System.out.println("Books Borrowed :- " + book_br);
        System.out.println("Books Returned :- " + book_rt);
        System.out.println("Books Lost:- " + book_lost);
        System.out.println("Total Users:- " + tot_user);
        System.out.println("Total Staff :- "+tot_staff);
        System.out.println("Fine :- " + fine);
        System.out.println("Salary :- "+Salary.final_sal());

       
    }

    public int book_status()
    {
        return tot_book - book_br + book_rt; 
    }

    public int fine()
    {
        return book_borrowed*100;
    }
}
