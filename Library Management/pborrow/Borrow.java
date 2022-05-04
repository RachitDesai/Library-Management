package pborrow;

public class Borrow
{
    int B_id;
    StringBuffer br_due =new StringBuffer("15/04/2021");
    StringBuffer  br_ret = new StringBuffer("21/04/2021");
    Double fine = 100.0;
    
    public void display(int book_id,int user_roll)
    {
        book_id= 1001;
        user_roll = 2147225;
        B_id = 5001;
        
    

        System.out.println("*****Borrower Details********");
        System.out.println("Book Id :- " + book_id);
        System.out.println("Borrower ID :- " + B_id);
        System.out.println("User ID :- " + 2147225);
        System.out.println("Borrowed From:- " + br_due);
        System.out.println("Borrowed To :- " + br_ret);
        System.out.println("Fine :- " + cal_fine());
       
    }

    public double cal_fine()
    {
        int from = Integer.parseInt(br_due.substring(0,2));
        int to = Integer.parseInt(br_ret.substring(0,2));

        System.out.println(from+"     "+to);

        return fine*(to-from);

    }
}