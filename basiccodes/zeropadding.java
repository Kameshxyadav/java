public class zeropadding {
    public static void main(String[] args){
        //%[flags][width][.pricision][specifier characteer]

        //0 =zero p[adding
        //+num = right justified padding
        //-num = left justtified padding

        int id1 = 1;
        int id2 = 34;
        int id3 = 987;
        int id4 = 2345;

        System.out.printf("%04d\n", id1);
        System.out.printf("%04d\n", id2);
        System.out.printf("%04d\n", id3);
        System.out.printf("%04d\n", id4);

        System.out.printf("%4d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%4d\n", id3);
        System.out.printf("%4d\n", id4);

        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);
    }
}
