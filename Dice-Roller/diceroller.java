import java.util.Random;
import java.util.Scanner;

public class diceroller {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        int numOfdice;
        int total=0;

        System.out.print("enter the number of dice to roll : ");
        numOfdice=scanner.nextInt();

        if ( numOfdice>0) {
            for(int i=0;i<numOfdice;i++){

                int roll=random.nextInt(1,7);//1 is inplsiv and 7 is explict
                printdie(roll);
                System.out.println("you Rolled :" +roll);
                total +=roll;    
        
            }
        System.out.println("Total : "+total);
        }
        else{
            System.out.println("The number should must be greater than zero");
        }
        scanner.close();
    }
    static void printdie(int roll){
        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;

        String dice2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """;

        String dice3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;

        String dice4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;

        String dice5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;

        String dice6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;

        switch(roll){
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.print("Invalid roll");
 

    }
}
}
