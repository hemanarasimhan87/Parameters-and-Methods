public class PrimeNo {
    public static boolean prime(int a){
        if (a%2 !=0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(prime(47));

    }
}
