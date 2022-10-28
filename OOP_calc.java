import java.util.Scanner;

public class OOP_calc {
    static void addition(double x, double y) {
            System.out.println("The sum is: " + (x + y));
    }
    static void subtraction(double x, double y){
        System.out.println("The difference is: "+(y-x));
    }
    static void division(double x, double y){
        System.out.println("The quotient is: "+(x/y));
    }
    static void multiplication(double x, double y){
        System.out.println("The product is: "+(x*y));
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Welcome to the basic calculator.\nPlease input the operation symbol you want to execute (+, -, *. /): ");
        String option = scanner.next();

        if(option.equals("+")){
            System.out.print("Please input the first values you want to add: ");
            String sumVal1 = scanner.next();
            System.out.print("Please input the second value you want to add: ");
            String sumVal2 = scanner.next();
            int addNumber1 = Integer.parseInt(sumVal1);
            int addNumber2 = Integer.parseInt(sumVal2);

            addition(addNumber1, addNumber2);
        } else if (option.equals("-")) {
            System.out.print("Please input the value you want to subtract: ");
            String diffVal1 = scanner.next();
            System.out.print("Please input the value you want to subtract from: ");
            String diffVal2 = scanner.next();
            int diffNumber1 = Integer.parseInt(diffVal1);
            int diffNumber2 = Integer.parseInt(diffVal2);

            subtraction(diffNumber1, diffNumber2);
        } else if (option.equals("*")) {
            System.out.print("Please input the first value you want to multiply: ");
            String prodVal1 = scanner.next();
            System.out.print("Now input the next value: ");
            String prodVal2 = scanner.next();
            int prodNumber1 = Integer.parseInt(prodVal1);
            int prodNumber2 = Integer.parseInt(prodVal2);
            
            multiplication(prodNumber1, prodNumber2);
        } else if (option.equals("/")) {
            System.out.print("Please input the dividend: ");
            String quotientVal1 = scanner.next();
            System.out.print("Now input the divisor: ");
            String quotientVal2 = scanner.next();
            int quotientNumber1 = Integer.parseInt(quotientVal1);
            int quotientNumber2 = Integer.parseInt(quotientVal2);

            division(quotientNumber1,quotientNumber2);
        }

    }
    
}
