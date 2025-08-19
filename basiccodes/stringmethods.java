public class stringmethods {
    public  static void main(String[] args) {
        String name = "Bro code";

        int length = name.length();
        char letter =name.charAt(0);
        int lastindex = name.lastIndexOf("o");
        int index = name.indexOf(" ");

        name= name.toLowerCase();
        name= name.toUpperCase();
        name= name.trim(); //uuseless space before and after a string
        name= name.replace("o", "a");

        if(name.isEmpty()){
            System.out.println("your name is empty");
        }
        else {
            System.out.println("hello");
        }
        if (name.equalsIgnoreCase("password")){
            System.out.println("your name cant be password");
        }
        else {
            System.out.println("hello " + name);
        }
    }
}
