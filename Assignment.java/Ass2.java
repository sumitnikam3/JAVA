import java.util.*;

public class Ass2{
        public static void main(String[] args) {
            int nyear=1;
            System.out.println("Enter The Year");
            Scanner sc = new Scanner(System.in);
            int year = sc.nextInt();
            if (year%4==0){
                    System.out.println(year+" this is a leap year");
                    nyear = 0;
                   
            }
            else if (year%100==0){
                    System.out.println(year+" this is a leap year");
                    nyear = 0;
            }
            else if (year%400==0){
                System.out.println(year+" this is a leap year");
                nyear = 0;
        }
            else{
                System.out.println(year+" this is not a leap year");
                nyear = 1;
            }
            
            switch (nyear) {
                case 0: System.out.println("This is leap year");
                    break;
            
                default: System.out.println("This Is Not A Leap Year");
                    break;
            }
        }
        

}