/*
A method named add() accepts an array of strings as its argument. It converts these to double values
and returns their sum. The method generates a NumberFormatException if an element is
incorrectly formatted. It can also create and throw a custom exception, RangeException, if an
element is less than 10 or greater than 100. Write a program that illustrates how to declare and use
this method. Invoke the method from main(). Catch any exceptions that are thrown and display an
informative message for the user. Also, provide a finally clause to thank the user for using the
program.
*/

class RangeException extends Exception
{
	RangeException(String msg)
	{
		super(msg);
	}
}
class NumberFormatDemo{

	public static void main(String args[]){
		try{
			if(args.length==0){
				System.out.println("Please provide arguments !");
				System.exit(1);
			}
			else{
				System.out.println("\nThe sum is : "+add(args));
			}
		}
		catch(NumberFormatException ne){
			System.out.println(ne.getMessage());
		}
		catch(RangeException re){
			System.out.println(re.getMessage());
		}
		finally{
			System.out.println("Thanks for using program");
		}	
	}
	static double add(String s[]) throws
	NumberFormatException,RangeException
	{
		double d[]=new double[s.length];
		int i=0;
		double sum=0;
		for(i=0;i<s.length;i++){
			d[i]=Double.parseDouble(s[i]);
			if(d[i]<10||d[i]>100)
				throw new RangeException("Number must be in the range");
			sum+=d[i];
		}
		return sum;
	}
}