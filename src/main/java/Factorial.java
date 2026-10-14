public class Factorial {
    public long factorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Number must be between 0 and 20");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Factorial obj = new Factorial();
        System.out.println("Factorial of 5 = " + obj.factorial(5));
    }
}
