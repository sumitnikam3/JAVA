import java.util.*;
public class Ass3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in); 
            System.out.println("Enter 1st Number");
            int num1 = sc.nextInt();
            System.out.println("Enter 2nd Number");
            int num2 = sc.nextInt();
            System.out.println(" Press 1 for Addition");
            System.out.println(" Press 2 for Substraction");
            System.out.println(" Press 3 for Multiplication");
            System.out.println(" Press 4 for Division");
            int s =sc.nextInt();
            int ans;
            switch (s) {
                case 1: 
                    ans=num1+num2;
                    System.out.println("Addition of "+num1+" & "+num2+ " = "+ans);
                    break;

                case 2 :
                    ans=num1-num2;
                    System.out.println("Substraction of "+num1+" & "+num2+ " = "+ans);
                    break;

                case 3 : 
                    ans=num1*num2;
                    System.out.println("Multiplication of "+num1+" & "+num2+ " = "+ans);
                    break;
                
                case 4 :
                    ans=num1/num2;
                    System.out.println("Division of "+num1+" & "+num2+ " = "+ans);
                    break;
                default:
                    System.out.println("Enter Valid Opration Number");
                    break;
            } 

        }
}
