package pbook;

public  class Book
{
    public int ISBN;
    String title;
    int p_year;
    String Lang;
    String Category;

    public Book()
    {

    }

    public Book(int I,String T,int P,String L,String C)
    {
        ISBN = I;
        title= T;
        p_year = P;
        Lang = L;
        Category =C;
    }
    


    public int search(int isbn)
    {
        return isbn;
    }

    public void search(String title)
    {
        if(title.equals("Meluha"))
            display();
        else
            System.out.println("Book Not Found");
    }

    public void addBook()
    {
        
    }

    public void display()
    {
        
        System.out.println("***** Book Details********");
        System.out.println("ISBN :- " + ISBN);
        System.out.println("Title :- " + title);
        System.out.println("Publication Year :- " + p_year);
        System.out.println("Language :- " + Lang);
        System.out.println("Category :- " + Category);
       
    }


    public boolean book_search(String b_name)
    {
        if(b_name.equals(Category))
        {
            display();
            return true;
        }
        else
            return false;
    }

    public boolean book_search(String type,int isbn)
    {
        if(isbn == ISBN)
        {
            display();
            return true;
        }
        else
            return false;
    }




}
