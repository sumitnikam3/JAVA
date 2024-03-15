import java.util.Scanner;
public class check{
  public static void main(String[] args)
    {
       // public static void main(String[] strings) {
            Scanner input = new Scanner(System.in);
            int number_Of_DaysInMonth = 0; 
            String MonthOfName = "Unknown";
            int month = input.nextInt();
            //Write your logic here
            switch (month) {
                case 1 :
                    System.out.println("January 31Days");
                    break;
    
                    case 2 :
                    System.out.println("February 28Days");
                    break;
    
                    case 3 :
                    System.out.println("March 31Days");
                    break;
    
                    case 4 :
                    System.out.println("April 30Days");
                    break;
                    
                    case 5 :
                    System.out.println("May 31Days");
                    break;
                    
                    case 6 :
                    System.out.println("June 30Days");
                    break;
                    
                    case 7 :
                    System.out.println("July 31Days");
                    break;
                    
                    case 8 :
                    System.out.println("August 31Days");
                    break;
                    
                    case 9 :
                    System.out.println("September 31Days");
                    break;
                    
                    case 10 :
                    System.out.println("October 31Days");
                    break;
                    
                    case 11 :
                    System.out.println("November 30Days");
                    break;
                    
                    case 12 :
                    System.out.println("December 31Days");
                    break;
      }
    }
}
