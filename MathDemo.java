package Java.week06;

public class MathDemo {

    public static int min(int a, int b) {
        if (a < b) return a;
        else return b;
    }

    public static int max(int a, int b) {
        if (a > b) return a;
        else return b;
    }

    public static int sum(int[] args) {
        int s = 0;
        for (int n : args) {
            s += n;
        }
        return s;
    }

    public static float mean(int[] args) {
        if (args.length == 0) return 0;
        return (float) sum(args) / args.length;
    }

    public static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

}