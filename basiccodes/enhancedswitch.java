import java.util.Scanner;

public class enhancedswitch {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println(" enter the day ");
        String day = scanner.nextLine();

        switch (day){
            case "monday","tuesday","wednesday","thrusday","friday" -> System.out.println(" it id a weekday ");

            case "saturday","sunday" -> System.out.println( " it id weekend ");

            default -> System.out.println(day + " is not a day");

        }
    }
}
