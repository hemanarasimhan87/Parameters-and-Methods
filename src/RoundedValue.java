//Create a method that takes in a decimal number and returns the rounded value//
public class RoundedValue {
    public static String repeat(String text,int a ){
        String result = "";
        for (int i = 0; i<a; i++){
            result=result+text +"\n";
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(repeat("Create good memories ",14));

    }

}
