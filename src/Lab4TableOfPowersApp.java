import java.util.Scanner;

public class Lab4TableOfPowersApp {

	public static void main(String[] args) {
		

        Scanner sc = new Scanner(System.in);
		 System.out.println("Learn your squares and cubes!");

	        String userContinue = "y";

	        do
	        {
	            
	            System.out.print("Enter an integer: ");
	            int integer = sc.nextInt();

	            
	            String header = "Number  " + "Squared " + "Cubed   " + "\n"
	                        +   "======  " + "====== " + "======   ";
	            System.out.println(header);

	            int square = 0;
	            int cube = 0;

	            String row = "";
	            for (int i = 1; i <= integer; i++)
	            {

	                square = i * i;
	                cube = i * i * i;

	                row = i + "       " + square + "       " + cube;
	                System.out.println(row);
	            }

	            // See if the user wants to continue
	            System.out.print("Continue? (y/n): ");
	            userContinue = sc.next();
	           

	        }
	        while (userContinue.equals("y") || userContinue.equals("Y")); 
	        System.out.println("Bye!");
	        sc.close();
	}

}
