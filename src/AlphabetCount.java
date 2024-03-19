//Create a method that takes in a sentence and returns the number of words in it//
public class AlphabetCount {
    public static int text(String sentence) {
        char[] length = sentence.toCharArray();
        int i = 0;
        for (char id : length)
            i++;
            return i;
    }
    public static void main(String[] args) {
        System.out.println(text("Happy Birthday"));
    }
}
