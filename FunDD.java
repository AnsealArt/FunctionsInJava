@FunctionalInterface
interface FunDD {
    public double fun(double x);

    static double xminim(FunDD f, double a, double b) {
        double jump = 0.00001d;
        double minArg = a;

            for(double x = a; x <= b; x += jump) {
                if(f.fun(x) < f.fun(minArg)) {
                    minArg = x;      
                }
            }
        return minArg;
    }
}