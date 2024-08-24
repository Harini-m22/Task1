import java.util.Scanner;

public class PayableAmount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amt = sc.nextInt();
        if(amt <500){
            System.out.println("Bill Amount is " + amt);
        }
        else if(amt >=500 && amt <= 1000) {
            System.out.println("Bill Amount is " + (amt - (amt/10)));
        }
        else if(amt >1000) {
            System.out.println("Bill Amount is " + (amt - (amt/20)));
        }
    }
}
