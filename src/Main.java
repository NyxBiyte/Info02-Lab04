import java.util.*;

public class Main {
    public static void main(String[] args) {

        runTime(100);

        int[] array20 = {104857, 203429, 345781, 500003, 753201, 999983, 823721, 123457, 876543, 100003,
                234567, 345679, 456787, 567891, 678901, 789013, 890123, 901231, 101111, 210987,
                319823, 423431, 534673, 645789, 756839, 867913, 978037, 1048573, 222221, 333331,
                444443, 555553, 666661, 777773, 888883, 999991, 1000000, 876941, 543211, 678679,
                100019, 192193, 373379, 839201, 920341, 129457, 839411, 754891, 143489, 765431,
                888911, 741111, 652341, 100109, 100391, 100537, 193939, 200003, 222223, 666667,
                741007, 532789, 379007, 999331, 100391, 997933, 373373, 202007, 457651, 556899,
                602323, 442111, 101377, 889777, 456787, 384857, 111111, 222333, 333555, 444777,
                555999, 667123, 778345, 889567, 123321, 654321, 987654, 135791, 246802, 357913,
                468024, 579135, 680246, 791357, 902468, 102579, 213690, 324801, 435912, 1048575};

        long[] array40 = {999999999989L, 274877906899L, 987654321001L, 100000000003L, 666666666661L,
                543210987654L, 876543210987L, 999999999771L, 214748364711L, 123456789123L,
                135791357913L, 192837465001L, 1099511627689L, 880088008800L, 100000000019L,
                754011380474L, 874512368957L, 102938475610L, 102030405060L, 118888888881L,
                104857600003L, 987654320123L, 998877665544L, 928374650123L, 777777777779L,
                876543219876L, 765432109875L, 999999888887L, 109876543211L, 100000300009L,
                112358132134L, 100000007077L, 999000111222L, 555555555559L, 443322110099L,
                888888888883L, 101010101011L, 110011001101L, 121212121213L, 131313131317L,
                999999999999L, 979797979797L, 969696969691L, 949494949493L, 939393939391L,
                929292929297L, 919191919181L, 909090909091L, 898989898983L, 888888888877L,
                101234567891L, 202345678901L, 303456789123L, 404567891011L, 505678910123L,
                606789101213L, 707891011121L, 808910111213L, 909101112131L, 101112131415L,
                987987987987L, 876876876871L, 765765765767L, 654654654653L, 543543543541L,
                432432432431L, 321321321321L, 210210210211L, 100100100101L, 200200200201L,
                300300300301L, 400400400401L, 500500500503L, 600600600601L, 700700700701L,
                800800800809L, 900900900901L, 100010001001L, 200020002003L, 300030003007L,
                400040004009L, 500050005011L, 600060006013L, 700070007019L, 800080008021L,
                900090009029L, 999000111113L, 888111222127L, 777222333137L, 666333444149L,
                555444555151L, 444555666163L, 333666777173L, 222777888181L, 111888999191L,
                100000000031L, 100000000043L, 100000000069L, 100000000087L, 100000000099L};

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100; i++) {
            int n = array20[i];
            System.out.println(n+": "+isPrime(n));
        }
        long end = System.currentTimeMillis();
        System.out.println("Dauer: " + (end - start) + " ms");



        start = System.currentTimeMillis();

        for (int i = 0; i < 100; i++) {
            long n = array40[i];
            System.out.println(n+": "+isPrime(n));
        }
        end = System.currentTimeMillis();
        System.out.println("Dauer: " + (end - start) + " ms");

        System.out.println(sieveOfEratosthenes(101));
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
    }
    
    public static boolean isPrime (long n){
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

    public static List<Integer> sieveOfEratosthenes(int n) {
        List<Integer> primesList = new ArrayList<>();



        // Assume all numbers are prime at first
        for (int i = 2; i <= n; i++) {
            primesList.add(i);
        }

        for (int i = 2; i * i <= n; i++) {
            for (int j = i * i; j <= n; j += i) {
                if (primesList.contains(j)){
                    primesList.remove(Integer.valueOf(j));
                }
            }
        }


        return primesList;
    }
}