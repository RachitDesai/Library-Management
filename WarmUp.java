import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class WarmUp {

    public static void main(String args[])
    {
        List<Object> list = new ArrayList<Object>();
        ArrayList<Object> arr = new ArrayList();
        Scanner sc = new Scanner(System.in);
        boolean ans = true ;
        String name;
        int roll;
        
        while(ans)
        {
            System.out.print("Enter Student Name : ");
            name = sc.next();
            System.out.print("Enter Roll Number: ");
            roll = sc.nextInt();
            
            list.add(name);
            list.add(roll);
            
            arr.add(list);

            list.remove(name);
            list.remove(roll);
           
            System.out.println("Do You want to continue ?");
            ans = sc.nextBoolean();
        }    
            
        System.out.println(arr);
    }
}


