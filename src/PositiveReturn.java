//Return in the middle: Create a method that takes in an integer. If the number //
//is negative, print "Negative number" and exit the method. Otherwise, //
//print "Positive number".//
public class PositiveReturn {
    public static void number(int a) {
        if (a < 0) {
            System.out.println("Negative number");
            return;
        }
        {
            System.out.println("Positive number");
        }
    }
    public static void main(String[] args) {

        number(147);
        }

}
