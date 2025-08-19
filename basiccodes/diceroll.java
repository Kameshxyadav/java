import java.util.Random;
import java.util.Scanner;

public class diceroll {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("entar the no of die to ro;ll ");
        int roll= scanner.nextInt();
        if(roll>0){
            for (int i=1; i<=roll; i++){
                Random random = new Random();
            int num;
            num =random.nextInt(1,7);

                System.out.println(num);
                printdie(num);
            }

        }
        else{
            System.out.println("bitch ");

        }
    }
    static void printdie(int roll){
    String dice1 = """
            ------
            |  1  |
            |     |
            ------
            """;
        String dice2 = """
            ------
            |  2  |
            |     |
            ------
            """;
        String dice3 = """
            ------
            |  3  |
            |     |
            ------
            """;
        String dice4 = """
            ------
            |  4  |
            |     |
            ------
            """;
        String dice5 = """
            ------
            |  5  |
            |     |
            ------
            """;
        String dice6 = """
            ------
            |  6  |
            |     |
            ------
            """;
        switch (roll) {
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("bitchhhh");
        }
    }
}
