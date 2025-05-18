public class Main {
    public static void main(String[] args) {

        runTime(6);

        System.out.println(isPrime(5));
    }

    public static void runTime (int n){
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum++;
        }
        System.out.println(sum);
        sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum++;
            }
        }
        System.out.println(sum);
        sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                sum++;
            }
        }
        System.out.println(sum);
        sum = 0;

        for (int i = 0; i < n; i++) {
            sum++;
            for (int j = 0; j < n; j++) {
                sum++;
            }
        }
        System.out.println(sum);
        sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n*n; j++) {
                sum++;
            }
        }
        System.out.println(sum);
        sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        System.out.println(sum);
        sum = 0;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n*n; j++) {
                if (j % i == 0) {
                    for (int k = 0; k < j; k++) {
                        sum++;
                    }
                }
            }
        }
        System.out.println(sum);
        sum = 0;

        int i = n;
        while (i > 1) {
            i = i / 2;
            sum++;
        }
        System.out.println(sum);
        sum = 0;
    }
    
    public static boolean isPrime (int n){
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }


        if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}