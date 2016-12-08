
import java.util.Arrays;
import java.util.Scanner;
        
public class NewEmpty {

    public static void main(String[] args) {  
        //new 2D array
        ArrayXSize XSize = new ArrayXSize();
        ArrayYSize YSize = new ArrayYSize();
        char[][] matt = new char [5] [5];

        for (int i = 0; i < matt.length; i++) {
            Arrays.fill(matt[i], '*');
        }
        
        for (int i = 0; i < matt.length; i++){
            for (int j = 0; j < matt.length; j++){        
                System.out.print(matt[i][j]);
            }
            System.out.println("*");
}
}
    
    static class ArrayXSize{
        public static void main(String[] args){
        //take user input to define the Array's X size
        Scanner scan1 = new Scanner(System.in);
        int x = scan1.nextInt();
        
            System.out.println("How wide would you like the array?");
            
}

//    int getX(){
//        return this.x;
//}
        
    
}

    static class ArrayYSize{
        public static void main(String[] args){
        //take user input to define the Array's Y size
        Scanner scan1 = new Scanner(System.in);
        int YSize = scan1.nextInt();
            System.out.println("How long would you like the array?");
    }
}
}
/****IF you believe you are done - begin work on a 2D array i.e. char [] [] landscape = new char[10][10];
Then move the characters through x and y.
*/
