public class MinMaxCalculation {
    public static void main(String[] args) {
        // Initialise variables
        int x = 9;
        int y = -9;

        //Print values of functions
        System.out.println(calcMax(x,y));
        System.out.println(calcMin(x,y));
    }

    // Function to calculate maximum value
    public static void calcMax(int a, int b) {
        return Math.max(a,b)
    }

    // Function to calculate maximum value
    public static void calcMin(int a, int b) {
        return Math.min(a,b)
    }
}