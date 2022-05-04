package paccount;

public class empManagement extends Account 
{
    private static double getSal(double salary)
    {
        return salary;
    }

    public static class Salary
    {
        static double final_sal()
        {
            if(empManagement.getSal(salary) >= 20000)
                return  Account.salary - (Account.salary*0.1);
            else
                return Account.salary;
        }
    }

    public void details()
    {
        empName = "Zakir";
        empNum = "9586038522";
        empEmail = "zakir@gmail.com";
        empAge = 28;
    
        System.out.println("\n*******Employee Details*********\n");
        System.out.println("Name :- " + empName);
        System.out.println("Number :- " + empNum);
        System.out.println("Email :- " + empEmail);
        System.out.println("Age :- " + empAge);
        System.out.println("Initial Salary :- "+super.salary);
        System.out.println("current Salary :- "+Salary.final_sal());
    }
    
}