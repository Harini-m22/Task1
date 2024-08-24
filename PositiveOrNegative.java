import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        //Using Scanner method getting input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int number=sc.nextInt();
        //System.out.println("Number is: "+number);

        //Using conditional statement finding whether the given number is positive or negative
        if(number<0){

            System.out.println("negative");
        }
        else if(number>0){
            System.out.println("positive");
        }

    }
}
