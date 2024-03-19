//Create a method that takes in a letter and returns true if it is Vowel,false otherwise//
public class Vowel {
    public static boolean alphabets(String letter){
        String vowels ="aeiou";
        if (vowels.contains(letter)) {
            return true;
        }
            else {
                return false;
            }
        }
    public static void main(String[] args) {
        System.out.println(alphabets("I"));
    }
    }


