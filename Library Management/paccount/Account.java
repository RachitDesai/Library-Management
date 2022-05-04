package paccount;

public abstract class Account
{
    int tot_book;
    int book_br;
    int book_rt;
    int book_lost;
    Double fine;
    int tot_user;
    int tot_staff;
    int book_borrowed = 56;

    String empName;
    String empNum;
    String empEmail;
    int empAge;
    protected static double salary = 20000;

    public abstract void details();
        
}
