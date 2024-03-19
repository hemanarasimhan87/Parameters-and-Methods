public class Length_of_String {

    public static void main(String[] args) {
        String name = "Hejsan you are doing great";
        char[] length = name.toCharArray();
        int i = 0;
        for (char id : length) i++;//for each//
        System.out.println("Length of a string is :" + i);
    }
}