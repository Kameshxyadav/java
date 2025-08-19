public class varargs {
    public static void main(String[]args){
        //varargs = allow a method to accept a varying argeuments
        // no need for methhhhod over load
        // java will pack argements in one array

        System.out.println(avg(1,2,3,4));
    }
    static double avg(double...numbers){
        double sum =0;

        for ( double  number : numbers){
            sum += number;

        }
        return sum/numbers.length;
    }
}
