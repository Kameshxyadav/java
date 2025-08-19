import java.util.Random;
import java.util.Scanner;

public class slotmachine {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        int balance =100;
        int bet;
        int payout;
        String[] row;

        System.out.println(" welcome to java slot");
        System.out.println(" symbols : 🍒 🍉 🍋 🔔 ⭐ ");

        while(balance > 0){
            System.out.println("current amount " + balance);
            System.out.println("bet amount ??");
            bet = scanner.nextInt();

            if(bet > balance){
                System.out.println("indufficient funds");
            } else if (bet<=0) {
                System.out.println("bet cant be negative");

            } else {
                balance -= bet;
            }
            System.out.println("wspinning....");
            row = spinRow();
            printRow(row);
            payout = getPayout(row,bet);

            if(payout > 0){
                System.out.println( " you woon " + payout);
                balance += payout;
            }
            else {
                System.out.println("sorryyy u lost");
            }

        }


    }
    static String[] spinRow(){
        String[] symbols = {"🍒", "🍉", "🍋", "🔔", "⭐"};
        String[] row = new String[3];
        Random random = new Random();

        for (int i =0; i<3; i++){
            row[i]= symbols[random.nextInt(symbols.length)];

        }
        return row;
    }
    static void printRow(String[] row){
        System.out.println(" " + String.join(" | ", row));
    }
    static int getPayout(){
        if(row[0].equals(row[1])&& row[1].equals(row[2]) ){
            return switch(row[0]){
                case "🍒"-> bet*3;
                case "🍉"-> bet*4;
                case  "🍋",-> bet*5;
                case  "🔔",-> bet*10;
                case  "⭐"-> bet*20;
                default -> 0;
            }
        }
        else if(row[1].equals(row[2]) ){
            return switch(row[0]){
                case "🍒"-> bet*2;
                case "🍉"-> bet*3;
                case  "🍋",-> bet*4;
                case  "🔔",-> bet*5;
                case  "⭐"-> bet*10;
                default -> 0;
    }
}
