//Create a method that takes an integer and returns the nearest rounded value//
public class Value{

    public static int number(double x){

        return (int)Math.round(x);
    }

    public static void main(String[] args) {
        System.out.println(number(12.17));
    }
}

