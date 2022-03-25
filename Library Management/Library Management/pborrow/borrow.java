package pborrow;

public class borrow
{
    int B_id;
    String br_from;
    String br_to;
    Double fine;
    
    public void display(int book_id,int user_roll)
    {
        book_id= 1001;
        user_roll = 2147225;
        B_id = 5001;
        br_from = "21/02/2022";
        br_to= "25/02/2022";
        fine = 100.00;
    

        System.out.println("*****Borrower Details********");
        System.out.println("Book Id :- " + book_id);
        System.out.println("Borrower ID :- " + B_id);
        System.out.println("User ID :- " + 2147225);
        System.out.println("Borrowed From:- " + br_from);
        System.out.println("Borrowed To :- " + br_to);
        System.out.println("Fine :- " + fine);
       
    }

}
