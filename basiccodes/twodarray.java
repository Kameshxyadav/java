public class twodarray {
    public static void main(String[] args) {

        String[] fruits = {"apple", "bamama", "pineapplle"};
        String[] veges = {"loki", "baingan", "tori"};
        String[] meats = {"chicken", "pork", "beef", "fish"};
        String[][] grocries = {fruits, veges, meats};

        //to print array
        for (String[] shopp : grocries) {
            for (String shop : shopp) {
                System.out.print(shop + " ");
            }
            System.out.println();
        }

        //to repllace element
        grocries[1][2]="gogogaga";
    }
}
