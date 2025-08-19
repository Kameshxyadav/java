import java.util.Scanner;

public class substring {
    public  static void main(String[] args){

        //.substring() =a method used to extract a portion of a string

        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.println("enter your emial ");

        email = scanner.nextLine();
        username = email.substring(0, email.indexOf("@"));
        domain = email.substring(email.indexOf("@")+1);

        System.out.println(username);
        System.out.println(domain);

        scanner.close();
    }
}
