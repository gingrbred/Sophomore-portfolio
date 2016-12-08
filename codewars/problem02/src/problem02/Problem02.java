package problem02;
import java.util.Scanner;
public class Problem02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            System.out.println("How many gallons will you use?");
            int x = scan.nextInt();
            //take the users response and divide 10000 by it to give us how many weeks the water will last
            int weeks = 10000 / x;
            System.out.printf("%s gallons will last %s weeks", x, weeks); 
    }    
}
