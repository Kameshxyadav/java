import java.util.Random;

public class randomnum {
    public static void main(String[] args){

        Random random = new Random();
        int num;
        num =random.nextInt(1,6 );
        System.out.println(num);

        boolean isHeads;
        isHeads = random.nextBoolean();
        if (isHeads){
            System.out.println("hheads");

        }
        else{
            System.out.println("tails");
        }

    }
}
