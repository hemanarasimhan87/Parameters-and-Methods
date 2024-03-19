public class Temperature {
    public static double temp(double d){
        return (d*9/5)+32;
    }

    public static void main(String[] args) {
        double d=7;
        double f= temp(d);

        System.out.println(f);
    }
}
