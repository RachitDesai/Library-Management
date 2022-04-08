package pbook;

public  class Book
{
    public static int ISBN = 0;
    static String title;
    static int p_year;
    static String Lang;
    static String Category;

    public Book()
    {
            ISBN ++;
    }
    public Book(String T,int P,String L,String C)
    {
        this();
        title= T;
        p_year = P;
        Lang = L;
        Category =C;
    }
    

    public void display()
    {
        System.out.println();   
        System.out.println("***** Book Details********");
        System.out.println("ISBN :- " + ISBN);
        System.out.println("Title :- " + title.trim());
        System.out.println("Publication Year :- " + p_year);
        System.out.println("Language :- " + Lang.trim());
        System.out.println("Category :- " + Category.trim());
        System.out.println();
       
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
