public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor (int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int divisorOfFirst = 1;
        int divisorOfSecond = 1;
        int commonDivisor = 1;

        System.out.print("Divisor of " + first + " = ");
        for (int i=1; i <= first; i++ ) {
            if (first % i == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.print("Divisor of " + second + " = ");
        for (int i=1; i <= second; i++ ) {
            if (second % i == 0) {
                System.out.print(i + " ");
            }
        }

        for (int i=1; i <= first; i++ ) {
            if (first % i == 0) {
                divisorOfFirst = i;
                for (int j = 1; j <= second; j++) {
                    if (second % j == 0) {
                        divisorOfSecond = j;
                        if (divisorOfFirst == divisorOfSecond) {
                            commonDivisor = divisorOfFirst;
                        }
                    }
                }
            }
        }
        System.out.println();
        return commonDivisor;
    }
}
