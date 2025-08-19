import java.sql.SQLData;
import java.util.Scanner;

public class userinputarray {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        String[] foods;
        int size;

        System.out.println("enter no of food you want"
        );
        size = scanner.nextInt();
        scanner.nextLine();

        foods= new String[size];

        for(int i =0; i<foods.length; i++){
            System.out.println("enter food  ");
            foods[i]= scanner.nextLine();


        }
        for(String food : foods){
            System.out.println(food);
        }
    }

}
