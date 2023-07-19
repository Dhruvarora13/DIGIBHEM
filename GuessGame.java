import java.util.Scanner;
import java.util.Random;
class Game{
   public int number;
   public int inputNumber;
    public int numberOfGuesses;
    public int getnumberOfGuesses(){
        return numberOfGuesses;
    }
    public void setnumberOfGuesses(int noOfGuesses){
        this.numberOfGuesses = noOfGuesses;
    }
     Game(){
        Random r = new Random();
        this.number = r.nextInt(100);
    }
    void takeNumber(){
        Scanner sc = new Scanner (System.in);
        System.out.println("...............Enter the number of your choice................\n");
         inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber(){
        if( inputNumber == number){
            System.out.println("Hurrah !! You entered the correct number !!");
            return true;
        }
        else if (inputNumber < number){
            System.out.println("Ooopsss.... the number is too low");
        }
        else if(inputNumber > number){
            System.out.println(" Number entered is too high...");
        }
        return false;
    }
}

public class GuessGame {
    public static void main(String args[]){
        Game s = new Game();
        boolean d = false;
        while(!d) {
            s.takeNumber();
            d = s.isCorrectNumber();
            System.out.println(d);
        }
    }
}