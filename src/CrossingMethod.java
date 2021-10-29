public class CrossingMethod {

    public static double f(double x) {
        return x * x - 5;
    }

    public static double bisection(double a, double b, double eps) {
        double error = 0.5;
        double c = -1;
        int i = 0;
        System.out.println("i\t\t\t\t\t\ta\t\t\t\t\t\tb\t\t\t\t\t\tc\t\t\t\t\t\tf(a)\t\t\t\t\t\tf(b)\t\t\t\t\t\tf(c)\t\t\t\t\t\terror");
        while (error > eps) {
            c = (a + b) / 2;
            System.out.println(i + "\t\t\t\t\t\t" + a + "\t\t\t\t\t\t" + b + "\t\t\t\t\t\t" + c + "\t\t\t\t\t\t" + f(a) + "\t\t\t\t\t\t" + f(b) + "\t\t\t\t\t\t" + f(c) + "\t\t\t\t\t\t" + error);
            if (f(c) * f(a) < 0)     b = c;
             else  a = c;
            error /= 2;
            i++;
        }
        System.out.println("ans = " + c);
        return c;

    }
    public static void main(String[] args) {

        bisection(2., 3, 0.01);
    }
}
