import java.util.Scanner;

public class ValidNo {
    public static String number (int a){
        if (a>0){
            return "positive";
        }
        if (a==0){
            return "zero";
        }
        return "negative";
    }

    public static void main(String[] args) {
        String c;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number");
            int a = scanner.nextInt();
            System.out.println(number(a));
            System.out.println("do you want to continue (y/n)?");
            scanner.nextLine();
            c = scanner.nextLine();
        } while (c.equals("y"));
    }
}
