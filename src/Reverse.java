public class Reverse {
    public static String reverse_ex(String name) {
        String reversed = "";
        for (int i = name.length() - 1; i >= 0; i--) {

            reversed = reversed + name.charAt(i);

        }
        return reversed;
    }

    public static void main(String[] args) {
        System.out.println(reverse_ex("Hema"));
    }
}