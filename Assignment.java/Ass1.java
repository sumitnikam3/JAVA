import java.util.*;
public class Ass1 {
        public static void main(String[] args) {
            System.out.println("Enter The Value");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            if (num<40){
                System.out.println("You Are Fail");
            } 
            else if (num>=40 && num <60){
                System.out.println("Your grade = B");
            }
            else if (num>=60 && num<70){
                System.out.println("Your grade = B+");
            }
            else if (num>=70 && num<75){
                System.out.println("Your grade = A");
            }
            else if (num>=75 && num<85){
                System.out.println("Your grade = A+");
            }
            else if (num>=85 && num<=100){
                System.out.println("Your grade = A++");
            }
            else {
                System.out.println("Enter Valid Marks");
            }
           // Closed.Scanner();
        }
}