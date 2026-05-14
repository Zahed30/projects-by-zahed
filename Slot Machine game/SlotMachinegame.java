import java.util.Random;
import java.util.Scanner;

public class SlotMachinegame {
    public static void main(String[] args) {
    {
        //java slot machine

        Scanner scanner=new Scanner(System.in);

        //declare variable
        int balance=100;
        int bet;
        int payout;
        String[]row;
        String playAgain;

        //display welcome message
        System.out.println("************************************************************");
        System.out.println("     Welcome to the Slot Machine App!            ");
        System.out.println("       Symbols:🍋 🍑 🍒 🍓 🍌                   ");
        System.out.println("************************************************************");

        //play if balance>0
        while (balance>0){
            System.out.println("Current balance: $"+balance);
        //enter bet amount
            System.out.print("Enter Bet amount :$");
            bet=scanner.nextInt();
            scanner.nextLine();
            //verify if bet>balance
            if(bet>balance){
                System.out.println("INSUFFICIENT BALANCE");
                continue;
            //verify if bet>0
            } else if (bet<=0) {
                System.out.println("Bet amount must be greater than 0.");
                continue;
            }else {
             //subtract bet from balance
                balance-=bet;
            }
        //spin row
            System.out.println("Spinning...........");
            row=Spinrow();
        //print row
            printRow(row);
        //get payout
            payout = getpayout(row, bet);

            if(payout > 0){
                System.out.println("You won $" + payout);
                balance += payout;
            }
            else{
                System.out.println("Sorry you lost this round");
            }

        //ask to play
            System.out.print("Do you want to play again? (Y/N): ");
            playAgain = scanner.nextLine().toUpperCase();

            if(!playAgain.equals("Y")){
                break;
            }
        }
        //display exit message
        System.out.println("GAME OVER! Your final balance is $" + balance);
        scanner.close();
        }
    }
    static String[] Spinrow(){
        String[] symbols={"🍋" ,"🍑" ,"🍒" ,"🍓" ,"🍌"};
        String[]row=new String[3];
        Random random=new Random();
        for(int i = 0; i < 3; i++){
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        return row;
    }
    static void printRow(String[] row){
        System.out.println("**************");
        System.out.println(" "+String.join(" | ",row));
        System.out.println("**************");
    }
    static int getpayout(String []row,int bet) {
        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch (row[0]) {
                case "🍒" -> bet * 3;
                case "🍓" -> bet * 4;
                case "🍋" -> bet * 5;
                case "🍑" -> bet * 10;
                case "🍌" -> bet * 20;
                default -> 0;
            };
        } else if (row[0].equals(row[1])) {
            return switch (row[0]) {
                case "🍒" -> bet * 2;
                case "🍓" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🍑" -> bet * 5;
                case "🍌" -> bet * 10;
                default -> 0;
            };
        } else if (row[1].equals(row[2])) {
            return switch (row[1]) {
                case "🍒" -> bet * 2;
                case "🍓" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🍑" -> bet * 5;
                case "🍌" -> bet * 10;
                default -> 0;

            };
        }
            return 0;
    }
}
