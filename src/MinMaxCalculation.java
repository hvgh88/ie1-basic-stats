public class MinMaxCalculation {
    public static void main(String[] args) {
        int x = 9;
        int y = -9;
        System.out.println(calcMax(x,y));
        System.out.println(calcMin(x,y));
    }

    public static void calcMax(int a, int b) {
        return Math.max(a,b)
    }

    public static void calcMin(int a, int b) {
        return Math.min(a,b)
    }
}