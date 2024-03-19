import java.util.Scanner;

public class Max_of_three {
    public int Maxofthree(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        }
        if (b > c && b > a) {
            return b;
        } else {
            return c;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        Max_of_three m= new Max_of_three();
        System.out.println("Maximum of given three ("+a+","+b+","+c+") numbers "+ m.Maxofthree(a,b,c));
    }
}