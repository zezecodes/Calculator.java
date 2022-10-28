import java.util.Scanner;
import java.lang.Math;

public class Roots {
    public static void main(String[] args){
        
        int coefficient1, coefficient2, coefficient3;
        int disc;
        double root1, root2; 
        
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Please input your coefficients: ");
            coefficient1 = input.nextInt();
            coefficient2 = input.nextInt();
            coefficient3 = input.nextInt();
        }
        disc = coefficient1 * coefficient1 - 4 * coefficient1 * coefficient3;
        System.out.println("The discriminant is: " + disc);
        if(disc == 0){
            root1 = root2 = coefficient2 / 2 * coefficient1;
            System.out.println("Roots are equal and are" + root1 + "and" + root2);
        }
        else if(disc > 0){
            root1 = (-coefficient2 + Math.sqrt(disc)) / (2 * coefficient1);
            root2 = (coefficient2 + Math.sqrt(disc)) / (2 * coefficient1);
            System.out.println("Roots are unequal and are" + root1 + "and" + root2);
        }else if(disc < 0){
            System.out.println("The roots are invalid");
        }
        
    }
}
