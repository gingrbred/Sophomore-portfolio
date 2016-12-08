import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Cupp_Java3_Extra {
static Random rand = new Random();
    public static void main(String[] args) {  
    //use scanner to ask what character the player wants to use
    Scanner character = new Scanner(System.in);
        System.out.println("What do you want your character to be?");
            String user = character.nextLine();
            char userchar=user.charAt(0);
        //new 2D array
    System.out.println(" ");
    Player player = new Player(rand.nextInt(10), rand.nextInt(10), 100, userchar);
    Trap Bomb = new Trap(rand.nextInt(10),rand.nextInt(10),10, '*');
    int tempx;
    int tempy;
    char[][] matt = new char [10] [10];
        for (char[] matt1 : matt) {
            Arrays.fill(matt1, '.');
        }        
        //print the player
        matt[player.playerx][player.playery] = player.symbol;
        //print the trap
        matt[Bomb.trapx][Bomb.trapy] = Bomb.getSymbol();
        for (char[] matt1 : matt) {
            for (int j = 0; j < matt.length; j++) {
                System.out.print(matt1[j]);
            }
        for (char[] matt2 : matt) {
            for (int j = 0; j < matt.length; j++){
                    if(matt[player.playerx][player.playery] == matt[Bomb.trapx][Bomb.trapy]){
                        
                }
                
            }
            }
            System.out.println(" ");
        }        
}
//player begins here
static class Player{
    char symbol;
    int playerx;
    int playery; 
    int playerhp;   
public Player(int a, int b, int c, char d ){
    playerx = a;
    playery = b;
    playerhp = c;
    symbol = d; 
}
 void setX(int a){
    this.playerx = a;
}
 void setY(int b){
    this.playery = b;
}
 char getSymbol(){
     return this.symbol;
}
 int getW(){
     return this.playerx;
}
}
//players end here
//Traps begin here
static class Trap{
    char symbol = '*';
    int trapx;
    int trapy;
    int traphp;
public Trap(int bombX, int bomby, int bombhp, char t ){
    trapx = bombX;
    trapy = bomby;
    traphp = bombhp;
    symbol = t;
}
void settrapX(int bombX){
    this.trapx = bombX;
}
void settrapy(int bomby){
    this.trapy = bomby;
}
void settraphp(int bombhp){
    this.traphp = bombhp;
}
char getSymbol(){
    return this.symbol;
}
int getbombX(){
    return this.trapx;
}
int getbomby(){
    return this.trapy;
}
int getbombhp(){
    return this.traphp;
}
}
//static class Failsafe{
//    if(Trap.getbombX == Player.getX){
//    Trap.trapx += 1;
//    Trap.trapy += 1;
//}
//
// static else{
//        System.out.println("Welcome Player!");
//}
//}
}