package paccount;

public class bookManagement extends Account
{
    public void details()
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