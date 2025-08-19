import java.util.Arrays;

public class array {
    public static void main(String[]args){
        String[] fruits = {"apple","bananna","orange","coconut"};
        int numOfFruits = fruits.length;

        Arrays.sort(fruits); //to sort array elements alphabetically
        Arrays.fill(fruits,"noappple");

        for (String fruit : fruits){
            System.out.println(fruit);
        }



    }
}
