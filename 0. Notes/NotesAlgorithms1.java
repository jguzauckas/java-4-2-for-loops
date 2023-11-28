public class NotesAlgorithms1 {
    public static boolean divisibility(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return true;
            }
        }
        return false;
    }

    public static void places(int number) {
        for (; number > 0; number /= 10) {
            System.out.println(number % 10);
        }
    }

    public static int countPrimes(int max) {
        int count = 0;
        for (int i = 2; i <= max; i++) {
            if (divisibility(i) == false) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(divisibility(11));
        System.out.println(divisibility(15));
        places(153);
        places(123456);
        System.out.println(countPrimes(100));
        System.out.println(countPrimes(1000));
    }
}
