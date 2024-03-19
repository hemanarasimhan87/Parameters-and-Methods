public class VowelCount {
    public static int vowels(String name){
        int count =0;
        for(int i=0;i<name.length();i++){
            char con=Character.toLowerCase(name.charAt(i));

       if(con == 'a'||con=='e'||con=='i'||con=='o'||con=='u'){
            count++;
        }
        }
        return count++;
    }

    public static void main(String[] args) {
        System.out.println(vowels("silver spoon"));
    }
}
