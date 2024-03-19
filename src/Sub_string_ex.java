import java.util.Scanner;

public class Sub_string_ex {
    public static String substringex(int start, int end, String name){
    return name.substring(start,end);

    }
    public static void main(String[] args) {
//        Scanner scanner =new Scanner(System.in);
//        System.out.println("Enter the String");
//        String name = scanner.nextLine();
//        System.out.println("Enter the Start position");
//        int start=scanner.nextInt();
//        System.out.println("Enter the end position");
//        int end=scanner.nextInt();
        String name ="Happy Diwali to all";
        int start=4;
        int end =17;
        System.out.println("Substring of string("+name+"):"+substringex(start,end,name));
    }

}
