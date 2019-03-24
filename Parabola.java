import java.lang.*;

public 
    class Parabola
    implements FunDD {

    double a, b, c;
    public Parabola (double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double fun(double x) {
        return (a * Math.pow(x, 2)) + b * x + c;
    }



    public static void test(String[] args) {
        System.out.println("Basic parabola value: ");
        Parabola parabola = new Parabola(1.0, 2.0, 3.0);
        System.out.println(parabola.fun(0));
    }

}