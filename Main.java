import java.lang.*;

public class Main {
    public static void main(String[] args) {
        //1
        FunDD parabola1 = new Parabola(1.0, -1.0, 5/4);
        System.out.println(
            "Minimum value: " + FunDD.xminim(parabola1, 0, 1)
        );

        //2
        System.out.println(
            "Minimum value: " + FunDD.xminim(new FunDD() {
                public double fun(double x) {
                    FunDD parabola2 = new Parabola(1.0, 1.0, 1.0);
                    return Math.sqrt(( Math.pow((x - 0.75), 2) ) + 1);
                }
            }, 0, 2)
        );

        //3
        System.out.print(
            "Minimum value: " + FunDD.xminim(
                x -> Math.pow(x, 2) * (x - 2), 0, 2
            )
        );

    }
}