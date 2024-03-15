import java.util.*;
public class Ass6 {
    public static void main(String[] args) {
        System.out.println("Enter A Weight in KG.");
        Scanner sc = new Scanner(System.in);
        float w= sc.nextFloat();
        System.out.println("Enter A Height In CM.");
        float h= sc.nextFloat();
        float hm = h/100;
        float  bmi = w/(hm*hm);
        if (bmi<=18.5){
            System.out.println("Underweight");           
        }
        else if (bmi<=24.9){
            System.out.println("Healthy Weight");     
         }
        else if (bmi>=24.9){
            System.out.println("Overweight");
        }
    
    }    
}
