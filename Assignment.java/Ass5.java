import java.util.*;
public class Ass5 {
        public static void main(String[] args) {
            
            System.out.print("Enter The Character  =  ");
            Scanner sc = new Scanner(System.in);
            char a = sc.next().charAt(0);
            if (a=='A'|| a=='a' || a=='E' || a=='e' || a=='i' || a=='I' || a=='O' || a=='o' || a=='u' || a=='U'){

                System.out.println("The Character Is vowel");
            }
            else {
                System.out.println("The Character Is not a vowel");
            }
        }    
}
