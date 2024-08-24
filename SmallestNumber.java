import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        //creating an array to get 3 numbers
        int[] numbers = new int[3];
        Scanner sc = new Scanner(System.in);
        numbers[0] = sc.nextInt();
        numbers[1] = sc.nextInt();
        numbers[2] = sc.nextInt();
        // creating a variable to store smallest number
        int smallest = 0;
        //sample input : 10 3 4
        // Below for loops to compare the value
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < i+1 ; j++) {
                if(numbers[i] > numbers[j]) {
                    smallest = numbers[j];
                }
            }

        }
        System.out.println(smallest);


    }
}
