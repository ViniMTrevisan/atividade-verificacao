public class Main {

    public static boolean is_prime(int n) {
        if (n <= 1) {
            return false; // 0, 1 e negativos não são primos
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(is_prime(7));
        System.out.println(is_prime(10));
        System.out.println(is_prime(1));
    }
}