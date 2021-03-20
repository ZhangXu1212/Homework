class Solution {
    public double myPow(double x, int n) {
        return n >= 0 ? qucikPow(x, n) : qucikPow(1.0 / x, -n);
    }
    public double qucikPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }
        if (x == 1) {
            return x;
        }
        double y = qucikPow(x, n/2);
        return n % 2 == 0 ? y * y : y * y * x;
    }
}